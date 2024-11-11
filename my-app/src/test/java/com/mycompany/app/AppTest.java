package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.mycompany.Rano;

public class AppTest {

    private Rano rano;

    @BeforeEach
    public void setUp() {
        rano = new Rano("Ambohipo");
    }

    @Test
    public void testInitialBidonCountIsZero() {
        assertEquals(0, rano.getBidon());
    }

    @Test
    public void testCityNameIsCorrect() {
        assertEquals("Ambohipo", rano.getCityName());
    }

    @Test
    public void testAddBidonIncreasesCount() {
        rano.addBidon(2);
        assertEquals(2, rano.getBidon());
    }

    @Test
    public void testEstimationNotNull() {
        rano.addBidon(3);
        assertNotNull(rano.getEstimation());
    }
}
