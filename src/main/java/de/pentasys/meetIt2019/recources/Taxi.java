package de.pentasys.meetIt2019.recources;

import de.pentasys.meetIt2019.controller.TaxiController;
import de.pentasys.meetIt2019.utils.Constants;
import lombok.Getter;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@Getter
public class Taxi extends ResourceSupport {

    private final String STATE = Constants.TAXI_STATE;

    public Taxi() {
        add(linkTo(TaxiController.class).withRel(Constants.SELF));
    }
}
