/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.treino;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.treinos.lista_exercicio_POJO;
import semestral.pojo.treinos.lista_treino_POJO;

/**
 *
 * @author guilh
 */
public class lista_treino_DAO {
      Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_lista_treino","id_treino","id_lista"};
    String tabela = "lista_treino";
    public int cadastro_lista_treino_pojo(lista_treino_POJO lista_treino){
        String[] coluna = {"id_treino","id_lista"};
        String[] dados = {lista_treino.getId_treino()+"",lista_treino.getId_lista()+""};  
          int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_lista_treino_id_lista(int id_lista){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "id_lista = '"+id_lista+"'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}
      public String[][] buscar_lista_treino_id_treino(int id_treino){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "id_treino = '"+id_treino+"'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}
     public int deletar_lista_treino_id_lista_treino(int id_lista_treino){
    String condicao = "WHERE id_lista_treino = "+ id_lista_treino;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
}
     public int editar_lista_treino_pojo(lista_treino_POJO lista_treino_pojo) {
        int op = 0;
       String[] coluna = {"id_treino","id_lista"};
       String[] info = {lista_treino_pojo.getId_treino()+"",lista_treino_pojo.getId_lista()+""};
       String condicao = "WHERE  "+colunas[0]+"="+lista_treino_pojo.getId_lista_treino()+'"';
   
    
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    }
}
