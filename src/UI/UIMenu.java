package UI;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
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
                    authUser(response);
                    response = 0;
                    break;
                case 2:
                    authUser(response);
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Elige una opcion valida");
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

    private static void authUser(int userType) {
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Pablo","ejemplo@mail.com","java"));
        doctors.add(new Doctor("Otro doctor","doctor@mail.com","ninguna"));
        doctors.add(new Doctor("ejemplo","otroejemplo@mail.com","java"));

        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient("paciente","paciente@mail.com"));
        patients.add(new Patient("paciente 2","paciente2@mail.com"));
        patients.add(new Patient("paciente 3","paciente3@mail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("insert your email");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1) {
                for (Doctor d: doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if(userType == 2) {
                for (Patient p: patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        }while(!emailCorrect);

    }
}