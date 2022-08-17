/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.avalicao;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.avaliacao.medida_POJO;
import semestral.pojo.avaliacao.protocolo_marinha_POJO;

/**
 *
 * @author guilh
 */
public class protocolo_marinha_DAO {
         Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_procolo_marinha","id_avalicao","peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial"};
    String tabela = "protocolo_marinha";
    
        public int cadastro_marinha_pojo(protocolo_marinha_POJO marinha_pojo){
    String[] coluna = {"id_avalicao","peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial"};
     String[] dados = {   marinha_pojo.getId_avaliacao()+"",marinha_pojo.getPeso_perder()+"",marinha_pojo.getGordura_desejavel()+"",marinha_pojo.getPeso_magro_desejavel()+"",marinha_pojo.getPeso_gordura_perder()+"",
       marinha_pojo.getPeso_magro_ganhar()+"",marinha_pojo.getPeso_magro()+"",marinha_pojo.getPeso_gordura()+"",marinha_pojo.getPeso_ideal()+"",};
       int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_marinha_id_avalicao(int id_avalicao){
        String[] coluna =colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8]};   
        String condicao = "id_avalicao = '"+id_avalicao+"'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}  
    public int deletar_marinha_id_marinha(int id_marinha){
    String condicao = "WHERE id_marinha = "+ id_marinha;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
}
    public int editar_marinha_pojo(protocolo_marinha_POJO marinha_pojo) {
        int op = 0;
       String[] coluna = {"peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial"};
       String[] info = {marinha_pojo.getPeso_perder()+"",marinha_pojo.getGordura_desejavel()+"",marinha_pojo.getPeso_magro_desejavel()+"",marinha_pojo.getPeso_gordura_perder()+"",
       marinha_pojo.getPeso_magro_ganhar()+"",marinha_pojo.getPeso_magro()+"",marinha_pojo.getPeso_gordura()+"",marinha_pojo.getPeso_ideal()+"",};
       String condicao = "WHERE  "+colunas[0]+"="+marinha_pojo.getId_protocolo()+'"';    
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
