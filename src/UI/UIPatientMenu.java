package UI;

import java.util.Scanner;

public class UIPatientMenu {
    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("Bienvenido: " + UIMenu.patientLogged);
            System.out.println("1. Reservar cita");
            System.out.println("2. Ver mis citas");
            System.out.println("0. Cerrar sesion");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 1:

                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while(response != 0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println("  Reservar cita\n");
            System.out.println("Selecciona una fecha");

        }while (response!=0)
    }
}
