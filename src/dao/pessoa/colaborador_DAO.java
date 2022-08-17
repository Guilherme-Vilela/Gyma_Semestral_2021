/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.pessoa;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.geral.questoes_anamenese_POJO;
import semestral.pojo.pessoas.colaborador_POJO;

/**
 *
 * @author guilh
 */
public class colaborador_DAO {
    Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_colaborador","id_pessoa","pis","carteira_trabalho","estado"};
    String tabela = "colaborador";
    
     public int cadastro_colaborador_pojo(colaborador_POJO colaborador_pojo){
    String[] coluna = {"id_pessoa","pis","carteira_trabalho","estado"};
     String[] dados = {colaborador_pojo.getId_pessoa()+"",colaborador_pojo.getPis(),colaborador_pojo.getCarteira_trabalho(),colaborador_pojo.getEstado()+""};
     int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_colaborador_id_pessoa(int id_pessoa){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4]};   
        String condicao = "id_pessoa = '"+id_pessoa+"'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
} 
     public int deletar_colaborador_id_colaborador(int id_colaborador){
    String condicao = "WHERE id_colaborador = "+ id_colaborador;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
} 
     public int editar_colaborador_pojo(colaborador_POJO colaborador_pojo) {
        int op = 0;
       String[] coluna = {"pis","carteira_trabalho","estado"};
       String[] info = {colaborador_pojo.getPis(),colaborador_pojo.getCarteira_trabalho(),colaborador_pojo.getEstado()+""};
       String condicao = "WHERE  "+colunas[0]+"="+colaborador_pojo.getId_colaborador()+'"';
            
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
