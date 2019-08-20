/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Flor;
/**
 *
 * @author Administrador
 */
public class DaoFlor {
  public static boolean inserir(Flor objeto) {
        String sql = "INSERT INTO flor (tamanhosepala, tamanhopetala, nomecientifico, nomepopular, ano) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, objeto.getTamanhosepala());
            ps.setDouble(2, objeto.getTamanhopetala());
            ps.setString(3, objeto.getNomecientifico());
            ps.setString(4, objeto.getNomepopular());
            ps.setInt(5, objeto.getAno());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
  public static void main(String[] args) {
        Flor objeto = new Flor();
        objeto.setTamanhosepala(3.1);
        objeto.setTamanhopetala(3.1);
        objeto.setNomecientifico("Hyoranga");
        objeto.setNomepopular("Hortência");
        objeto.setAno(2018);
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
  public static boolean alterar(Flor objeto) {
        String sql = "UPDATE flor SET tamanhosepala = ?, tamanhopetala = ?, nomecientifico = ?, nomepopular = ?, ano = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, objeto.getTamanhosepala()); 
            ps.setDouble(2, objeto.getTamanhopetala());
            ps.setString(3, objeto.getNomecientifico());
            ps.setString(4, objeto.getNomepopular());
            ps.setInt(5, objeto.getAno());
            ps.setInt(6, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
    }
  public static boolean excluir(Flor objeto) {
        String sql = "DELETE FROM flor WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
