package it.unikey.entities;

public class GasStation
{
    private final static double MAXCAPACITYPETROL = 1000.00;
    private final static double MAXCAPACITYDIESEL = 1000.00;

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

    public GasStation () {}


    /**
     * Il metodo serve per rifornire il deposito di benzina.
     * @param litre La quantitò di benzina da aggiungere al distriubutore
     * @return La quantità di benzina in eccesso che siupeerrerebbe la capienza massima del deposito
     */
    public double refuelPetrolDeposit (double litre)
    {
        if(litre + petrolDeposit <= MAXCAPACITYPETROL)
        {
            petrolDeposit += litre;
            return 0;
        }
        else
        {
            petrolDeposit = MAXCAPACITYPETROL;
            return litre - (MAXCAPACITYPETROL - petrolDeposit);
        }
    }

    /**
     * Il metodo serve per rifornire il deposito di diesel:
     * @param litre La quantità...
     * @return Diesel in eccesso...
     */
    public double refuelDieselDeposit (double litre)
    {
        if(litre + dieselDeposit <= MAXCAPACITYDIESEL)
        {
            dieselDeposit += litre;
            return 0;
        }
        else
        {
            dieselDeposit = MAXCAPACITYDIESEL;
            return litre - (MAXCAPACITYDIESEL - dieselDeposit);
        }
    }

    /**
     * Aggiorna il prezzo della benzina
     * @param newPrice il nuovo prezzo da adottare
     * @return true se il prezzo inserito ha senso, quindi se è maggiore di zero, altrimenti false
     */
    public boolean updatePetrolPrice(double newPrice)
    {
        if(newPrice <= 0)
            return false;
        this.petrolPricePerLitre = newPrice;
        return true;
    }

    /**
     * Aggiorna il prezzo del diesel
     * @param newPrice il nuovo prezzo da adottare
     * @return true se il prezzo inserito ha senso, quindi se è maggiore di zero, altrimenti false
     */
    public boolean updateDieselPrice(double newPrice)
    {
        if(newPrice <= 0)
            return false;
        this.dieselPricePerLitre = newPrice;
        return true;
    }

    /**
     * il metodo vende benzina. La rimuove dal deposito e la aggiunge alla macchina ricevuta come parametro
     * @param car una macchina da rifornire
     * @param paidAmount i soldi che inserisci al distributore
     * @return false se non c'è benzina nel deposito o se la macchina ha già il pieno, altrimenti true. ritorna falso anche se
     * la macchina non è ne a benzina ne a diesel
     */
    public boolean sellFuell(Car car, double paidAmount)
    {
        switch(car.getFuellType().toUpperCase())
        {
            case "DIESEL" :
                double dieselAmount = paidAmount / dieselPricePerLitre;
                double toFull = car.getReservoirCapacity() - car.getReservoir(); //La differenza per arrivare al pieno della macchina

                if(dieselDeposit == 0)
                    return false;
                if(car.getReservoir() == car.getReservoirCapacity())
                    return false;
                if(toFull < dieselAmount)
                {
                    this.dieselDeposit -= toFull;
                    car.setReservoir(car.getReservoirCapacity());
                    return true;
                }
                if(toFull >= dieselAmount)
                {
                    this.dieselDeposit -= dieselAmount;
                    car.setReservoir(dieselAmount);
                    return true;
                }
            case "PETROL" :
                double petrolAmount = paidAmount / petrolPricePerLitre;
                double toFull1 = car.getReservoirCapacity() - car.getReservoir(); //La differenza per arrivare al pieno della macchina

                if(petrolDeposit == 0)
                    return false;
                if(car.getReservoir() == car.getReservoirCapacity())
                    return false;
                if(toFull1 < petrolAmount)
                {
                    this.petrolDeposit -= toFull1;
                    car.setReservoir(car.getReservoirCapacity());
                    return true;
                }
                if(toFull1 >= petrolAmount)
                {
                    this.petrolDeposit -= petrolAmount;
                    car.setReservoir(petrolAmount);
                    return true;
                }
                return false;
            default :
                return false;
        }
    }



}
