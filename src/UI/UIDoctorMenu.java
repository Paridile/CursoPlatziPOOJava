package UI;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Bienvenido: " + UIMenu.doctorLogged + "\n");
            System.out.println("1- Agendar cita");
            System.out.println("2- Mis citas");
            System.out.println("0- Cerrar sesion");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 1:

                    break;
                case 2:

                    break;
                case 0:

                    break;
                default:
                    break;
            }
        }while (response!=0);
    }

    private static void showAddAvailableAppointments() {
        int response = 0;
        do {
            System.out.println("\nGenerar cita");
            System.out.println("Selecciona un mes");
            for (int i = 0; i < 3; i++) {
                int j = i+1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Regresar");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            if (response > 0 && response < 4) {
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected]);
                System.out.println("Inserta la fecha disponible [dd/mm/yyyy]");
                String date = sc.nextLine();
                System.out.println("Tu fecha es: " + date + "\n1.Correcto\n2.Modificar");

            } else if(response == 0) {
                showDoctorMenu();
            }
        }while (response!=0);
    }

}
