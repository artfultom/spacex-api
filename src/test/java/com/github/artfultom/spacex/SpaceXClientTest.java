package com.github.artfultom.spacex;

import com.github.artfultom.spacex.v4.V4Client;
import com.github.artfultom.spacex.v4.dto.CompanyResponseDto;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SpaceXClientTest {

    @Test
    void check() throws IOException {
        V4Client client = SpaceXClient.createV4();

        boolean result = client.check();

        assertTrue(result);
    }

    @Test
    void company() throws IOException {
        V4Client client = SpaceXClient.createV4();

        CompanyResponseDto result = client.company();

        assertNotNull(result);
    }
}