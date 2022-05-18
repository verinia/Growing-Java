package actor.npc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public abstract class NPC {

    private int combatLevel;
    private int maxHealthPoints;
    private int healthPoints;
    private int spellSlots;
    private int potionSlots;
    private String name;



}
