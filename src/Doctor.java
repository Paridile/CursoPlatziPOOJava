public class Doctor {
    int id;
    String name;
    String speciallity;

    public Doctor() {
        System.out.println("Construyendo el objeto doctor");
    }

    public Doctor(String name) {
        this.name = name;
        //System.out.println("El nombre del doctor es " + name);
    }

    public void showName() {
        System.out.println(name);
    }
}
