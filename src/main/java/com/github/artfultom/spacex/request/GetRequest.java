package com.github.artfultom.spacex.request;

import com.github.artfultom.spacex.SpaceXClient;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.stream.Collectors;

public class GetRequest extends GenericRequest {

    public GetRequest(SpaceXClient client) {
        super(client);
    }

    @Override
    public GetResponse execute() throws IOException {
        HttpGet httpGet = new HttpGet(this.getEntireUrl());
        CloseableHttpResponse response = this.client.getHttpClient().execute(httpGet);
        HttpEntity entity = response.getEntity();

        int code = response.getStatusLine().getStatusCode();
        String body = EntityUtils.toString(entity);

        return new GetResponse(code, body);
    }

    public String getEntireUrl() {
        String result = this.requestUrl;

        if (this.parameters.size() > 0) {
            String parametersStr = String.join(
                    "&",
                    this.parameters.values().stream()
                            .map(parameter -> parameter.getName() + "=" + parameter.getValue())
                            .collect(Collectors.toList())
            );

            result = result.concat("?").concat(parametersStr);
        }

        return result;
    }
}
