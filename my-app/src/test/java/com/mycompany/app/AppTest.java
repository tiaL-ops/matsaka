package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.swing.JMenuItem;

import org.junit.jupiter.api.Test;

import com.mycompany.Rano;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void addBidonTest() {
        JMenuItem item1= new JMenuItem("Ambohijatovo");
        Rano rano = new Rano(item1);
        rano.addBidon(1);
        rano.addBidon(2);
        assertEquals(rano.bidon,3);
        
    }
}
