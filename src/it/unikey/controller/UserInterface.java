package it.unikey.controller;

import it.unikey.entities.GasStation;

import java.util.Scanner;

public class UserInterface {

    Scanner scanner1 = new Scanner(System.in);
    GasStation gasStation = new GasStation(0,00);

    public void userInterface ()
    {
        System.out.println("Scegli un fuel tra 'diesel' e 'petrol' ");
        String fuel = scanner1.nextLine();


        switch (fuel)
        {
            case "diesel":
                System.out.println("inserisci l'importo che desideri pagare ");
                int paidAmmoutForDiesel = scanner1.nextInt();
                gasStation.sellDiesel(paidAmmoutForDiesel);

            case "petrol":
                System.out.println("inserisci l'importo che desideri pagare ");
                int paidAmmountForPetrol = scanner1.nextInt();
                gasStation.sellPetrol(paidAmmountForPetrol);

            default:
                System.out.println("inserisci una opzione valida ");
        }

    }

}
