public class Test {

    public static void main(String[] args) {
        WeaponsClass weaponsClass = new WeaponsClass();

        int count = 0;
        for(int i = 0; i <= 10000; i++) {
            System.out.println(weaponsClass.getA_class());
            if(weaponsClass.getA_class() > 12){
                count +=1;
            }


        }
        System.out.println(" ");
        System.out.println("Percentage of critical hits: ");
        System.out.println((double) count / 10000);

    }
}
