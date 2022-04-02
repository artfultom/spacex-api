package com.github.artfultom.spacex.v4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.artfultom.spacex.SpaceXClient;
import com.github.artfultom.spacex.request.GetRequest;
import com.github.artfultom.spacex.request.GetResponse;
import com.github.artfultom.spacex.v4.dto.response.CapsuleDto;
import com.github.artfultom.spacex.v4.dto.response.CompanyDto;
import com.github.artfultom.spacex.v4.dto.response.CoreDto;
import com.github.artfultom.spacex.v4.dto.response.CrewDto;

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

    public List<CoreDto> cores() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("cores")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<CoreDto>>(){});
    }

    public CoreDto cores(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("cores")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), CoreDto.class);
    }

    // TODO cores query https://github.com/r-spacex/SpaceX-API/blob/master/docs/cores/v4/query.md

    public List<CrewDto> crew() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("crew")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<CrewDto>>(){});
    }

    public CrewDto crew(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("crew")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), CrewDto.class);
    }

    // TODO crew query https://github.com/r-spacex/SpaceX-API/blob/master/docs/crew/v4/query.md
}
