import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Board {

    static final int BOARDSIZE = 40;
    Deque<Object> gameBoard = new ArrayDeque<>();
    ArrayList<Object> players = new ArrayList<>();
    Scanner playerInput = new Scanner(System.in);

    public void startGame(int numPlayers){

        for (int i = 1; i < numPlayers; i++){

            System.out.println("Player " + String.valueOf(i) + ", what is your name:");
            players.add(new Player(playerInput.nextLine()));

        }
    }

    public int numTiles(){
        return gameBoard.size();
    }

    // Adds tile to game board
    // Returns false if board is full
    public boolean addTile(Object t){

        if (gameBoard.size() < BOARDSIZE){
            gameBoard.add(t);
            return true;
        }
        return false;

    }

    // Removes tile from game board
    // Returns false if board is empty
    public boolean removeTile(Object t){

        if (board.numTiles() == null || gameBoard.size() == 0 || gameBoard.size() < 0){
            return false;
        }
        if (gameBoard.size() < BOARDSIZE){
            gameBoard.remove(t);
            return true;
        }
        return false;

    }


}