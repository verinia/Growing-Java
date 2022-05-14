import java.util.Locale;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArmorClass armor = new ArmorClass();

        Scanner storeClerk = new Scanner(System.in);
        Scanner uInput = new Scanner(System.in);
        System.out.println("Hello adventurer! Welcome to my store!");



        boolean t_f = true;

        while (t_f) {
            System.out.println(" ");
            System.out.println("What would you like to take a look at first?");
            System.out.println(" ");

            for (int i = 0; i < ArmorClass.storeListLvl1_5Item.length; i++) {
                System.out.println(ArmorClass.storeListLvl1_5Item[i] + " " + ArmorClass.storListLvl1_5Price[i] + "gp");
            }


            var userinput = storeClerk.nextLine();
            if (userinput.equals(ArmorClass.leather.getName())) {
                System.out.println(userinput + ": AC -> " + ArmorClass.leather.getArmorDefense());
                System.out.println("");
                System.out.println("Would you like to purchase this item?");
                userinput=uInput.nextLine();
                userinput = userinput.toLowerCase();
                if(userinput.equals("yes")){
                    System.out.println("");
                    System.out.println("System: Item has been added to your inventory");
                }
            } else if (userinput.equals(ArmorClass.studdedleather.getName())) {
                System.out.println(userinput + ": AC -> " + ArmorClass.studdedleather.getArmorDefense());
                System.out.println("");
                System.out.println("Would you like to purchase this item?");
                userinput=uInput.nextLine();
                userinput = userinput.toLowerCase();
                if(userinput.equals("yes")){
                    System.out.println("");
                    System.out.println("System: Item has been added to your inventory");
                }
            } else if (userinput.equals(ArmorClass.paddedarmor.getName())) {
                System.out.println(userinput + ": AC -> " + ArmorClass.paddedarmor.getArmorDefense());
                System.out.println("");
                System.out.println("Would you like to purchase this item?");
                userinput=uInput.nextLine();
                userinput = userinput.toLowerCase();
                if(userinput.equals("yes")){
                    System.out.println("");
                    System.out.println("SYSTEM: Item has been added to your inventory");

                }
            } else {
                System.out.println(" ");
                System.out.println("My apology's adventurer, I didn't quite that.");
            }
            System.out.println(" ");
            System.out.println("Is there anything else I can do for you?");
            System.out.println(" ");
            userinput = uInput.nextLine();
            if(userinput.equals("no")){
                System.out.println(" ");
                System.out.println("Thanks for coming! I hope to see you real soon!");
                t_f = false;
            }

        }
    }
}
