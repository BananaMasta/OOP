package OOP.model;

import OOP.model.Person;
import OOP.model.Vehicle;

public interface Space {

    Person getPerson();

    void setPerson(Person person);

    Vehicle getVehicle();

    void setVehicle(Vehicle vehicle);

    boolean IsEmpty();

}
