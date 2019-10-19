package de.pentasys.meetIt2019.controller;

import de.pentasys.meetIt2019.recources.Taxi;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxi")
@CrossOrigin(origins = "http://localhost:3000")
public class TaxiController {

    @GetMapping
    public ResponseEntity getTaxi() {
        final Taxi taxi = new Taxi();
        final Resource resource = new Resource(taxi);
        return ResponseEntity.ok(resource);
    }
}
