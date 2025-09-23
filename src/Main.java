import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;

        System.out.println("New shoe (1) or Recent shoe (2)");

        ArrayList<Shoe> shoeCollection = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        if (input.nextInt() == 1) {

            System.out.println("What is the shoe brand?");

            String brand = input.nextLine();
            String name = input.nextLine();
            String color = input.nextLine();
            double size = input.nextDouble();
            double startingMiles = input.nextDouble();
            double endOfShoeMiles = input.nextDouble();





            Shoe shoe2 = new Shoe(brand,name,color,size,startingMiles,endOfShoeMiles);
            shoeCollection.add(shoe2);


            //shoeCollection.add(shoe1);




        } else {


            Shoe shoe1 = new Shoe("Adidas","Sl2","White",13.5,25,400);
            shoeCollection.add(shoe1);


            for (int i = 0; i< shoeCollection.size(); i++ ){
                System.out.println(shoeCollection.get(i).toString());

            }
        }

    }
}
