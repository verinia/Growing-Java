public class Main {

    public static int randInt(int min, int max){
        return (int) Math.floor(Math.random() * (max + 1 - min) + min);
    }

}
