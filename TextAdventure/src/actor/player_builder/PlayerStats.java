package actor.player_builder;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public abstract class PlayerStats {

  //Players proficiency levels
  private int level;
  private int healthPoints;
  private int exp;
  private int proficiencyBonus;
  private int strength;
  private int dexterity;
  private int constitution;
  private int intelligence;
  private int wisdom;
  private int charisma;

  //Players combat levels
  private int armorClass;
  private int initiative;
  private int speed;


}
