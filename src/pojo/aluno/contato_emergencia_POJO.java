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
public class contato_emergencia_POJO {
    int id_emergencia,status,numero,id_aluno;
    String nome,telefone,endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId_emergencia() {
        return id_emergencia;
    }

    public void setId_emergencia(int id_emergencia) {
        this.id_emergencia = id_emergencia;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}
