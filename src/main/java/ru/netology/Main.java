package ru.netology;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        CloseableHttpClient client = HttpClientBuilder.create()
                .setUserAgent("Browser: Firefox")
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();

        HttpGet request = new HttpGet("https://cat-fact.herokuapp.com/facts");

        CloseableHttpResponse response;
        try {
            response = client.execute(request);

            List<FactAboutCats> listFactsAboutCats = mapper.readValue(
                    response.getEntity().getContent(),
                    new TypeReference<List<FactAboutCats>>() {
            });

            listFactsAboutCats.sort((o1, o2) -> o2.getCreatedAt().compareTo(o1.getCreatedAt()));
            listFactsAboutCats.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
