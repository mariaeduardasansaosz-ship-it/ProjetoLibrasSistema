package main;

import view.ModuloConexao;
import model.Proposta;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestaProposta {

    public static void main(String[] args) {
        // Criando a proposta com vínculo ao idServico = 1
        Proposta p = new Proposta("Tradução Evento Libras", "Prefeitura", "20/08/2026", "2000,00", "Aprovado", 1);

        String sql = "INSERT INTO propostas (evento, solicitante, data_proposta, valor_proposta, status, id_servico) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexao = ModuloConexao.conector();
             PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setString(1, p.getEvento());
            pst.setString(2, p.getSolicitante());
            pst.setString(3, p.getDataProposta());
            pst.setString(4, p.getValorProposta());
            pst.setString(5, p.getStatus());
            pst.setInt(6, p.getIdServico());

            int res = pst.executeUpdate();
            if (res > 0) {
                System.out.println("✅ TESTE OK: Proposta e relacionamento com serviço cadastrados com sucesso!");
            }

        } catch (Exception e) {
            System.out.println("❌ ERRO NO TESTE: " + e.getMessage());
        }
    }
}