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
public class anamenese_POJO {
    int id_anamnese, id_questoes, id_aluno;
    String resposta, resposta_completa;

    
    public int getId_questoes() {
        return id_questoes;
    }

    public void setId_questoes(int id_questoes) {
        this.id_questoes = id_questoes;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getResposta_completa() {
        return resposta_completa;
    }

    public void setResposta_completa(String resposta_completa) {
        this.resposta_completa = resposta_completa;
    }

   

    public int getId_anamnese() {
        return id_anamnese;
    }

    public void setId_anamnese(int id_anamnese) {
        this.id_anamnese = id_anamnese;
    }


}
