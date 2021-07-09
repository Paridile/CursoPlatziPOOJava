import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private static int id = 0;
    private String name;
    private String speciallity;

    public Doctor() {
        System.out.println("Construyendo el objeto doctor");
    }
    
    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor es: " +name);
        id++;
        this.name = name;
        this.speciallity = speciality;
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

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public  void addAvailableAppointments(Date date,String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
