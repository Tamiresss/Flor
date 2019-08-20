/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Flor {
    private Double tamanhosepala;
    private Double tamanhopetala;
    private String nomecientifico;
    private String nomepopular;
    private int ano;
    private int codigo;

    public Double getTamanhosepala() {
        return tamanhosepala;
    }

    public void setTamanhosepala(Double tamanhosepala) {
        this.tamanhosepala = tamanhosepala;
    }

    public Double getTamanhopetala() {
        return tamanhopetala;
    }

    public void setTamanhopetala(Double tamanhopetala) {
        this.tamanhopetala = tamanhopetala;
    }

    public String getNomecientifico() {
        return nomecientifico;
    }

    public void setNomecientifico(String nomecientifico) {
        this.nomecientifico = nomecientifico;
    }

    public String getNomepopular() {
        return nomepopular;
    }

    public void setNomepopular(String nomepopular) {
        this.nomepopular = nomepopular;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Flor{" + "nomepopular=" + nomepopular + '}';
    }
    
}
