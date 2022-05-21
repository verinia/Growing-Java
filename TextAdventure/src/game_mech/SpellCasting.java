package game_mech;

import actor.npc.NpcBuilder;

public class SpellCasting {
    static class UnholyLight extends SpellCastingAbst{
        @Override
        public int getLevel(){
            return 1;
        }
        @Override
        public int getDamage() {
            NpcBuilder npcBuilder = new NpcBuilder();
            if (DiceClass.ROLL_DICE("d20") == 20) {
                return DamageMech.getCrit();//Add player_builder intelligence modifier
            } else if(DiceClass.ROLL_DICE("d20") == 1){
                return 0;
            } else if(DiceClass.ROLL_DICE("d20") >= npcBuilder.getArmorClass()){
                return DiceClass.ROLL_DICE("d6");
            } return 0;
        }




    }
}
