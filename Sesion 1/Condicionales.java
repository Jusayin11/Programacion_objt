import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;

        System.out.println("Digite a: ");
        a = sc.nextInt();
        System.out.println();
        System.out.println("Digite b");
        b = sc.nextInt();
        if(a <= b){
            System.out.println("Orden creciente");
        }else{
            System.out.println("Orden decreciente");

        }
        sc.close();
        

    }
}
