import java.util.ArrayList;

public class ShoeManager {

    private ArrayList<Shoe> shoes = new ArrayList<>();

    public void addShoe(Shoe shoe) {
        shoes.add(shoe);
    }

    public void listShoes() {
        for (int i = 0; i < shoes.size(); i++) {
            System.out.println(i + ": " + shoes.get(i));
        }
    }

    public void logRun(int index, double distance) {
        shoes.get(index).logRun(distance);
    }

    public Shoe getShoe(int index) {
        return shoes.get(index);
    }
}