import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Pablo Rios";
        myDoctor.showName();
        myDoctor.showId();
        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        System.out.println(Doctor.id);

        showMenu();

        myDoctor.showId();
    }
}
