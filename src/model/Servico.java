package model;

public class Servico {
    private int id;
    private String evento;
    private String solicitante;

    public Servico() {}

    public Servico(int id, String evento, String solicitante) {
        this.id = id;
        this.evento = evento;
        this.solicitante = solicitante;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEvento() { return evento; }
    public void setEvento(String evento) { this.evento = evento; }

    public String getSolicitante() { return solicitante; }
    public void setSolicitante(String solicitante) { this.solicitante = solicitante; }
}