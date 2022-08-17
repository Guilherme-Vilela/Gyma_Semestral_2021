/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.pojo.treinos;

/**
 *
 * @author guilh
 */
public class exercicio_POJO {
    int id_exercicio, estado;
    String nome_exercicio, categoria, descricao;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_exercicio() {
        return id_exercicio;
    }

    public void setId_exercicio(int id_exercicio) {
        this.id_exercicio = id_exercicio;
    }

    public String getNome_exercicio() {
        return nome_exercicio;
    }

    public void setNome_exercicio(String nome_exercicio) {
        this.nome_exercicio = nome_exercicio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
