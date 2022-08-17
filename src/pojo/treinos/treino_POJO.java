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
public class treino_POJO {
    int id_treino, id_colaborador,estado;
    String nome, nivel, genero,dias,especial;

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
   

    public int getId_colaborador() {
        return id_colaborador;
    }

    public void setId_colaborador(int id_colaborador) {
        this.id_colaborador = id_colaborador;
    }
    
    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId_treino() {
        return id_treino;
    }

    public void setId_treino(int id_treino) {
        this.id_treino = id_treino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
}
