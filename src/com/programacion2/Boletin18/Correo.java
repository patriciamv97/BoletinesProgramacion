package com.programacion2.Boletin18;

public class Correo {
    private String asunto;
    private String contido;
    private boolean id;

    public Correo(){

    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Correo(String asunto, String contido, boolean id) {
        this.asunto=asunto;
        this.contido = contido;
        this.id = id;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public boolean getId() {
        return id;
    }

    public void setId(boolean id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "asunto=" + asunto + ", contido= " + contido + ", id= " + id ;
    }
}
