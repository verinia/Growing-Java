package shop;

import combat.armour.ArmorClass;
import game_mech.PlayersInput;

public class ArmorShop {

    final private static String[] storeListLvl1_5 = {
            ArmorClass.paddedArmor.getName() + ": " + ArmorClass.paddedArmor.getCost() + "gp",
            ArmorClass.leather.getName() + ": " + ArmorClass.leather.getCost() + "gp",
            ArmorClass.hidearmor.getName() + ": " + ArmorClass.hidearmor.getCost() + "gp",
            ArmorClass.ringmail.getName() + ": " + ArmorClass.ringmail.getCost() + "gp",
            ArmorClass.shield.getName() + ": " +  ArmorClass.shield.getCost() + "gp",
    };

    final private static String[] storeListLvl6_10 = {
            ArmorClass.paddedArmor.getName() + ": " + ArmorClass.paddedArmor.getCost() + "gp",
            ArmorClass.leather.getName() + ": " + ArmorClass.leather.getCost() + "gp",
            ArmorClass.studdedLeather.getName() + ": " + ArmorClass.studdedLeather.getCost() + "gp",
            ArmorClass.hidearmor.getName() + ": " + ArmorClass.hidearmor.getCost() + "gp",
            ArmorClass.chainshirt.getName() + ": " + ArmorClass.chainshirt.getCost() + "gp",
            ArmorClass.ringmail.getName() + ": " + ArmorClass.ringmail.getCost() + "gp",
            ArmorClass.chainmail.getName() + ": " + ArmorClass.chainmail.getCost() + "gp",
            ArmorClass.shield.getName() + ": " +  ArmorClass.shield.getCost() + "gp",
    };

    final private static String[] storeListLvl11_15 = {
            ArmorClass.paddedArmor.getName() + ": " + ArmorClass.paddedArmor.getCost() + "gp",
            ArmorClass.leather.getName() + ": " + ArmorClass.leather.getCost() + "gp",
            ArmorClass.studdedLeather.getName() + ": " + ArmorClass.studdedLeather.getCost() + "gp",
            ArmorClass.hidearmor.getName() + ": " + ArmorClass.hidearmor.getCost() + "gp",
            ArmorClass.chainshirt.getName() + ": " + ArmorClass.chainshirt.getCost() + "gp",
            ArmorClass.breastplate.getName() + ": " + ArmorClass.breastplate.getCost() + "gp",
            ArmorClass.scalemail.getName() + ": " +  ArmorClass.scalemail.getCost() + "gp",
            ArmorClass.ringmail.getName() + ": " + ArmorClass.ringmail.getCost() + "gp",
            ArmorClass.chainmail.getName() + ": " + ArmorClass.chainmail.getCost() + "gp",
            ArmorClass.splintarmor.getName() + ": " + ArmorClass.splintarmor.getCost() + "gp",
            ArmorClass.shield.getName() + ": " +  ArmorClass.shield.getCost() + "gp",
    };

    final private static String[] storeListLvl16_20 = {
            ArmorClass.paddedArmor.getName() + ": " + ArmorClass.paddedArmor.getCost() + "gp",
            ArmorClass.leather.getName() + ": " + ArmorClass.leather.getCost() + "gp",
            ArmorClass.studdedLeather.getName() + ": " + ArmorClass.studdedLeather.getCost() + "gp",
            ArmorClass.hidearmor.getName() + ": " + ArmorClass.hidearmor.getCost() + "gp",
            ArmorClass.chainshirt.getName() + ": " + ArmorClass.chainshirt.getCost() + "gp",
            ArmorClass.breastplate.getName() + ": " + ArmorClass.breastplate.getCost() + "gp",
            ArmorClass.scalemail.getName() + ": " +  ArmorClass.scalemail.getCost() + "gp",
            ArmorClass.halfplate.getName() + ": " + ArmorClass.halfplate.getCost() + "gp",
            ArmorClass.ringmail.getName() + ": " + ArmorClass.ringmail.getCost() + "gp",
            ArmorClass.chainmail.getName() + ": " + ArmorClass.chainmail.getCost() + "gp",
            ArmorClass.splintarmor.getName() + ": " + ArmorClass.splintarmor.getCost() + "gp",
            ArmorClass.platearmor.getName() + ": " + ArmorClass.platearmor.getCost()+ "gp",
            ArmorClass.shield.getName() + ": " +  ArmorClass.shield.getCost() + "gp",
    };


    public static void storeLvl1_5() {

        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for (String i : storeListLvl1_5) {
            System.out.println(i);
        }

        String userInput = PlayersInput.ui.nextLine();
        PlayersInput.shop.setUserInput(userInput);
    }

    public static void storeLvl6_10() {

        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for (String i : storeListLvl6_10) {
            System.out.println(i);
        }

        String userInput = PlayersInput.ui.nextLine();
        PlayersInput.shop.setUserInput(userInput);

    }

    public static void storeLvl11_15() {
        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for (String i : storeListLvl11_15) {
            System.out.println(i);
        }

        String userInput = PlayersInput.ui.nextLine();
        PlayersInput.shop.setUserInput(userInput);
    }

    public static void storeLvl16_20() {

        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for (String i : storeListLvl16_20) {
            System.out.println(i);
        }
        String userInput = PlayersInput.ui.nextLine();
        PlayersInput.shop.setUserInput(userInput);
    }

}
