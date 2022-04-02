package com.github.artfultom.spacex;

import com.github.artfultom.spacex.v4.V4Client;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.Closeable;
import java.io.IOException;

public class SpaceXClient implements Closeable {

    private String url = "https://api.spacexdata.com";

    private final CloseableHttpClient httpClient;

    public static V4Client createV4() {
        return new V4Client();
    }

    protected SpaceXClient() {
        this.httpClient = HttpClients.createDefault();
    }

    @Override
    public void close() throws IOException {
        if (this.httpClient != null) {
            this.httpClient.close();
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CloseableHttpClient getHttpClient() {
        return httpClient;
    }
}
