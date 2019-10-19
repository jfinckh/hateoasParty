package de.pentasys.meetIt2019.recources;

import de.pentasys.meetIt2019.controller.*;
import de.pentasys.meetIt2019.utils.Constants;
import lombok.Getter;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@Getter
public class Lobby extends ResourceSupport {

    private final String STATE = Constants.LOBBY_STATE;

    public Lobby() {
        add(linkTo(LobbyController.class).withRel(Constants.SELF));
        add(linkTo(DrinkController.class).withRel(Constants.DRINK));
        add(linkTo(FoodController.class).withRel(Constants.FOOD));
        add(linkTo(DanceController.class).withRel(Constants.DANCE));
        add(linkTo(TaxiController.class).withRel(Constants.TAXI));
    }
}