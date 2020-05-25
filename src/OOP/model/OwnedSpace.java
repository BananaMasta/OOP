package OOP.model;

import OOP.model.Person;
import OOP.model.Vehicle;

public class OwnedSpace extends AbstractSpace {

    public OwnedSpace() {
        super();
    }

    public OwnedSpace(Person person) {
        super(person);
    }

    public OwnedSpace(Person person, Vehicle vehicle) {
        super(person, vehicle);
    }

}
