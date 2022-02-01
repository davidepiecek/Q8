package it.unikey.entities;

public class GasStation
{
    private double petrolDeposit;
    private double dieselDeposit;
    private double dieselPricePerLitre = 1.4;
    private double petrolPricePerLitre = 1.75;

    public GasStation (double dieselPricePerLitre, double petrolPricePerLitre)
    {
        this.petrolDeposit = 0;
        this.dieselDeposit = 0;
        this.dieselPricePerLitre = dieselPricePerLitre;
        this.petrolPricePerLitre = petrolPricePerLitre;
    }


    public GasStation ()
    {

    }

    public void refuelPetrolDeposit (double litre)
    {
        petrolDeposit += litre;
    }
    public void refuelDieselDeposit ( double litre)
    {
        dieselDeposit += litre;
    }

    public static void sellPetrol (double paidAmmountForPetrol)
    {
        do {

        }while ()
    }

    public static void sellDiesel (double paidAmmountForDiesel)
    {

    }

}
