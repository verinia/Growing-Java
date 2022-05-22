package combat.spells;

public class SpellsAbs {

    private int level;
    private int damage;
    private int manaRequired;
    private int range;
    private String name;
    private String description;

    public SpellsAbs(int level, int damage, int manaRequired, int range, String name, String description) {
        this.setLevel(level);
        this.setDamage(damage);
        this.setManaRequired(manaRequired);
        this.setRange(range);
        this.setName(name);
        this.setDescription(description);
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }
    public void setManaRequired(int manaRequired) {
        this.manaRequired = manaRequired;
    }
    public int getManaRequired() {
        return manaRequired;
    }
    public void setRange(int range) {
        this.range = range;
    }
    public int getRange() {
        return range;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

}
