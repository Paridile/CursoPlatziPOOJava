package UI;

import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static void showMenu(){
        System.out.println("Seleccione una opcion");
        int response = 0;
        do {
            System.out.println("1- Doctor");
            System.out.println("2- Paciente");
            System.out.println("0- Salir");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    System.out.println("doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }



    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("Pacientes");
            System.out.println("1 - Agendar cita");
            System.out.println("2 - Mis sitas");
            System.out.println("0 - Regresar");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Agendar cita");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +"-> " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("Mis citas");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}