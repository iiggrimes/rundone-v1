import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("New shoe (1) or Recent shoe (2)");

        if (input.nextInt() == 1) {

            System.out.println("What is the shoe brand?");
            Shoe[] newShoe = new Shoe[10]; //10 a random number i hope i dont regret it
            newShoe[x] = new Shoe();

            String brand = input.nextLine();
            newShoe[x].set_brand(brand);

            String name = input.nextLine();
            newShoe[x].set_brand(name);


        }
        else if (input.nextInt() == 2) {

        }

    }
}
