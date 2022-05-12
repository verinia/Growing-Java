public class WeaponDamage {
    static int crit(){
        int crit = Root.randInt(1, 100);
        if(crit >= 91){
            return 10;
        } return 0;
    }

    public static void main(String[] args) {
        int crit = crit();
        int f_class = Root.randInt(0,(2 + crit));

        int count = 0;
        while(count<=100) {

            System.out.println(crit());
            System.out.println(f_class);
            count+=1;
        }
    }
}
