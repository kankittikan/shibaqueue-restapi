package ku.cs.shibaqueuerestapi.controller;

import ku.cs.shibaqueuerestapi.entity.Restaurant;
import ku.cs.shibaqueuerestapi.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping("/restaurant")
    public List<Restaurant> getAllRestaurants() {
        return service.getAll();
    }

    @GetMapping("/restaurant/{idRestaurant}")
    public Restaurant getRestaurantById(@PathVariable UUID idRestaurant) {
        return service.getRestaurantById(idRestaurant);
    }

    @GetMapping("/restaurant/name/{restaurantName}")
    public Restaurant getRestaurantByName(@PathVariable String restaurantName) {
        return service.getRestaurantByName(restaurantName);
    }

    @PostMapping("/restaurant")
    public Restaurant create(@RequestBody Restaurant restaurant){
        return service.create(restaurant);
    }

    @PutMapping("/restaurant")
    public Restaurant update(@RequestBody Restaurant restaurant) {
        return service.update(restaurant);
    }

    @DeleteMapping("/restaurant/{idRestaurant}")
    public Restaurant delete(@PathVariable UUID idRestaurant) {
        return service.delete(idRestaurant);
    }
}
