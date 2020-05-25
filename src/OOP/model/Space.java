package OOP.model;

import OOP.model.Person;
import OOP.model.Vehicle;

public abstract class Space {

    protected Person person;
    protected Vehicle vehicle;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean IsEmpty() {
        return person == null || vehicle == null;
    }

}
