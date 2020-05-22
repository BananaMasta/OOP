
package OOP.model;

import java.util.*;

public class Parking {
    private OwnersFloor[] floors;
    private int size = 0;
    private Vehicle[] Vehicle;
    private Space space;

    public boolean add(OwnersFloor floor) {
        for (int i = 0; i < floors.length; i++) {
            if (floors[i] == null) {
                floors[i] = floor;

                return true;
            }
        }

        return false;
    }

    public boolean add(int index, OwnersFloor floor) {
        if ((index >= floors.length) || (index < 0)) ;
        OwnersFloor[] newOwnerFloor = new OwnersFloor[floors.length + 1];
        for (int i = 0; i < floors.length; i++) {
            newOwnerFloor[i] = floors[i];
        }
        for (int i = newOwnerFloor.length; i >= index; i--) {
            newOwnerFloor[index] = newOwnerFloor[i - 1];
        }
        newOwnerFloor[index] = (OwnersFloor) floor;
        floors = newOwnerFloor;
        return true;
    }

    public OwnersFloor set(int index, OwnersFloor floor) {
        if ((index >= floors.length) || (index < 0)) ;
        this.floors[index] = (OwnersFloor) floor;
        return floor;
    }

    public Space remove(int index) {
        if ((index >= floors.length) || (index < 0)) ;
        OwnersFloor[] newOwnerFloor = new OwnersFloor[floors.length - 1];
        for (int i = 0; i < index; i++) {
            newOwnerFloor[i] = floors[i];
        }
        for (int i = index + 1; i < floors.length; i++) {
            newOwnerFloor[i - 1] = floors[i];
        }
        floors = newOwnerFloor;
        return space;
    }

    public int size() {
        return floors.length;
    }

    public OwnersFloor[] getFloors() {
        return floors;
    }

    public Vehicle[] getVehicle() {
        return Vehicle;
    }

    public OwnersFloor[] sortedBySizeFloors() {
      //  Arrays.sort(floors);
        for (int i = floors.length-1; i>0; i--)
        {
            for(int j = 0; j< i;j++)
            {
                if(Integer.parseInt(String.valueOf(floors[j])) > Integer.parseInt(String.valueOf(floors[j])))
                {
                    size = Integer.parseInt(String.valueOf(floors[j]));
                    floors[j] = floors[j+1];
                    floors[j+1] = size;
                }
            }
        }
        return new OwnersFloor[0];
    }

    public Space removeSpace(String registrationNumber) {
        int j = 0;
        for (; j < floors.length; j++)        //поиск удаляемого элемента
            if (floors.length == Integer.parseInt(registrationNumber))
                break;
        for (int k = j; k < floors.length - 1; k++) //сдвиг последующих элементов
            floors[k] = floors[k + 1];                        //
        OwnersFloor[] newFloors = new OwnersFloor[floors.length - 1];
        floors = newFloors;
        return space;
    }

    public Space setSpace(String registrationNumber, Space space)
    {
        int j = 0;
        for (; j < floors.length; j++)
            if (floors.length == Integer.parseInt(registrationNumber))
                break;
        OwnersFloor newRegistrationNumber = new OwnersFloor();
        floors[j] = newRegistrationNumber;
        return space;
    }
}
