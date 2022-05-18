package actor.npc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class NPC {

    private int playerLevel;
    private int maxHealthPoints;
    private int healthPoints;
    private int spellSlots;
    private int potionSlots;
    private String name;



}
