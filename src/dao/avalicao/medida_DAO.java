/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.avalicao;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.avaliacao.dipasquali_POJO;
import semestral.pojo.avaliacao.medida_POJO;

/**
 *
 * @author guilh
 */
public class medida_DAO {
     Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_medida","id_avalicao","estatura","cir_abd_uml","peso_corporal","gordura_p","cir_abd_inf","cir_quadril","cir_pescoco"};
    String tabela = "medidas";
    
     public int cadastro_medidas_pojo(medida_POJO medida_pojo){
    String[] coluna = {"id_avalicao","estatura","cir_abd_uml","peso_corporal","gordura_p","cir_abd_inf","cir_quadril","cir_pescoco"};
    String[] dados = {medida_pojo.getId_avalicao()+"",medida_pojo.getEstatura()+"",medida_pojo.getCirc_uml()+"",medida_pojo.getPeso_corporal()+"",medida_pojo.getGordura()+"",medida_pojo.getCirc_inf()+"",medida_pojo.getCirc_quadril()+"",medida_pojo.getCirc_pescoco()+""};
    int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
    return op;
    }
     public String[][] buscar_medida_id_avalicao(int id_avalicao){
        String[] coluna = colunas;//{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8]};   
        String condicao = "id_avalicao = '"+id_avalicao+"'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}  
    public int deletar_medida_id_medida(int id_medida){
    String condicao = "WHERE id_medida = "+ id_medida;
    int op = metodo_sql.deletar_banco(tabela, condicao);
    
    return op;
}
    public int editar_medida_pojo(medida_POJO medida_pojo) {
        int op = 0;
       String[] coluna = {"peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial"};
       String[] info = {medida_pojo.getEstatura()+"",medida_pojo.getCirc_uml()+"",medida_pojo.getPeso_corporal()+"",medida_pojo.getGordura()+"",medida_pojo.getCirc_inf()+"",medida_pojo.getCirc_quadril()+"",medida_pojo.getCirc_pescoco()+""};
       String condicao = "WHERE  "+colunas[0]+"="+medida_pojo.getId_medida()+'"';
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
