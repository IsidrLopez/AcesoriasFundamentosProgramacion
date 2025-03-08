import java.util.Scanner;

public class Prog3{
    public static void main(String[] args){
        Scanner sc = newScanner(System.in);
        String palabra = sc.nextLine();
        String aux = "";
        
        for (int i = palabra.length()-1; i >= 0; i--) {
            aux = aux+ palabra.charAt(i);        
        }
        
        if (aux.equals(palabra)){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }
}