package com.jjang051.juju.api;

import com.jjang051.juju.api.request.CreateAndEditRestaurantRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestaurantApi {
    @GetMapping("/restaurants")
    public String getRestaurants() {
        return "getRestaurants";
    }
    @GetMapping("/restaurant/{restaurantId}")
    public String getRestaurant(@PathVariable Long restaurantId) {
        return "getRestaurant-"+restaurantId;
    }

    @PostMapping("/restaurant")
    public String createRestaurant(@RequestBody CreateAndEditRestaurantRequest request) {
        return "createRestaurant==="+ request.getName()+"===address==="+ request.getAddress()
                +"===menuList==="+request.getMenuList().get(0).getName()+"/"+request.getMenuList().get(0).getPrice();
    }
    @PutMapping("/restaurant/{restaurantId}")
    public String updateRestaurant(@PathVariable Long restaurantId, @RequestBody CreateAndEditRestaurantRequest request) {
        return "updateRestaurant-"+restaurantId+"==="+ request.getName()+"===address==="+ request.getAddress();
    }
    @DeleteMapping("/restaurant/{restaurantId}")
    public String deleteRestaurant(@PathVariable Long restaurantId) {
        return "deleteRestaurant-"+restaurantId;
    }

}
