package actor.npc.impl;

import actor.npc.NpcBuilder;

public class FriendlyNPC {

    NpcBuilder shopKeep = new NpcBuilder(){
        @Override
        public int getChallengeRating(){
            return 1;
        }
    };

}
