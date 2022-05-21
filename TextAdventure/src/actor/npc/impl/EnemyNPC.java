package actor.npc.impl;

import actor.npc.NPC;

//Example npc
public class EnemyNPC extends NPC {

   public static NPC abyssalLeech = new NPC(){

        @Override
        public String getName(){return "Abyssal Leech";}

        @Override
        public int getArmorClass(){return 16;}

        @Override
        public int getCombatLevel() {return 15;}

        @Override
        public int getMaxHealthPoints(){return 250;}
    };
}

