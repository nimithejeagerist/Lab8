package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        // Failed assert
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    void hasCityTest() {
        list = MockCityList();

        City city = new City("Estevan", "SK");
        list.addCity(city);

        assertTrue(list.hasCity(city));
    }

    @Test
    void deleteCityTest() {
        list = MockCityList();

        City city = new City("Estevan", "SK");

        assertEquals(1, list.getCount());

        list.deleteCity(city);
        assertEquals(0,list.getCount());
        assertFalse(list.hasCity(city));
    }


}
