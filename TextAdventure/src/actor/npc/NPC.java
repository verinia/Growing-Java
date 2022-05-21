package actor.npc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class NPC {

    private int combatLevel;
    private int armorClass;
    private int maxHealthPoints;
    private int healthPoints;
    private String name;



}
