    import java.util.*;
 import java.util.Scanner;

public class AgregandoTareas{
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        int i = 0;
        int respuesta = 0;
        int n =  asd.nextInt();
        int p =  asd.nextInt();
        for (i = 0; i < n ; i++) {
            int tarea = asd.nextInt();
            if (tarea >= p){
                respuesta ++;
            }
            
        }
        System.out.println(respuesta);
    }
}