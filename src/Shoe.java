public class Shoe {

    private String brand;
    private String name;
    private String color;
    private double size;
    private double startingMiles;
    private double remainingMiles;
    private double currentMiles;
    private double endOfShoeMiles;

    public Shoe() {

    }

    public Shoe(String brand, String name, String color, double size, double startingMiles, double endOfShoeMiles) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.size = size;
        this.startingMiles = startingMiles;
        remainingMiles = endOfShoeMiles - startingMiles;
        currentMiles = startingMiles;
        this.endOfShoeMiles = endOfShoeMiles;
    }

    @Override
    public String toString() {
        return "Shoe: " + brand + " " + name +
                "\n" + color + ", Size " + size +
                "\n" + currentMiles + " / " + endOfShoeMiles + " miles currently" +
                "\nSo " + remainingMiles + " miles remaining\n";

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getStartingMiles() {
        return startingMiles;
    }

    public void setStartingMiles(double startingMiles) {
        this.startingMiles = startingMiles;
    }

    public double getRemainingMiles() {
        return remainingMiles;
    }

    public void setRemainingMiles(double remainingMiles) {
        this.remainingMiles = remainingMiles;
    }

    public double getCurrentMiles() {
        return currentMiles;
    }

    public void setCurrentMiles(double currentMiles) {
        this.currentMiles = currentMiles;
    }

    public double getEndOfShoeMiles() {
        return endOfShoeMiles;
    }

    public void setEndOfShoeMiles(double endOfShoeMiles) {
        this.endOfShoeMiles = endOfShoeMiles;
    }


}
