/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.geral;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.avaliacao.protocolo_marinha_POJO;
import semestral.pojo.geral.cargo_POJO;

/**
 *
 * @author guilh
 */
public class cargo_DAO {
     Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_cargo","funcao","horario","salario","estado"};
    String tabela = "cargo";
    
    public int cadastro_cargo_pojo(cargo_POJO cargo_pojo){
   String[] coluna = {"funcao","horario","salario","estado"};
   String[] dados = {cargo_pojo.getFuncao(),cargo_pojo.getHorario()+"",cargo_pojo.toString(),cargo_pojo.getEstado()+""};
        int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_cargo_funcao(String funcao){
        String[] coluna = colunas;//{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4]};   
        String condicao = "funcao LIKE '%"+funcao+"%'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}
    public int deletar_cargo_id_cargo(int id_cargo){
    String condicao = "WHERE id_cargo = "+ id_cargo;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
}
     public int editar_cargo_pojo(cargo_POJO cargo_pojo) {
        int op = 0;
       String[] coluna = {"peso_perder","gordura_desejavel","peso_magro_desejavel","peso_gordura_perde","peso_magro_ganhar","peso_magro","peso_gordura","peso_ideial"};
       String[] info = {cargo_pojo.getFuncao(),cargo_pojo.getHorario()+"",cargo_pojo.toString(),cargo_pojo.getEstado()+""};
       String condicao = "WHERE  "+colunas[0]+"="+cargo_pojo.getId_cargo()+'"';        
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
