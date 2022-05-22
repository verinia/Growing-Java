package test;

import actor.npc.impl.FriendlyNPC;
import game_mech.DiceClass;

public class Test {

    public static void main(String[] args) {

        int guardHealth = FriendlyNPC.ccGateGuard1.getHealthPoints();

        while(guardHealth > 0) {
            int playerHit = (5 * (DiceClass.ROLL_DICE("d6"))) + 2;
            if ((playerHit) >= FriendlyNPC.ccGateGuard1.getArmorClass()) {
                System.out.println("You struck the Gate guard for " + playerHit + " damage");
                guardHealth = guardHealth - playerHit;

                if(guardHealth - playerHit <= 0) {
                    guardHealth = 0;

                }
            } else {
                System.out.println("You missed");
            }

            if (guardHealth == 0) {
                System.out.println("The gate guard has been defeated");
                System.out.println("Congratulations! You have gained 320 xp.");
            }
        }




    }

}
