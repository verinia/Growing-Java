public class Armor {
    private int rags;
    //Sorcerer
    private int mageCloak;
    private int enchantedMageCloak;
    private int masterMageCloak;
    private int dragonCloak;
    //Knight and Paladin
    private int tinArmor;
    private int ironArmor;
    private int steelArmor;
    private int dragonArmor;
    //Shields
    private int roundShield;
    private int kiteShield;
    private int towerShield;


    /*Creates a random number generator */

    public Armor() {

        this.setRagsDR(rags);
        this.setMageCloakDR(mageCloak);
        this.setEnchantedMageCloakDR(enchantedMageCloak);
        this.setMasterMageCloakDR(masterMageCloak);
        this.setDragonCloakDR(dragonCloak);
        this.setTinArmorDR(tinArmor);
        this.setIronArmorDR(ironArmor);
        this.setSteelArmorDR(steelArmor);
        this.setDragonArmorDR(dragonArmor);
        this.setRoundShieldDR(roundShield);
        this.setKiteShieldDR(kiteShield);
        this.setTowerShieldDR(towerShield);

    }

    //Setters can be used to add bonus points to armor defense rating
    //Getters can be used to retrieve the random generated defense rating

    //rags
    public void setRagsDR(int bonus){
        this.rags = Main.randInt((bonus / 2) + 1, 2 + bonus);
    }
    public int getRagsDR(){
        return this.rags;
    }

    //mage cloak
    public void setMageCloakDR(int bonus){
        this.mageCloak = Main.randInt((bonus / 2) + 2, 5 + bonus);
    }
    public int getMageCloakDR(){
        return this.mageCloak;
    }

    //enchanted mage cloak
    public void setEnchantedMageCloakDR(int bonus){
        this.enchantedMageCloak = Main.randInt((bonus / 2) + 4, 7 + bonus);
    }
    public int getEnchantedMageCloakDR(){
        return this.enchantedMageCloak;
    }

    //master mage cloak
    public void setMasterMageCloakDR(int bonus){
        this.masterMageCloak = Main.randInt((bonus / 2) + 7, 10 + bonus);
    }
    public int getMasterMageCloakDR(){
        return this.masterMageCloak;
    }

    //dragon cloak
    public void setDragonCloakDR(int bonus){
        this.dragonCloak = Main.randInt((bonus / 2) + 10, 14 + bonus);
    }
    public int getDragonCloakDR(){
        return this.dragonCloak;
    }

    //tin armor
    public void setTinArmorDR(int bonus){
        this.tinArmor = Main.randInt((bonus / 2) + 2, 5 + bonus);
    }

    public int getTinArmorDR(){
        return this.tinArmor;
    }

    public void setIronArmorDR(int bonus){
        this.ironArmor = Main.randInt((bonus / 2) + 6, 9 + bonus);
    }

    public int getIronArmorDR(){
        return this.ironArmor;
    }

    public void setSteelArmorDR(int bonus){
        this.steelArmor = Main.randInt((bonus / 2) + 8, 11 + bonus);
    }

    public int getSteelArmorDR(){
        return this.steelArmor;
    }

    public void setDragonArmorDR(int bonus){
        this.dragonArmor = Main.randInt((bonus / 2) + 8, (11 + bonus));
    }

    public int getDragonArmorDR(){
        return this.dragonArmor;
    }

    public void setRoundShieldDR(int bonus){
        this.roundShield = Main.randInt((bonus / 2) + 4, 5 + bonus);
    }

    public int getRoundShieldDR(){
        return this.roundShield;
    }

    public void setKiteShieldDR(int bonus){
        this.kiteShield = Main.randInt((bonus / 2) + 5, 6 + bonus);
    }

    public int getKiteShieldDR(){
        return this.kiteShield;
    }

    public void setTowerShieldDR(int bonus){
        this.towerShield = Main.randInt((bonus / 2) + 6, 7 + bonus);
    }
}
