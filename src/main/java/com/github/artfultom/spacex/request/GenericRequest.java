package com.github.artfultom.spacex.request;

import com.github.artfultom.spacex.SpaceXClient;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class GenericRequest {

    protected SpaceXClient client;

    protected String requestUrl = "";

    protected Map<String, NameValuePair> parameters = new LinkedHashMap<>();

    public GenericRequest(SpaceXClient client) {
        this.requestUrl = client.getUrl();

        this.client = client;
    }

    public GenericRequest append(String part) {
        if (this.requestUrl.endsWith("/")) {
            this.requestUrl = this.requestUrl.substring("/".length());
        }

        if (part.startsWith("/")) {
            part = part.substring("/".length());
        }

        this.requestUrl = this.requestUrl.concat("/").concat(part);

        return this;
    }

    public GenericRequest addParameter(String name, String value) {
        this.parameters.put(name, new BasicNameValuePair(name, value));

        return this;
    }

    public abstract GetResponse execute() throws IOException;
}
