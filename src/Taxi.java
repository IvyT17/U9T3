public class Taxi extends Car
{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected)
    {
        super(licensePlate, tollFee, passengers, isElectric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi()
    {
        System.out.println("License Plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nPassengers: "
                + getPassengers() + "\nElectric?: " + isElectric() + "\nDiscount Applied?: " + isDiscountApplied() +
                "\nTotal Fare Collected: " + fareCollected);
    }
}
