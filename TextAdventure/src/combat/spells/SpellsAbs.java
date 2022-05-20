package combat.spells;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public abstract class SpellsAbs {

    private int level;
    private int damage;
    private int manaRequired;
    private int range;
    private String name;
    private String description;


}
