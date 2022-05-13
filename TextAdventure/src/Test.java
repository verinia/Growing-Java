public class Test {

    public static void main(String[] args) {

        WeaponDamage weaponClass = new WeaponDamage();
        Root crit = new Root();

        int count = 1;
        double critHit = 0;
        while(count <= 1000){

            System.out.println(crit.getCrit());
            if(crit.getCrit() == 1){
                critHit +=1;
            }
            count += 1;
        }
        System.out.println(critHit / 10);
    }
}
