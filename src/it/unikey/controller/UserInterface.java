package it.unikey.controller;

import java.util.Scanner;

public class UserInterface {
    public static void openMenu()
    {
        boolean done = false;
        while(!done) {
            Scanner scan = new Scanner(System.in);
            String cmd = "start";
            switch (cmd)
            {
                case "start" :
                    System.out.println("Ciao! Cosa vuoi fare? \n" +
                            "1. Rifornisci il benzinaio." +
                            "2. Cambia il prezzo della benzina. \n" +
                            "3. Cambia il prezzo del diesel. \n" +
                            "4. Vendi carburante. \n" +
                            "5. Esci.");
                    cmd = scan.nextLine();
                    break;
                case "1" :
                    System.out.println("Devi rifornire la benzina o il diesel? (benzina/diesel)");
                    String dieselOrPetrol = scan.nextLine();
                    if(dieselOrPetrol.equalsIgnoreCase("diesel"))
                        
                    break;
                case "5" :
                    done = true;
                    break;
                default :
                    cmd = "start";
                    break;
            }
        }
    }
}
