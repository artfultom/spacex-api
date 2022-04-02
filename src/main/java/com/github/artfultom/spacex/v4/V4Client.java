package com.github.artfultom.spacex.v4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.artfultom.spacex.SpaceXClient;
import com.github.artfultom.spacex.request.GetRequest;
import com.github.artfultom.spacex.request.GetResponse;
import com.github.artfultom.spacex.v4.dto.response.CapsuleDto;
import com.github.artfultom.spacex.v4.dto.response.CompanyDto;

import java.io.IOException;
import java.util.List;

public class V4Client extends SpaceXClient {

    private final String prefix = "v4";

    public boolean check() throws IOException {
        GetResponse response = new GetRequest(this).execute();

        return response.getCode() == 200;
    }

    public List<CapsuleDto> capsules() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("capsules")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<CapsuleDto>>(){});
    }

    public CapsuleDto capsules(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("capsules")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), CapsuleDto.class);
    }

    // TODO capsules query https://github.com/r-spacex/SpaceX-API/blob/master/docs/capsules/v4/query.md

    public CompanyDto company() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("company")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), CompanyDto.class);
    }

}
