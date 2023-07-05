import java.util.*;
import java.util.Scanner;
public class Field {

    private static char[][] field = new char[3][3];
    private static final char Field_X= 'x';
    private static final char Field_O= '0';
    private static final char Field_Null= '-';
    Field(){
        fill();
    };
    private static void fill (){
        for(char[] charElement : field){
            Arrays.fill(charElement, Field_Null);
        }
    }
}


