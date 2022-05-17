package actor.player;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public class PlayerBuilder {

  //Player basic information
  private String name;
  private String race;
  private String alignment;
  private String playersClass;

  //Players proficiency levels
  private int level;
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
