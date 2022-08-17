/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.pojo.avaliacao;

/**
 *
 * @author guilh
 */
public class protocolo_marinha_POJO {
    int id_avaliacao, id_protocolo;
    double gordura, peso_magro, peso_gordura, peso_ideal, peso_perder, gordura_desejavel, peso_magro_desejavel, peso_gordura_perder, peso_magro_ganhar; 
    String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getId_protocolo() {
        return id_protocolo;
    }

    public void setId_protocolo(int id_protocolo) {
        this.id_protocolo = id_protocolo;
    }
   

    public int getId_avaliacao() {
        return id_avaliacao;
    }

    public void setId_avaliacao(int id_avaliacao) {
        this.id_avaliacao = id_avaliacao;
    }

    public double getGordura() {
        return gordura;
    }

    public void setGordura(double gordura) {
        this.gordura = gordura;
    }

    public double getPeso_magro() {
        return peso_magro;
    }

    public void setPeso_magro(double peso_magro) {
        this.peso_magro = peso_magro;
    }

    public double getPeso_gordura() {
        return peso_gordura;
    }

    public void setPeso_gordura(double peso_gordura) {
        this.peso_gordura = peso_gordura;
    }

    public double getPeso_ideal() {
        return peso_ideal;
    }

    public void setPeso_ideal(double peso_ideal) {
        this.peso_ideal = peso_ideal;
    }

    public double getPeso_perder() {
        return peso_perder;
    }

    public void setPeso_perder(double peso_perder) {
        this.peso_perder = peso_perder;
    }

    public double getGordura_desejavel() {
        return gordura_desejavel;
    }

    public void setGordura_desejavel(double gordura_desejavel) {
        this.gordura_desejavel = gordura_desejavel;
    }

    public double getPeso_magro_desejavel() {
        return peso_magro_desejavel;
    }

    public void setPeso_magro_desejavel(double peso_magro_desejavel) {
        this.peso_magro_desejavel = peso_magro_desejavel;
    }

    public double getPeso_gordura_perder() {
        return peso_gordura_perder;
    }

    public void setPeso_gordura_perder(double peso_gordura_perder) {
        this.peso_gordura_perder = peso_gordura_perder;
    }

    public double getPeso_magro_ganhar() {
        return peso_magro_ganhar;
    }

    public void setPeso_magro_ganhar(double peso_magro_ganhar) {
        this.peso_magro_ganhar = peso_magro_ganhar;
    }
}
