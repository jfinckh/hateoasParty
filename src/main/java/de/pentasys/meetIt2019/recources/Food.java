package de.pentasys.meetIt2019.recources;

import de.pentasys.meetIt2019.controller.DanceController;
import de.pentasys.meetIt2019.controller.DrinkController;
import de.pentasys.meetIt2019.controller.FoodController;
import de.pentasys.meetIt2019.utils.Constants;
import lombok.Getter;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@Getter
public class Food extends ResourceSupport {

    private final String STATE = Constants.FOOD_STATE;

    private final String name;

    public Food(final String name) {
        this.name = name;
        add(linkTo(FoodController.class).withRel(Constants.SELF));
        add(linkTo(DrinkController.class).withRel(Constants.DRINK));
        add(linkTo(DanceController.class).withRel(Constants.DANCE));
    }
}
