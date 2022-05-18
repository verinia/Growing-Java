package game_mech;

import java.util.Scanner;

public class PlayersInput {

    private String userInput;

    public static final Scanner ui = new Scanner(System.in);
    public static PlayersInput shop = new PlayersInput("");


    PlayersInput(String userInput){
        this.userInput = userInput;
    }

    public void setUserInput(String userInput){
        this.userInput = userInput;
    }

    public String getUserInput(){
        return this.userInput;
    }


}
