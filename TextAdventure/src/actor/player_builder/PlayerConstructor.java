package actor.player_builder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor


public abstract class PlayerConstructor {

    //Player basic information
    private String name;
    private String race;
    private String alignment;
    private String playersClass;

    //Player Information

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
