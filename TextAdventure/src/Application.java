import actor.npc.impl.AbyssalLeech;


public class Application {
    private static final AbyssalLeech abyssalLeech = new AbyssalLeech();
    public static void main(String[] args) {


        System.out.println(abyssalLeech.getName());
        System.out.println("Level: " + abyssalLeech.getHealthPoints());



    }
}
