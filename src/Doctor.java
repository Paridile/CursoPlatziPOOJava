public class Doctor {
     static int id = 0;
    String name;
    String speciallity;

    public Doctor() {
        System.out.println("Construyendo el objeto doctor");
        id ++;
    }

    public Doctor(String name) {
        this.name = name;
        id ++;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID: " + id);
    }
}
