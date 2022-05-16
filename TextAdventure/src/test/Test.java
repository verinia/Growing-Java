package test;

import game_merch.PlayersInput;
import shop.ArmorShop;

public class Test {

    public static void test(String[] args) {
        ArmorShop.storeLvl1_5();

        System.out.println(PlayersInput.shop.getUserInput());

    }

}
