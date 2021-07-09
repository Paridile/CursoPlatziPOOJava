import java.util.Date;
import java.util.Locale;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Pablo", "ejemplo@ads.com", "Java");
        doctor.addAvailableAppointments(new Date(),"4 pm");
        doctor.addAvailableAppointments(new Date(),"5 pm");
        doctor.addAvailableAppointments(new Date(),"6 pm");

        Day day = Day.MONDAY;
        System.out.println(day);
        System.out.println(day.getSpanish());

        for (Doctor.AvailableAppointment aA: doctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        //showMenu();
        int i = 0;
        String name = "Pablo";
        Patient patient1 = new Patient("Pablo","Rios");
        Patient patient2 = new Patient("Nombre","Apellido");
        System.out.println(patient1.getName());
        patient1.setHeight(1.73);
        patient1.setWeight(61.6);
        patient1.setPhoneNumber("23644564");
        System.out.println(patient1.getWeight());
        System.out.println(patient1.getHeight());
        System.out.println(patient1.getPhoneNumber());
    }
}
