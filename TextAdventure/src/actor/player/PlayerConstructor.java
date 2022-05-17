package actor.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor


public class PlayerConstructor {
    //TODO: Create player object, constructor, create an AC modifier constructor that incorporates Armor, and shields,
    // as well as certain spells. Also create player creation class that users can use to create a character.

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
