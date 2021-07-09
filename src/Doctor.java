public class Doctor {
     static int id = 0;
    String name;
    String speciallity;

    public Doctor() {
        System.out.println("Construyendo el objeto doctor");
    }
    
    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor es: " +name);
        id++;
        this.name = name;
        this.speciality = speciality;
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
