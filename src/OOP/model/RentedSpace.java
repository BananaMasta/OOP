package OOP.model;

import OOP.model.Person;
import OOP.model.Vehicle;

public class RentedSpace extends Space {

    public RentedSpace() {
        this(Person.NO_NAME, new Vehicle());
    }

    public RentedSpace(Person person, Vehicle vehicle) {
        this.person = person;
        this.vehicle = vehicle;
    }

}
