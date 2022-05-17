package actor.npc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public abstract class NPC {

    private int combatLevel;
    private int healthPoints;
    private int spellSlots;
    private String name;



}
