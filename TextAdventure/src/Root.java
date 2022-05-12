public class Root {

   public static int randInt(int min, int max){
       return (int) Math.floor(Math.random()*(max-min+1)+min);
   }

    public static void main(String[] args) {
        Armor armor = new Armor();
        System.out.println(armor.getRags());
    }
}
