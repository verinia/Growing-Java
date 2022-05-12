public class Spells {

    //Level 1 spells
    private int heal;
    private int pray;

    //Level 2 spells
    private int fireBall;
    private int iceBall;

    //Level 3 spells
    private int fireStorm;
    private int iceStorm;


    public Spells(){

        this.setHeal(heal);
        this.setPray(pray);
        this.setFireBall(fireBall);
        this.setIceBall(iceBall);
        this.setFireStorm(fireStorm);
        this.setIceStorm(iceStorm);
    }

    public void setHeal(int bonus){
        this.heal = 6 + bonus;
    }
    public int getHeal(){
        return this.heal;
    }

    public void setPray(int bonus){
        this.pray = 6 + bonus;
    }
    public int getPray(){
        return this.pray;
    }

    public void setFireBall(int bonus){
        this.fireBall = Main.randInt((bonus /2) + 1, 6 + bonus);
    }
    public int getFireBall(){
        return this.fireBall;
    }

    public void setIceBall(int bonus){
        this.iceBall=Main.randInt((bonus / 2)+ 1, 6 + bonus);
    }
    public int getIceBall(){
        return this.iceBall;
    }

    public void setFireStorm(int bonus){
        this.fireStorm = Main.randInt((bonus / 2) + 2, 12 + bonus);
    }
    public int getFireStorm(){
        return this.fireStorm;
    }

    public void setIceStorm(int bonus){
        this.fireStorm = Main.randInt((bonus / 2) + 2, 12 + bonus);
    }
    public int getIceStorm(){
        return this.fireStorm;
    }

}
