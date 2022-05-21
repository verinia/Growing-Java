package actor.player_builder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public abstract class RaceClass {
    private String raceName;
    private int spellSlotLevel;
    private int numberOfSpellSlots;
    private String armorProficiency;
    private String weaponProficiency;
    private String savingThrows;
    private String skills;
}
