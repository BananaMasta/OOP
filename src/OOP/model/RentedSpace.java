package OOP.model;

import OOP.model.Person;
import OOP.model.Vehicle;

public class RentedSpace extends AbstractSpace {

    public RentedSpace() {
        super();
    }

    public RentedSpace(Person person) {
        super(person);
    }

    public RentedSpace(Person person, Vehicle vehicle) {
        super(person, vehicle);
    }

}
