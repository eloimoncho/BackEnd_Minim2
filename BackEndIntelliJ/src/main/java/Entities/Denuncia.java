package Entities;

public class Denuncia {
    //Atributos
    private String date;
    private String informer;
    private String message;

    //Constructor
    public Denuncia(){}
    public Denuncia(String date, String informer, String message) {
        this.date = date;
        this.informer = informer;
        this.message = message;
    }

    //Getters y Setters

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInformer() {
        return informer;
    }

    public void setInformer(String informer) {
        this.informer = informer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
