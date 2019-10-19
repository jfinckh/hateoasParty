package de.pentasys.meetIt2019.controller;

import de.pentasys.meetIt2019.recources.Dance;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dance")
@CrossOrigin(origins = "http://localhost:3000")
public class DanceController {

    @GetMapping
    public ResponseEntity getDancing() {
        final Dance dance = new Dance("Makalele");
        final Resource resource = new Resource(dance);
        return ResponseEntity.ok(resource);
    }
}
