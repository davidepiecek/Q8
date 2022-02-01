package it.unikey.controller;

import it.unikey.entities.Car;
import it.unikey.entities.GasStation;

public class Main {

    public static void main(String[] args) {
	// Prima prova sui push



       
       // String a = "ciao";
         GasStation d  = new GasStation(1.40,1.70);
       //  d.refuelPetrolDeposit(50.00);
         Car c = new Car("fiat", "diesel", 50);

         d.refuelDieselDeposit(800);

         d.sellFuell(c, 90);

        System.out.println(c.getReservoir());
    }

}
