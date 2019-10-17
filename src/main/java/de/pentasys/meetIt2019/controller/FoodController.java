package de.pentasys.meetIt2019.controller;

import de.pentasys.meetIt2019.recources.Food;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {

    @GetMapping
    public ResponseEntity getFood() {
        final Food food = new Food("Pommes");
        final Resource resource = new Resource(food);
        return ResponseEntity.ok(resource);
    }
}
