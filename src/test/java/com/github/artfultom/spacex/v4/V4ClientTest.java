package com.github.artfultom.spacex.v4;

import com.github.artfultom.spacex.SpaceXClient;
import com.github.artfultom.spacex.v4.dto.response.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class V4ClientTest {

    @Test
    void check() throws IOException {
        V4Client client = SpaceXClient.createV4();

        boolean result = client.check();

        assertTrue(result);
    }

    @Test
    void capsules() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<CapsuleDto> result = client.capsules();

        assertNotNull(result);
    }

    @Test
    void capsulesOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        CapsuleDto result = client.capsules("5e9e2c5bf35918ed873b2664");

        assertNotNull(result);
    }

    @Test
    void company() throws IOException {
        V4Client client = SpaceXClient.createV4();

        CompanyDto result = client.company();

        assertNotNull(result);
    }

    @Test
    void cores() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<CoreDto> result = client.cores();

        assertNotNull(result);
    }

    @Test
    void coresOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        CoreDto result = client.cores("5e9e289df35918033d3b2623");

        assertNotNull(result);
    }

    @Test
    void crew() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<CrewDto> result = client.crew();

        assertNotNull(result);
    }

    @Test
    void crewOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        CrewDto result = client.crew("5ebf1a6e23a9a60006e03a7a");

        assertNotNull(result);
    }

    @Test
    void dragons() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<DragonDto> result = client.dragons();

        assertNotNull(result);
    }

    @Test
    void dragonsOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        DragonDto result = client.dragons("5e9d058759b1ff74a7ad5f8f");

        assertNotNull(result);
    }

    @Test
    void landpads() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<LandpadDto> result = client.landpads();

        assertNotNull(result);
    }

    @Test
    void landpadsOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        LandpadDto result = client.landpads("5e9e3032383ecb267a34e7c7");

        assertNotNull(result);
    }

    @Test
    void launches() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<LaunchDto> result = client.launches();

        assertNotNull(result);
    }

    @Test
    void launchesOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        LaunchDto result = client.launches("5eb87cd9ffd86e000604b32a");

        assertNotNull(result);
    }

    @Test
    void launchpads() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<LaunchpadDto> result = client.launchpads();

        assertNotNull(result);
    }

    @Test
    void launchpadsOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        LaunchpadDto result = client.launchpads("5e9e4501f5090910d4566f83");

        assertNotNull(result);
    }

    @Test
    void payloads() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<PayloadDto> result = client.payloads();

        assertNotNull(result);
    }

    @Test
    void payloadsOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        PayloadDto result = client.payloads("5eb0e4b5b6c3bb0006eeb1e1");

        assertNotNull(result);
    }

    @Test
    void roadster() throws IOException {
        V4Client client = SpaceXClient.createV4();

        RoadsterDto result = client.roadster();

        assertNotNull(result);
    }

    @Test
    void rockets() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<RocketDto> result = client.rockets();

        assertNotNull(result);
    }

    @Test
    void rocketsOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        RocketDto result = client.rockets("5e9d0d95eda69955f709d1eb");

        assertNotNull(result);
    }

    @Test
    void ships() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<ShipDto> result = client.ships();

        assertNotNull(result);
    }

    @Test
    void shipsOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        ShipDto result = client.ships("5ea6ed2d080df4000697c901");

        assertNotNull(result);
    }

    @Test
    void starlink() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<StarlinkDto> result = client.starlink();

        assertNotNull(result);
    }

    @Test
    void starlinkOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        StarlinkDto result = client.starlink("5eed7713096e59000698561b");

        assertNotNull(result);
    }

    @Test
    void history() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<HistoryDto> result = client.history();

        assertNotNull(result);
    }

    @Test
    void historyOne() throws IOException {
        V4Client client = SpaceXClient.createV4();

        HistoryDto result = client.history("5f6fb2cfdcfdf403df37971e");

        assertNotNull(result);
    }
}