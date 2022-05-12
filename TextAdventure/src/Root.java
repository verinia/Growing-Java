public class Root {

    private int crit;

    public static int randInt(int min, int max){
        return (int) Math.floor(Math.random()*(max-min+1)+min);
    }

   public Root(){
       this.setCrit(crit);
   }

   protected void setCrit(int crit){
       this.crit = crit;
   }

   //Incorporates critical strike (150% of players damage). Set at 8% probability of critical hit.
    public int getCrit(){
        if(Root.randInt(1, 100) >= 92){
            return 1;
        } return 0;
    }

    //Method overloading to incorporate players' crit bonus. Defaults at 8% probability of critical hit.
    //Returns 1 if crit was a success. Returns 0 if crit was not success.
    public int getCrit(int bonus){
        if(Root.randInt(1, 100) >= 92 - bonus){
            return 1;
        } return 0;
    }

}
