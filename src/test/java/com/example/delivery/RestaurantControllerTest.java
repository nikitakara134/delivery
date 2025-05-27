package com.example.delivery;

import com.example.delivery.controller.RestaurantController;
import com.example.delivery.model.Restaurant;
import com.example.delivery.service.RestaurantService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(RestaurantController.class)
class RestaurantControllerTest {

    @Autowired
    private RestaurantController restaurantController;

    @MockBean
    private RestaurantService restaurantService;

    @Test
    void testGetAllRestaurants() {
        Restaurant r1 = new Restaurant();
        r1.setName("Test Restaurant 1");
        Restaurant r2 = new Restaurant();
        r2.setName("Test Restaurant 2");

        when(restaurantService.getAllRestaurants()).thenReturn(Arrays.asList(r1, r2));

        List<Restaurant> result = restaurantController.getAllRestaurants();
        assertEquals(2, result.size());
        assertEquals("Test Restaurant 1", result.get(0).getName());
    }
}
