import java.util.Arrays;
import java.util.Objects;

public class test {

    public static void main(String[] args) {

        System.out.println(startHi("he ho hi"));

    }

    public static boolean startHi(String str) {
        String[] myArr = str.split(" ");

        for(int i=0; i<myArr.length; i++){
            if(Objects.equals(myArr[0], "hi")){
                return true;
            }
        } return false;


    }
}
