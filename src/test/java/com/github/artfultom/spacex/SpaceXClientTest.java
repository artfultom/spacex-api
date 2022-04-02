package com.github.artfultom.spacex;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SpaceXClientTest {

    @Test
    void check() throws IOException {
        SpaceXClient client = SpaceXClient.createV4();

        boolean result = client.check();

        assertTrue(result);
    }
}