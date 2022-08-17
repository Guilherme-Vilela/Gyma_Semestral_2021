/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.pojo.aluno;

/**
 *
 * @author guilh
 */
public class aluno_POJO {
   int id_aluno, id_pessoa, matricula,estado;
   String objetivo;
  
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
