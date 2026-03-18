import java.util.Scanner;

public class Punto47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 4.7 se desea realizar una estadistica de los pesos de los alumnos
         * de un colegio de acueerdo con la siguiente tabla:
         * Alumnos de menos de 40 kg
         * Alumnos entre 40 y 50 kg
         * Alumnos de ams de 50 kg y menos de 60 kg
         * Alumnos de mas o igual a 60 kg
         */
        System.out.println("Cuantos alumnos desea ingresar: ");
        int cantidadAlumnos = sc.nextInt();
        for (int i = 1; i <= cantidadAlumnos; i++) {

            System.out.println("Digite el peso: ");
            int peso = sc.nextInt();
            if (peso < 40) {
                System.out.println("menos de 40 kg");
            } else {
                if (peso >= 40 && peso < 50) {
                    System.out.println("entre de 40 kg  y menos de 50 kg");
                } else {
                    if (peso >= 50 && peso < 60) {
                        System.out.println("mas de 50 kg y menos de 60 kg");
                    } else {
                        System.out.println("mas o igual a 60 kg");
                    }
                }
                
            }
            

        }
        sc.close();

    }

}