package de.pentasys.meetIt2019.recources;

import de.pentasys.meetIt2019.controller.DanceController;
import de.pentasys.meetIt2019.controller.DrinkController;
import de.pentasys.meetIt2019.controller.FoodController;
import de.pentasys.meetIt2019.utils.Constants;
import lombok.Getter;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@Getter
public class Drink extends ResourceSupport {

    private final String STATE = "DRINK";
    private final String name;

    public Drink(final String name) {
        this.name = name;
        add(linkTo(DrinkController.class).withRel(Constants.SELF));
        add(linkTo(FoodController.class).withRel(Constants.FOOD));
        add(linkTo(DanceController.class).withRel(Constants.DANCE));
    }
}
