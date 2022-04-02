package com.github.artfultom.spacex;

import com.github.artfultom.spacex.request.GetRequest;
import com.github.artfultom.spacex.request.GetResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.Closeable;
import java.io.IOException;

public class SpaceXClient implements Closeable {

    private String url = "https://api.spacexdata.com";
    private String prefix;

    private final CloseableHttpClient httpClient;

    public static SpaceXClient createV4() {
        SpaceXClient client = new SpaceXClient();
        client.prefix = "v4";

        return client;
    }

    private SpaceXClient() {
        this.httpClient = HttpClients.createDefault();
    }

    public boolean check() throws IOException {
        GetResponse response = new GetRequest(this).execute();

        return response.getCode() == 200;
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
