package com.github.artfultom.spacex.v4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.artfultom.spacex.SpaceXClient;
import com.github.artfultom.spacex.request.GetRequest;
import com.github.artfultom.spacex.request.GetResponse;
import com.github.artfultom.spacex.v4.dto.CompanyResponseDto;

import java.io.IOException;

public class V4Client extends SpaceXClient {

    private final String prefix = "v4";

    public boolean check() throws IOException {
        GetResponse response = new GetRequest(this).execute();

        return response.getCode() == 200;
    }

    public CompanyResponseDto company() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("company")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), CompanyResponseDto.class);
    }

}
