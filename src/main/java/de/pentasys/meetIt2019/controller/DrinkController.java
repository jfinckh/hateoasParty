package de.pentasys.meetIt2019.controller;

import de.pentasys.meetIt2019.recources.Drink;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drink")
public class DrinkController {
    @GetMapping
    public ResponseEntity getDrink() {
        final Drink drink = new Drink("Bier");
        final Resource resource = new Resource(drink);
        return ResponseEntity.ok(resource);
    }
}
