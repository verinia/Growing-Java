public class Armor {

  private int rags;
  private int mageCloak;
  private int enchantedMageCloak;
  private int masterMageCloak;
  private int dragonScaleCloak;

  private int tinArmor;
  private int ironArmor;
  private int steelArmor;
  private int dragonPlateArmor;

  private int roundShield;
  private int kiteShield;
  private int towerShield;
  private int dragonKiteShield;

  public Armor(){
      this.setRags(rags);
      this.setMageCloak(mageCloak);
      this.setEnchantedMageCloak(enchantedMageCloak);
      this.setMasterMageCloak(masterMageCloak);
      this.setDragonScaleCloak(dragonScaleCloak);
      this.setTinArmor(tinArmor);
      this.setIronArmor(ironArmor);
      this.setSteelArmor(steelArmor);
      this.setDragonPlateArmor(dragonPlateArmor);
      this.setRoundShield(roundShield);
      this.setKiteShield(kiteShield);
      this.setTowerShield(towerShield);
      this.setDragonKiteShield(dragonKiteShield);
  }

  protected void setRags(int rags){
      this.rags = rags;
  }
  public int getRags(){
      return this.rags = (Root.randInt(1,2));
  }

  protected void setMageCloak(int mageCloak){
    this.mageCloak = mageCloak;
  }
  public int getMageCloak(){
    return this.mageCloak = Root.randInt(2,5);
  }

  protected void setEnchantedMageCloak(int enchantedMageCloak){
    this.enchantedMageCloak = enchantedMageCloak;
  }
  public int getEnchantedMageCloak(){
    return this.enchantedMageCloak = Root.randInt(4,7);
  }

  protected void setMasterMageCloak(int masterMageCloak){
    this.masterMageCloak = masterMageCloak;
  }
  public int getMasterMageCloak(){
    return this.masterMageCloak = Root.randInt(7, 10);
  }

  protected void setDragonScaleCloak(int dragonScaleCloak){
    this.dragonScaleCloak = dragonScaleCloak;
  }
  public int getDragonScaleCloak(){
    return this.dragonScaleCloak = Root.randInt(10,14);
  }

  protected void setTinArmor(int tinArmor){
    this.tinArmor = tinArmor;
  }
  public int getTinArmor(){
    return this.tinArmor = Root.randInt(3,6);
  }

  protected void setIronArmor(int ironArmor){
    this.ironArmor = ironArmor;
  }
  public int getIronArmor(){
    return this.ironArmor = Root.randInt(7, 10);
  }

  protected void setSteelArmor(int steelArmor){
    this.steelArmor = steelArmor;
  }
  public int getSteelArmor(){
    return this.steelArmor = Root.randInt(11, 14);
  }

  protected void setDragonPlateArmor(int dragonPlateArmor){
    this.dragonPlateArmor = dragonPlateArmor;
  }
  public int getDragonPlateArmor(){
    return this.dragonPlateArmor = Root.randInt(15, 18);
  }

  protected void setRoundShield(int roundShield){
    this.roundShield = roundShield;
  }
  public int getRoundShield(){
    return this.roundShield = Root.randInt(4, 5);
  }

  protected void setKiteShield(int kiteShield){
    this.kiteShield = kiteShield;
  }
  public int getKiteShield(){
    return this.kiteShield = Root.randInt(6,7);
  }

  protected void setTowerShield(int towerShield){
    this.towerShield = towerShield;
  }
  public int getTowerShield(){
    return this.towerShield = Root.randInt(7,8);
  }

  protected void setDragonKiteShield(int dragonKiteShield){
    this.dragonKiteShield = dragonKiteShield;
  }
  public int getDragonKiteShield(){
    return this.dragonKiteShield = Root.randInt(8, 9);
  }

}
