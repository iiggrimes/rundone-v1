import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ShoeManager manager = new ShoeManager();

        while (true) {
            System.out.println("1. Add Shoe");
            System.out.println("2. View Shoes");
            System.out.println("3. Log Run");
            System.out.println("4. Exit");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    //collect info
                    //create shoe
                    //manager.addShoe(...)
                    break;

                case 2:
                    manager.listShoes();
                    break;

                case 3:
                    //ask which shoe
                    //ask distance
                    //manager.logRun(...)
                    break;

                case 4:
                    return;
            }
        }
    }
}