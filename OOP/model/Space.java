package OOP.model;

import java.time.LocalDate;
import java.time.Period;

public interface Space {

    Person getPerson();

    void setPerson(Person person);

    Vehicle getVehicle();

    void setVehicle(Vehicle vehicle);

    boolean IsEmpty();

    LocalDate getSinceDate();

    void setSinceDate(LocalDate sinceDate);

    Period period();

}
