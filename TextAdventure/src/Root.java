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
   public void setCrit(int crit, int bonus){
       this.crit = getCrit() + bonus;
   }

    public int getCrit(){
        if(Root.randInt(1, 100) >= 92){
            return 10;
        } return 0;
    }

}
