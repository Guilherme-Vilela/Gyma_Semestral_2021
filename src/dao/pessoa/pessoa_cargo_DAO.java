/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.pessoa;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.pessoas.pessoa_POJO;
import semestral.pojo.pessoas.pessoa_cargo_POJO;

/**
 *
 * @author guilh
 */
public class pessoa_cargo_DAO {
    Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_pessoa_cargo","id_cargo","id_pessoa","estado","data_inicio","data_termino"};
    String tabela = "pessoa_cargo";
    
       public int cadastro_pessoa_cargo_pojo(pessoa_cargo_POJO pessoa_cargo_pojo){
   String[] coluna = {"id_cargo","id_pessoa","estado","data_inicio","data_termino"};
   String[] dados = {pessoa_cargo_pojo.getId_cargo()+"",pessoa_cargo_pojo.getEstado()+"",pessoa_cargo_pojo.getData_inicio(),pessoa_cargo_pojo.getData_termino()};
     int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_pessoa_cargo_id_pessoa(int id_pessoa){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "id_pessoa = '"+id_pessoa+"'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
} 
     public int deletar_pessoa_cargo_id_pessoa_cargo(int id_pessoa_cargo){
    String condicao = "WHERE id_pessoa_cargo = "+ id_pessoa_cargo;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
}
     public int editar_pessoa_cargo_pojo(pessoa_cargo_POJO pessoa_cargo_pojo) {
        int op = 0;
       String[] coluna = {"id_cargo","estado","data_inicio","data_termino"};
       String[] info = {pessoa_cargo_pojo.getId_cargo()+"",pessoa_cargo_pojo.getEstado()+"",pessoa_cargo_pojo.getData_inicio(),pessoa_cargo_pojo.getData_termino()};
       String condicao = "WHERE  "+colunas[0]+"="+pessoa_cargo_pojo.getId_pessoa_cargo()+'"';  
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
