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
public class treino_aluno_POJO {
    int id_treino, id_aluno, id_treino_aluno,estado;
    String data_inicio,data_termino;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getData_termino() {
        return data_termino;
    }

    public void setData_termino(String data_termino) {
        this.data_termino = data_termino;
    }


    public int getId_treino() {
        return id_treino;
    }

    public void setId_treino(int id_treino) {
        this.id_treino = id_treino;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getId_treino_aluno() {
        return id_treino_aluno;
    }

    public void setId_treino_aluno(int id_treino_aluno) {
        this.id_treino_aluno = id_treino_aluno;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }


}
