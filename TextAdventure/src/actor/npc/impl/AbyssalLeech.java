package actor.npc.impl;

import actor.npc.NPC;

//Example npc
public class AbyssalLeech extends NPC {

    @Override
    public int getPlayerLevel() {
        return 130;
    }

    @Override
    public String getName() {
        return "Abyssal Leech";
    }

}

