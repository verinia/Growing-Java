package actor.npc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class NpcBuilder {

    private int challengeRating;
    private int combatLevel;
    private int armorClass;
    private int maxHealthPoints;
    private int healthPoints;
    private String name;



}
