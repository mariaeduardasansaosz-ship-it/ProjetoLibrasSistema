package model;

public class Proposta {
    private int id;
    private String evento;
    private String solicitante;
    private String dataProposta;
    private String valorProposta;
    private String status;
    private int idServico; // Campo novo que liga ao Serviço!

    public Proposta() {}

    public Proposta(String evento, String solicitante, String dataProposta, String valorProposta, String status, int idServico) {
        this.evento = evento;
        this.solicitante = solicitante;
        this.dataProposta = dataProposta;
        this.valorProposta = valorProposta;
        this.status = status;
        this.idServico = idServico;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEvento() { return evento; }
    public void setEvento(String evento) { this.evento = evento; }

    public String getSolicitante() { return solicitante; }
    public void setSolicitante(String solicitante) { this.solicitante = solicitante; }

    public String getDataProposta() { return dataProposta; }
    public void setDataProposta(String dataProposta) { this.dataProposta = dataProposta; }

    public String getValorProposta() { return valorProposta; }
    public void setValorProposta(String valorProposta) { this.valorProposta = valorProposta; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getIdServico() { return idServico; }
    public void setIdServico(int idServico) { this.idServico = idServico; }
}
