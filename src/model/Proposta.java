package model;

public class Proposta {
    private int id;
    private String evento;
    private String solicitante;
    private String dataProposta;
    private double valorProposta; // Alterado/Adicionado para calculo
    private String status;
    private int idServico;

    public Proposta() {}

    public Proposta(String evento, String solicitante, String dataProposta, double valorProposta, String status, int idServico) {
        this.evento = evento;
        this.solicitante = solicitante;
        this.dataProposta = dataProposta;
        this.valorProposta = valorProposta;
        this.status = status;
        this.idServico = idServico;
    }

    // Regra de Negócio para o Teste Unitário:
    // Calcula o valor final com desconto percentual
    public double calcularValorComDesconto(double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido!");
        }
        return this.valorProposta - (this.valorProposta * (percentualDesconto / 100.0));
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

    public double getValorProposta() { return valorProposta; }
    public void setValorProposta(double valorProposta) { this.valorProposta = valorProposta; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getIdServico() { return idServico; }
    public void setIdServico(int idServico) { this.idServico = idServico; }
}