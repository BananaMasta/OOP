package OOP.model;

import OOP.model.Vehicle;
import OOP.model.VehicleTypes;
import OOP.model.AbstractSpace;
import OOP.model.Space;

public interface Floor {

    boolean add(AbstractSpace abstractSpace);

    boolean add(int index, AbstractSpace abstractSpace);

    AbstractSpace get(int index);

    AbstractSpace get(String registrationNumber);

    boolean hasSpace(String registrationNumber);

    AbstractSpace set(int index, AbstractSpace abstractSpace);

    AbstractSpace remove(int index);

    AbstractSpace remove(String registrationNumber);

    int size();

    AbstractSpace[] getSpaces();

    Vehicle[] getVehicles();

    Space[] getSpaces(VehicleTypes vehicleType);

    Space[] getEmptySpaces();
}
