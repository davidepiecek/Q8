package it.unikey.entities;

public class GasStation
{
    private double petrolDeposit;
    private double dieselDeposit;
    private double dieselPricePerLitre;
    private double petrolPricePerLitre;

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
        petrolDeposit = petrolDeposit + litre;
    }
    public void refuelDieselDeposit ( double litre)
    {
        dieselDeposit += litre;
    }

}
