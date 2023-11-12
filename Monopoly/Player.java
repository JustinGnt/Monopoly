import java.util.ArrayList;
import java.util.Collections;

public class Player{

    public String name;
    int money;
    int pos;

    public Player(String name){

        this.name = name;
        pos = 0;
        money = 0;

    }


    // adds money
    public boolean addMoney(int amount){
        
        money =+ amount;
        return true;

    }


    // moves player forward and returns position
    public int moveForward(int numTiles){

        pos = pos + numTiles;

        if (pos > 40){

            // Temporary variable to store how many tiles past go
            int tilesPastGo = pos - 40;

            pos = 0 + tilesPastGo;

            addMoney(200);
        }

        return pos;

    }

    // Moves player backwards and returns their position
    public int moveBackward(int numTiles){

        pos = pos - numTiles;

        return pos;
    }



}