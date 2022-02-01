package it.unikey.controller;

import it.unikey.entities.Car;
import it.unikey.entities.GasStation;

import java.util.Scanner;

public class UserInterface {
    public static void openMenu(GasStation benzinaio, Car prima, Car seconda, Car terza)
    {
        boolean done = false;
        String cmd = "start";
        while(!done) {
            Scanner scan = new Scanner(System.in);
            switch (cmd)
            {
                case "start" :
                    System.out.println("Ciao! Cosa vuoi fare? \n" +
                            "1. Rifornisci il benzinaio. \n" +
                            "2. Cambia il prezzo del carburante \n" +
                            "3. Vendi carburante. \n" +
                            "4. Esci.");
                    cmd = scan.nextLine();
                    break;
                case "1" :
                    System.out.println("Devi rifornire la benzina o il diesel? (benzina/diesel)");
                    String dieselOrPetrol = scan.nextLine();
                    System.out.println("Quanti litri devi rifornire?");
                    double litre = scan.nextDouble();
                    if(dieselOrPetrol.equalsIgnoreCase("diesel"))
                        benzinaio.refuelDieselDeposit(litre);
                    else if(dieselOrPetrol.equalsIgnoreCase("benzina"))
                        benzinaio.refuelPetrolDeposit(litre);
                    else
                        System.out.println("Non abbiamo quel tipo di carburante");
                    cmd = "start";
                    break;
                case "2" :
                    System.out.println("Cambi il prezzo della benzina o del diesel?");
                    String a = scan.nextLine();
                    if(a.equalsIgnoreCase("benzina"))
                    {
                        System.out.println("Quanto costerà la benzina?");
                        double newPetrolPrice = scan.nextDouble();
                        benzinaio.updateDieselPrice(newPetrolPrice);
                    }
                    else if(a.equalsIgnoreCase("diesel"))
                    {
                        System.out.println("Quanto costerà il diesel?");
                        double newDieselPrice = scan.nextDouble();
                        benzinaio.updateDieselPrice(newDieselPrice);
                    }
                    else
                        System.out.println("Il benzinaio non fornisce quel carburante");
                    cmd = "start";
                    break;
                case "3" :
                    System.out.println("A chi stai vendendo il carburante?");
                    String who = scan.nextLine();
                    System.out.println("Quanti euri vuoi cacciare?");
                    double euri = scan.nextDouble();
                    switch (who)
                    {
                        case "panda" :
                            benzinaio.sellFuell(prima, euri);
                            break;
                        case "bravo" :
                            benzinaio.sellFuell(seconda, euri);
                            break;
                        case "208" :
                            benzinaio.sellFuell(terza, euri);
                            break;
                    }
                    cmd = "start";
                    break;
                case "4" :
                    done = true;
                    break;
                default :
                    cmd = "start";
                    break;
            }
        }
    }
}
