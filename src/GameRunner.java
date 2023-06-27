import java.lang.reflect.Array;
import java.util.Arrays;

public class GameRunner {

    static boolean gameFinished=false;
    public static void main(String[] args){
        Field.field[0][0]='-';
        Field.field[0][1]='-';
        Field.field[0][2]='-';
        Field.field[1][0]='-';
        Field.field[1][1]='-';
        Field.field[1][2]='-';
        Field.field[2][0]='-';
        Field.field[2][1]='-';
        Field.field[2][2]='-';
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(Field.field[i][j]);
            }
        }
        GameLogic playerGame = new GameLogic();
        byte moveOfPlayers=1;
        while (gameFinished==false) {

            playerGame.update(Field.field);
            moveOfPlayers=playerGame.getMoveCounter();
            if(moveOfPlayers>9) {
                gameFinished=true;
            }
            for (int i = 0; i < Field.field.length; i++) {
                for (int j = 0; j < Field.field[i].length; j++) {


                    if (moveOfPlayers>5) {

                        if ((Field.field[0][0] == Field.field[0][1]) && (Field.field[0][1] == Field.field[0][2]) && (Field.field[0][0] != '-')) {
                            gameFinished = true;
                        }
                        if ((Field.field[1][0] == Field.field[1][1]) && (Field.field[1][1] == Field.field[1][2]) && (Field.field[1][1] != '-')) {
                            gameFinished = true;
                        }
                        if ((Field.field[2][0] == Field.field[2][1]) && (Field.field[2][1] == Field.field[2][2]) && (Field.field[2][2] != '-')) {
                            gameFinished = true;
                        }

                        if ((Field.field[0][0] == Field.field[1][0]) && (Field.field[1][0] == Field.field[2][0]) && (Field.field[0][0] != '-')) {
                            gameFinished = true;
                        }
                        if ((Field.field[0][1] == Field.field[1][1]) && (Field.field[1][1] == Field.field[2][1]) && (Field.field[1][1] != '-')) {
                            gameFinished = true;
                        }
                        if ((Field.field[0][2] == Field.field[1][2]) && (Field.field[1][2] == Field.field[2][2]) && (Field.field[2][2] != '-')) {
                            gameFinished = true;
                        }

                        if ((Field.field[0][0] == Field.field[1][1]) && (Field.field[1][1] == Field.field[2][2]) && (Field.field[2][2] != '-')) {
                            gameFinished = true;
                        }
                        if ((Field.field[0][2] == Field.field[1][1]) && (Field.field[1][1] == Field.field[2][0]) && (Field.field[2][0] != '-')) {
                            gameFinished = true;
                        }
                    }

                    System.out.print(Field.field[i][j] + "\t");
                }
                System.out.println();
            }
        }

        if (gameFinished==true){
            if (moveOfPlayers<9){
                if (moveOfPlayers%2==0) {
                    System.out.println("Нолики выйграли, поздравляем!");
                } else {
                    System.out.println("Крестики выйграли, поздравляем!");
                }
            } else {
                System.out.println("Ничья!");
            }
            System.out.println("Конец игры!");
        }
    }
}


