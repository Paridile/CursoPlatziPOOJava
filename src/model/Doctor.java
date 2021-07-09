package model;

import model.User;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciallity;

    public Doctor(String name,String email,String speciality){
        super(name, email);
        this.speciallity = speciality;
    }


    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public  void addAvailableAppointments(Date date,String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciallity: " + speciallity + "\nAvailable " + availableAppointments;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz roja");
        System.out.println("Departamento: Cancerologia");
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

        @Override
        public String toString() {
             return "\nAvailable appointments \nDate: " + date + "\nTime: " + time;
        }
    }
}
