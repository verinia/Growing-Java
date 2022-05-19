package actor.npc.impl;

import actor.npc.NPC;

//Example npc
public class AbyssalLeech extends NPC {

    @Override
    public int getCombatLevel() {
        return 130;
    }
    @Override
    public String getName() {
        return "Abyssal Leech";
    }
    @Override
    public int getHealthPoints(){
        return 300;
    }
    @Override
    public int getMaxHealthPoints(){
        return 300;
    }

}

