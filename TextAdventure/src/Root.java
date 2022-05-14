public class Root {

    private int crit;

    protected static int randInt(int min, int max){
        return (int) Math.floor(Math.random()*(max-min+1)+min);
    }

   public Root(){
       this.setCrit(crit);
   }

   private void setCrit(int crit){
       this.crit = crit;
   }

   //Incorporates critical strike (150% of players damage). Set at 11% probability of critical hit.
   //Returns 1 if crit was a success. Returns 0 if crit was not successful.
    public int getCrit(){
        if(Root.randInt(1, 100) <= 11){
            return 1;
        } return 0;
    }

    //Method overloading to incorporate players' crit bonus. Defaults at 11% probability of critical hit.
    //Returns 1 if crit was a success. Returns 0 if crit was not successful.
    public int getCrit(int bonus){
        if(Root.randInt(1, 100) <= 11 + bonus){
            return 1;
        } return 0;
    }

}
