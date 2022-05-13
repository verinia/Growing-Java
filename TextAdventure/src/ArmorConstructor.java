public class ArmorConstructor {

  //TODO Overload the constructor in order to create multiple parameters, Armor color,
  //Armor defense rating, Armor specialist bonus. Change file name ArmorConstructor.


private boolean armorProficiency;
private boolean stealthDisadvantage;
private int armorDefense;
private int dexModifier;
private int cost;
private int weight;


  protected ArmorConstructor(int armorDefense,int cost, int dexModifier, boolean armorProficiency,
                             boolean stealthDisadvantage, int weight) {
      this.setArmorProficiency(armorProficiency);
      this.setArmorDefense(armorDefense);
      this.setStealthDisadvantage(stealthDisadvantage);
      this.setDexModifier(dexModifier);
      this.setCost(cost);
      this.setWeight(weight);
  }

  public void setArmorProficiency(boolean armorProficiency){
    this.armorProficiency = armorProficiency;
  }

  public boolean getArmorProficiency(){
    return this.armorProficiency;
  }

  public void setDexModifier(int dexModifier){
    this.dexModifier = dexModifier;
  }

  public int getDexModifier(){
    return this.dexModifier;
  }

  public void setArmorDefense(int armorDefense){
    this.armorDefense = armorDefense;
  }
  public int getArmorDefense(){
    return this.armorDefense;
  }

  public void setStealthDisadvantage(boolean stealthDisadvantage){
    this.stealthDisadvantage = stealthDisadvantage;
  }

  public boolean getStealthDisadvantage(){
    return this.stealthDisadvantage;
  }

  public void setCost(int cost){
    this.cost = cost;
  }
  public int getCost(int cost){
    return this.cost;
  }

  public void setWeight(int weight){
    this.weight = weight;
  }
  public int getWeight(){
    return this.weight;
  }

}