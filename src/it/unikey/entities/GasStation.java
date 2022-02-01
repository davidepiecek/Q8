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

    public String sellPetrol (double paidAmmountForPetrol)
    {
        double litreSelled = paidAmmountForPetrol / petrolPricePerLitre;


        if (petrolDeposit - litreSelled >= 0)
        {
            this.petrolDeposit -= litreSelled;
            return "Ho venduto" + litreSelled + "litri di benzina";
        }
        return"scorte insufficienti";
    }

    public boolean sellDiesel (double paidAmmountForDiesel)
    {
        double litreSelled = paidAmmountForDiesel / dieselPricePerLitre;

        if (dieselDeposit - litreSelled >= 0)
        {
            this.dieselDeposit -= litreSelled;
            return true;
        }
        return false;
    }

}
