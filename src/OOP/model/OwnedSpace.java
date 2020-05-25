package OOP.model;

import OOP.model.Person;
import OOP.model.Vehicle;

public class OwnedSpace extends Space {

    public OwnedSpace(Person person, Vehicle vehicle) {
        this.person = person;
        this.vehicle = vehicle;
    }

}
