package game_mech;

public class SpellCasting {
    static class UnholyLight extends SpellCastingAbst{
        @Override
        public int getLevel(){
            return 1;
        }
        @Override
        public int getDamage(){
            return DiceClass.ROLL_DICE("d6");//Add player_builder intelligence modifier
        }




    }
}
