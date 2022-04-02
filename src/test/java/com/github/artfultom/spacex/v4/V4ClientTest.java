package com.github.artfultom.spacex.v4;

import com.github.artfultom.spacex.SpaceXClient;
import com.github.artfultom.spacex.v4.dto.response.CapsuleDto;
import com.github.artfultom.spacex.v4.dto.response.CompanyDto;
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
    void company() throws IOException {
        V4Client client = SpaceXClient.createV4();

        CompanyDto result = client.company();

        assertNotNull(result);
    }

    @Test
    void capsules() throws IOException {
        V4Client client = SpaceXClient.createV4();

        List<CapsuleDto> result = client.capsules();

        assertNotNull(result);
    }
}