import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        showMenu();
        Patient patient1 = new Patient("Pablo","Rios");
        Patient patient2 = new Patient("Nombre","Apellido");
        System.out.println(patient1.name);
        System.out.println(patient2.name);
        patient2 = patient;
        System.out.println(patient1.name);
        System.out.println(patient2.name);
    }
}
