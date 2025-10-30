package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail because hasCity() doesn't exist yet
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        // Delete the city
        list.deleteCity(edmonton);

        // Verify it's no longer in the list
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        // Test 1: Initially empty list should have count of 0
        assertEquals(0, list.countCities());

        // Add cities to the list
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);

        // Test 2: After adding 2 cities, count should be 2
        assertEquals(2, list.countCities());
    }
}
