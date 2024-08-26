package org.example;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
static String string;
    @BeforeAll
    static void setup() {
        string = "Hausaufgaben";
        }
    @Test
    void aufgabeHinzufuegen() {
        //assertEquals("Hausaufgaben", MainTest.aufgabeHinzufuegen(string));
    }
}