public class Test {

    public static void main(String[] args) {

        WeaponDamage weaponClass = new WeaponDamage();
        Root crit = new Root();

        int count = 1;
        while(count <= 100){

            System.out.println(crit.getCrit(55));
            count += 1;
        }



    }
}
