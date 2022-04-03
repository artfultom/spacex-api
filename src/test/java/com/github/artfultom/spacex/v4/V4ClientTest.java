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
}