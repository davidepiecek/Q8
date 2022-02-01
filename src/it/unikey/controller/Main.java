package it.unikey.controller;

import it.unikey.entities.Car;
import it.unikey.entities.GasStation;

public class Main {

    public static void main(String[] args) {
        GasStation mioBenzinaio = new GasStation(1.45, 1.75);
        Car panda = new Car("Panda", "Metano", 40);
        Car bravo = new Car("Bravo", "Benzina", 60);
        Car peugeot = new Car("208", "Diesel", 78);
        UserInterface.openMenu();
    }

}
