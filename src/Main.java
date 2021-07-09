import model.Doctor;
import model.Patient;
import model.User;

import java.util.*;

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

        System.out.println(patient1);
        System.out.println(doctor);

        User user = new Doctor("Pablo", "ejemplosdf.com", "java");
        user.showDataUser();

        User userPa = new Patient("Otro","asd@sdf.com");
        userPa.showDataUser();
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        map.put(11,"Ejemplo Map");
        treeMap.put(22,"Ejemplo con treeMap");
        linkedHashMap.put(33,"Ejemplo linkedHashMap");

        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
        it = linkedHashMap.keySet().iterator();

        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
        }
        it = treeMap.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
        }

    }
}
