package OOP.model;

import OOP.model.Person;
import OOP.model.Vehicle;

import java.time.LocalDate;

public class OwnedSpace extends AbstractSpace {

    public OwnedSpace() {
        super();
    }

    public OwnedSpace(Person person, LocalDate sinceDate) {
        super(person, sinceDate);
    }

    public OwnedSpace(Person person, Vehicle vehicle, LocalDate sinceDate) {
        super(person, vehicle, sinceDate);
    }

    @Override
    public int hashCode() {
        return 71 * super.hashCode();
    }
}
