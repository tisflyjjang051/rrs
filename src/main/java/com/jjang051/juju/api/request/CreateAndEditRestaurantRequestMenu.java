package com.jjang051.juju.api.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreateAndEditRestaurantRequestMenu {
    private final String name;
    private final int price;
}
