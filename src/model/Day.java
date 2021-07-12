package model;

public enum Day {
    MONDAY("Lunes"),
    FRIDAY("Viernes"),
    SATURDAY("Sábado"),
    SUNDAY("Domingo");

    private String spanish;
    Day(String s) {
        spanish = s;
    }

    public String getSpanish() {
        return spanish;
    }


}
