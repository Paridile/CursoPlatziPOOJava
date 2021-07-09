import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
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
