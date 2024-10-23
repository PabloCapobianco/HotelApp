package model;

public class Room {

    private int id;
    private int number;
    private int singleBeds;
    private int doubleBeds;

    // Constructor vacío
    public Room() {
    }

    // Constructor con parámetros
    public Room(int id, int number, int singleBeds, int doubleBeds) {
        this.id = id;
        this.number = number;
        this.singleBeds = singleBeds;
        this.doubleBeds = doubleBeds;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSingleBeds() {
        return singleBeds;
    }

    public void setSingleBeds(int singleBeds) {
        this.singleBeds = singleBeds;
    }

    public int getDoubleBeds() {
        return doubleBeds;
    }

    public void setDoubleBeds(int doubleBeds) {
        this.doubleBeds = doubleBeds;
    }

    // Método toString para mostrar los datos de la habitación
    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", number=" + number +
                ", singleBeds=" + singleBeds +
                ", doubleBeds=" + doubleBeds +
                '}';
    }
}
