import game_mech.PlayersInput;
import shop.Shop;


public class Application {

    public static void main(String[] args) {
//        ArmorShop.storeLvl1_5();
        Shop.initialize();
        System.out.println(PlayersInput.shop.getUserInput());





    }
}
