import java.util.Scanner;

public class Punto43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables
        String dia, turno;
        double horasTrabajadas, jornal;

        // Entrada de datos
        System.out.print("Ingrese el número de horas trabajadas: ");
        horasTrabajadas = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer

        System.out.print("Ingrese el día de la semana: ");
        dia = sc.nextLine();

        System.out.print("Ingrese el turno (diurno/nocturno): ");
        turno = sc.nextLine();

        // Lógica de cálculo
        if (!dia.equalsIgnoreCase("domingo")) {

            if (turno.equalsIgnoreCase("diurno")) {
                jornal = 5 * horasTrabajadas;
            } else {
                jornal = 8 * horasTrabajadas;
            }

        } else { // Si es domingo

            if (turno.equalsIgnoreCase("diurno")) {
                jornal = 7 * horasTrabajadas; // 5 + 2
            } else {
                jornal = 11 * horasTrabajadas; // 8 + 3
            }
        }

        // Salida
        System.out.println("El jornal diario es: " + jornal + " euros");

        sc.close();
    }
}