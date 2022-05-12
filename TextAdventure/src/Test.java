public class Test {

    public static void main(String[] args) {

        WeaponDamage weaponClass = new WeaponDamage();



        int count = 1;
        while(count <= 100){

            System.out.println(weaponClass.getCrit());
            count += 1;
        }



    }
}
