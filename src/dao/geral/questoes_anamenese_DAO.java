/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.geral;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.geral.cargo_POJO;
import semestral.pojo.geral.questoes_anamenese_POJO;

/**
 *
 * @author guilh
 */
public class questoes_anamenese_DAO {
     Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_questao","texto_questao","ordem","estado"};
    String tabela = "questoes_anamenese";
    
    public int cadastro_questoes_pojo(questoes_anamenese_POJO questoes_anamenese_pojo){
   String[] coluna = {"texto_questao","ordem","estado"};
   String[] dados = {questoes_anamenese_pojo.getTexto_questao(),questoes_anamenese_pojo.getOrdem()+"",questoes_anamenese_pojo.getEstado()+""};
     int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_questao_texto_questao(String questao){
        String[] coluna = colunas;//{colunas[0],colunas[1],colunas[2],colunas[3]};   
        String condicao = "funcao LIKE '%"+questao+"%'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
} 
    public int deletar_questao_id_questao(int id_questao){
    String condicao = "WHERE id_questao = "+ id_questao;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
}  
    public int editar_questoes_pojo(questoes_anamenese_POJO questoes_anamenese_pojo) {
        int op = 0;
       String[] coluna = {"texto_questao","ordem","estado"};
       String[] info = {questoes_anamenese_pojo.getTexto_questao(),questoes_anamenese_pojo.getOrdem()+"",questoes_anamenese_pojo.getEstado()+""};
       String condicao = "WHERE  "+colunas[0]+"="+questoes_anamenese_pojo.getId_questoes()+'"';        
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
