package it.unikey.entities;

public class Car
{
    private String model;
    private String fuellType;
    private double reservoir;
    private double reservoirCapacity;

    public Car(String model, String fuellType, double reservoirCapacity) {
        this.model = model;
        this.fuellType = fuellType;
        this.reservoirCapacity = reservoirCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuellType() {
        return fuellType;
    }

    public void setFuellType(String fuellType) {
        this.fuellType = fuellType;
    }

    public double getReservoirCapacity() {
        return reservoirCapacity;
    }

    public void setReservoirCapacity(double reservoirCapacity) {
        this.reservoirCapacity = reservoirCapacity;
    }

    public double getReservoir() {
        return reservoir;
    }

    public void setReservoir(double reservoir) {
        this.reservoir = reservoir;
    }
}
