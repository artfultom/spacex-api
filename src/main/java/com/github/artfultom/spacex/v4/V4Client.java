package com.github.artfultom.spacex.v4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.artfultom.spacex.SpaceXClient;
import com.github.artfultom.spacex.request.GetRequest;
import com.github.artfultom.spacex.request.GetResponse;
import com.github.artfultom.spacex.v4.dto.response.*;

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

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/capsules/v4/

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

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/cores/v4/

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

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/crew/v4/

    public List<DragonDto> dragons() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("dragons")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<DragonDto>>(){});
    }

    public DragonDto dragons(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("dragons")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), DragonDto.class);
    }

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/dragons/v4/

    public List<LandpadDto> landpads() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("landpads")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<LandpadDto>>(){});
    }

    public LandpadDto landpads(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("landpads")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), LandpadDto.class);
    }

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/landpads/v4/

    public List<LaunchDto> launches() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("launches")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<LaunchDto>>(){});
    }

    public LaunchDto launches(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("launches")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), LaunchDto.class);
    }

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/launches/v4/

    public List<LaunchpadDto> launchpads() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("launchpads")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<LaunchpadDto>>(){});
    }

    public LaunchpadDto launchpads(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("launchpads")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), LaunchpadDto.class);
    }

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/launchpads/v4/

    public List<PayloadDto> payloads() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("payloads")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<PayloadDto>>(){});
    }

    public PayloadDto payloads(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("payloads")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), PayloadDto.class);
    }

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/payloads/v4/

    public RoadsterDto roadster() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("roadster")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), RoadsterDto.class);
    }

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/roadster/v4/

    public List<RocketDto> rockets() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("rockets")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<RocketDto>>(){});
    }

    public RocketDto rockets(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("rockets")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), RocketDto.class);
    }

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/rockets/v4/

    public List<ShipDto> ships() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("ships")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<ShipDto>>(){});
    }

    public ShipDto ships(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("ships")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), ShipDto.class);
    }

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/ships/v4/

    public List<StarlinkDto> starlink() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("starlink")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<StarlinkDto>>(){});
    }

    public StarlinkDto starlink(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("starlink")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), StarlinkDto.class);
    }

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/starlink/v4/

    public List<HistoryDto> history() throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("history")
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), new TypeReference<List<HistoryDto>>(){});
    }

    public HistoryDto history(String id) throws IOException {
        GetResponse response = new GetRequest(this)
                .append(prefix)
                .append("history")
                .append(id)
                .execute();

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response.getBody(), HistoryDto.class);
    }

    // TODO https://github.com/r-spacex/SpaceX-API/blob/master/docs/history/v4/
}
