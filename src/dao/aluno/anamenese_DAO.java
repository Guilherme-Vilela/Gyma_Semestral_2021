/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.aluno;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.aluno.aluno_POJO;
import semestral.pojo.aluno.anamenese_POJO;

/**
 *
 * @author guilh
 */
public class anamenese_DAO {
    Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_anamenese","id_questoes","id_aluno","resposta","resposta_questoes"};
     String tabela = "anamenese";
     
     
        public int cadastro_anamenese_pojo(anamenese_POJO anamenese_pojo){
    String[] coluna = {"id_questoes","id_aluno","resposta","resposta_questoes"};
    String[] dados = {anamenese_pojo.getId_questoes()+"",anamenese_pojo.getId_aluno()+"",anamenese_pojo.getResposta(), anamenese_pojo.getResposta_completa()};
    int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
    return op;
}
        public String[][] buscar_anamenese_id_aluno(int id_aluno){
        String[] coluna = colunas;//{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5]};
        String condicao = "id_aluno ='"+id_aluno+"'"+"AND estado = 1";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}  
    public int deletar_anamenese_id_anamenese(int id_anamenese){
    String condicao = "WHERE id_anamenese = "+id_anamenese;
    int op = metodo_sql.deletar_banco(tabela, condicao);
    return op;
}
    public int editar_anamenese_pojo(anamenese_POJO anamenese_pojo) {
        int op = 0;
       String[] coluna = {"resposta","resposta_questoes"};
       String[] info = {anamenese_pojo.getResposta(),anamenese_pojo.getResposta_completa()};
       String condicao = "WHERE "+colunas[0]+"="+'"'+anamenese_pojo.getId_anamnese()+"'";
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
