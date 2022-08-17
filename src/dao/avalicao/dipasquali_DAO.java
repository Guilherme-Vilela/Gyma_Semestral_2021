/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.avalicao;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.avaliacao.behnke_willmore_POJO;
import semestral.pojo.avaliacao.dipasquali_POJO;

/**
 *
 * @author guilh
 */
public class dipasquali_DAO {
      Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_dipasquali","id_avalicao","peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial","IMC"};
    String tabela = "dipasquali";
    
      public int cadastro_dipasquali_pojo(dipasquali_POJO dipasquali_pojo){
    String[] coluna = {"id_avalicao","peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial","IMC"};
    String[] dados = {dipasquali_pojo.getId_avaliacao()+"",dipasquali_pojo.getPeso_perder()+"",dipasquali_pojo.getGordura_desejavel()+"",dipasquali_pojo.getPeso_magro_desejavel()+"",dipasquali_pojo.getPeso_gordura_perder()+"",
       dipasquali_pojo.getPeso_magro_ganhar()+"",dipasquali_pojo.getPeso_magro()+"",dipasquali_pojo.getPeso_gordura()+"",dipasquali_pojo.getPeso_ideal()+"",dipasquali_pojo.getIMC()+""};
        int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_dipasquali_id_avalicao(int id_avalicao){
        String[] coluna =colunas;// {colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10]};   
        String condicao = "id_avalicao = '"+id_avalicao+"'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}  
    public int deletar_dipasquali_id_dipasquali(int id_dipasquali){
    String condicao = "WHERE id_dipasquali = "+ id_dipasquali;
    int op = metodo_sql.deletar_banco(tabela, condicao);
    
    return op;
}  
    public int editar_dipasquali_pojo(dipasquali_POJO dipasquali_pojo) {
        int op = 0;
       String[] coluna = {"peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial"};
       String[] info = {dipasquali_pojo.getPeso_perder()+"",dipasquali_pojo.getGordura_desejavel()+"",dipasquali_pojo.getPeso_magro_desejavel()+"",dipasquali_pojo.getPeso_gordura_perder()+"",
       dipasquali_pojo.getPeso_magro_ganhar()+"",dipasquali_pojo.getPeso_magro()+"",dipasquali_pojo.getPeso_gordura()+"",dipasquali_pojo.getPeso_ideal()+"",dipasquali_pojo.getIMC()+""};
       String condicao = "WHERE  "+colunas[0]+"  ="+'"'+dipasquali_pojo.getId_dipasquali()+'"';
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
