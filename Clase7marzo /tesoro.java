import java.util.Scanner;

public class tesoro{
    public static void main(String [] args){
        int n;
        Scanner miescanner = new Scanner(System.in);
        n = miescanner.nextInt();
        for (int i= 0; i<n; i++){
            int piedrasNegras = miescanner.nextInt() *2;
            int piedrasBlancas = miescanner.nextInt();
            System.out.println(piedrasBlancas+piedrasNegras);

        }
    }
}