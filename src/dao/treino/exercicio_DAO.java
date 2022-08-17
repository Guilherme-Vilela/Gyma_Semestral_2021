/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.treino;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.pessoas.pessoa_cargo_POJO;
import semestral.pojo.treinos.exercicio_POJO;

/**
 *
 * @author guilh
 */
public class exercicio_DAO {
    Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_exercicio","exercicio_nome","categoria","descricao","estado"};
    String tabela = "exercicios";
       public int cadastro_exercicio_pojo(exercicio_POJO exercicio_pojo){
        String[] coluna = {"exercicio_nome","categoria","descricao","estado"};
        String[] dados = {exercicio_pojo.getNome_exercicio(),exercicio_pojo.getCategoria(),exercicio_pojo.getDescricao(),exercicio_pojo.getEstado()+""};    
      int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_exercicio_nome(String exercicio_nome){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "exercicio_nome LIKE '%"+exercicio_nome+"%'"+"AND estado = 1";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}
     public int deletar_exercicio_id_exercicio(int id_exercicio){
    String condicao = "WHERE id_exercicio = "+ id_exercicio;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
}
     public int editar_exercicio_pojo(exercicio_POJO exercicio_pojo) {
        int op = 0;
       String[] coluna = {"exercicio_nome","categoria","descricao","estado"};
       String[] info = {exercicio_pojo.getNome_exercicio(),exercicio_pojo.getCategoria(),exercicio_pojo.getDescricao(),exercicio_pojo.getEstado()+""}; 
       String condicao = "WHERE  "+colunas[0]+"="+exercicio_pojo.getId_exercicio()+'"';  
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
