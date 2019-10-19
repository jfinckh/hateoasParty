package de.pentasys.meetIt2019.controller;

import de.pentasys.meetIt2019.recources.Lobby;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lobby")
@CrossOrigin(origins = "http://localhost:3000")
public class LobbyController {

    @GetMapping
    public ResponseEntity lobby() {
        final Lobby lobby = new Lobby();
        final Resource resource = new Resource(lobby);
        return ResponseEntity.ok(resource);
    }
}
