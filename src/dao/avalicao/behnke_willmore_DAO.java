/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.avalicao;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.avaliacao.avaliacao_POJO;
import semestral.pojo.avaliacao.behnke_willmore_POJO;

/**
 *
 * @author guilh
 */
public class behnke_willmore_DAO {
      Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_behnke","id_avalicao","peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial"};
    String tabela = "behnke_willmore";
    
    
     public int cadastro_behnke_pojo(behnke_willmore_POJO behnke_pojo){
    String[] coluna = {"id_avalicao","peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial"};
    String[] dados = {behnke_pojo.getId_avaliacao()+"",behnke_pojo.getPeso_perder()+"",behnke_pojo.getGordura_desejavel()+"",behnke_pojo.getPeso_magro_desejavel()+"",behnke_pojo.getPeso_gordura_perder()+"",
        behnke_pojo.getPeso_magro_ganhar()+"",behnke_pojo.getPeso_magro()+"",behnke_pojo.getPeso_gordura()+"",behnke_pojo.getPeso_ideal()+""};
     int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_behnke_id_avalicao(int id_avalicao){
        String[] coluna = colunas;//{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9]};   
        String condicao = "id_avalicao = '"+id_avalicao+"'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
} 
    public int deletar_behnke_id_behnke(int id_behnke){
    String condicao = "WHERE id_behnke = "+ id_behnke;
    int op = metodo_sql.deletar_banco(tabela, condicao);
    return op;
}  
    public int editar_behn_pojo(behnke_willmore_POJO behnke_pojo) {
        int op = 0;
       String[] coluna = {"peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial"};
       String[] info = {behnke_pojo.getPeso_perder()+"",behnke_pojo.getGordura_desejavel()+"",behnke_pojo.getPeso_magro_desejavel()+"",behnke_pojo.getPeso_gordura_perder()+"",
        behnke_pojo.getPeso_magro_ganhar()+"",behnke_pojo.getPeso_magro()+"",behnke_pojo.getPeso_gordura()+"",behnke_pojo.getPeso_ideal()+""};
       String condicao = "WHERE "+colunas[0]+"="+'"'+behnke_pojo.getId_beh_will()+'"';
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
