public class ArmorShop {

    final private static String[] storeListLvl1_5Item = {
            ArmorClass.paddedArmor.getName(),
            ArmorClass.leather.getName(),
            ArmorClass.hidearmor.getName(),
            ArmorClass.ringmail.getName(),
            ArmorClass.shield.getName(),
    };
    final private static int[] storeListLvl1_5Price = {
            ArmorClass.paddedArmor.getCost(),
            ArmorClass.leather.getCost(),
            ArmorClass.hidearmor.getCost(),
            ArmorClass.ringmail.getCost(),
            ArmorClass.shield.getCost()
    };

    final private static String[] storeListLvl6_10Item = {
            ArmorClass.paddedArmor.getName(),
            ArmorClass.leather.getName(),
            ArmorClass.hidearmor.getName(),
            ArmorClass.chainshirt.getName(),
            ArmorClass.ringmail.getName(),
            ArmorClass.chainmail.getName(),
            ArmorClass.shield.getName(),
    };
    final private static int[] storeListLvl6_10Price = {
            ArmorClass.paddedArmor.getCost(),
            ArmorClass.leather.getCost(),
            ArmorClass.hidearmor.getCost(),
            ArmorClass.chainshirt.getCost(),
            ArmorClass.ringmail.getCost(),
            ArmorClass.chainmail.getCost(),
            ArmorClass.shield.getCost()
    };

    final private static String[] storeListLvl11_15Item = {
            ArmorClass.paddedArmor.getName(),
            ArmorClass.leather.getName(),
            ArmorClass.studdedLeather.getName(),
            ArmorClass.hidearmor.getName(),
            ArmorClass.chainshirt.getName(),
            ArmorClass.breastplate.getName(),
            ArmorClass.scalemail.getName(),
            ArmorClass.ringmail.getName(),
            ArmorClass.chainmail.getName(),
            ArmorClass.splintarmor.getName(),
            ArmorClass.shield.getName(),
    };
    final private static int[] storeListLvl11_15Price = {
            ArmorClass.paddedArmor.getCost(),
            ArmorClass.leather.getCost(),
            ArmorClass.studdedLeather.getCost(),
            ArmorClass.hidearmor.getCost(),
            ArmorClass.chainshirt.getCost(),
            ArmorClass.breastplate.getCost(),
            ArmorClass.scalemail.getCost(),
            ArmorClass.ringmail.getCost(),
            ArmorClass.chainmail.getCost(),
            ArmorClass.splintarmor.getCost(),
            ArmorClass.shield.getCost()
    };

    final private static String[] storeListLvl16_20Item = {
            ArmorClass.paddedArmor.getName(),
            ArmorClass.leather.getName(),
            ArmorClass.studdedLeather.getName(),
            ArmorClass.hidearmor.getName(),
            ArmorClass.chainshirt.getName(),
            ArmorClass.breastplate.getName(),
            ArmorClass.scalemail.getName(),
            ArmorClass.halfplate.getName(),
            ArmorClass.ringmail.getName(),
            ArmorClass.chainmail.getName(),
            ArmorClass.splintarmor.getName(),
            ArmorClass.platearmor.getName(),
            ArmorClass.shield.getName(),
    };
    final private static int[] storeListLvl16_20Price = {
            ArmorClass.paddedArmor.getCost(),
            ArmorClass.leather.getCost(),
            ArmorClass.studdedLeather.getCost(),
            ArmorClass.hidearmor.getCost(),
            ArmorClass.chainshirt.getCost(),
            ArmorClass.breastplate.getCost(),
            ArmorClass.scalemail.getCost(),
            ArmorClass.halfplate.getCost(),
            ArmorClass.ringmail.getCost(),
            ArmorClass.chainmail.getCost(),
            ArmorClass.splintarmor.getCost(),
            ArmorClass.platearmor.getCost(),
            ArmorClass.shield.getCost()
    };

    public static void storeLvl1_5() {

        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for(int i = 0; i < storeListLvl1_5Item.length; i++){
            System.out.println(storeListLvl1_5Item[i] + ": " + storeListLvl1_5Price[i] + "gp");
        }
    }

    public static void storeLvl6_10() {

        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for(int i = 0; i < storeListLvl6_10Item.length; i++){
            System.out.println(storeListLvl6_10Item[i] + ": " + storeListLvl6_10Price[i] + "gp");
        }
    }

    public static void storeLvl11_15() {

        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for(int i = 0; i < storeListLvl11_15Price.length; i++){
            System.out.println(storeListLvl11_15Item[i] + ": " + storeListLvl11_15Price[i] + "gp");
        }
    }

    public static void storeLvl16_20() {

        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for(int i = 0; i < storeListLvl16_20Item.length; i++){
            System.out.println(storeListLvl16_20Item[i] + ": " + storeListLvl16_20Price[i] + "gp");
        }
    }

}
