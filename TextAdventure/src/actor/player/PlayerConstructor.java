package actor.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor


public class PlayerConstructor {

    private int healthPoints;
    private int spellSlots;
    private int maxWeight;
    private int inventoryWeight;
    private int strengthModifier;
    private int dexterityModifier;
    private int constitutionModifier;
    private int intelligenceModifier;
    private int wisdomModifier;
    private int charismaModifier;


}
