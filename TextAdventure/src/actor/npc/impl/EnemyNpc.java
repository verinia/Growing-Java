package actor.npc.impl;

import actor.npc.NpcBuilder;

//Example npc
public class EnemyNpc extends NpcBuilder {

    //Abyssal Leech
   public static NpcBuilder abyssalLeech = new NpcBuilder(){

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

