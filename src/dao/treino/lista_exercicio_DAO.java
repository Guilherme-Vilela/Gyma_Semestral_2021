/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.treino;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.treinos.lista_POJO;
import semestral.pojo.treinos.lista_exercicio_POJO;

/**
 *
 * @author guilh
 */
public class lista_exercicio_DAO {
      Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_lista_exercicio","id_lista","id_exercicio","ordem","serie","estado"};
    String tabela = "lista_exercicio";
    
          public int cadastro_lista_exercicio_pojo(lista_exercicio_POJO lista_exercicio_pojo){
        String[] coluna = {"id_lista","id_exercicio","ordem","serie","estado"};
        String[] dados = {lista_exercicio_pojo.getId_lista()+"",lista_exercicio_pojo.getId_exercicio()+"",lista_exercicio_pojo.getOrdem(),lista_exercicio_pojo.getSerie(),lista_exercicio_pojo.getEstado()+""};  
        int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_lista_exercicio_id_lista(int id_lista){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "id_lista = '"+id_lista+"'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}
    public int deletar_lista_exercio_id_lista_exercicio(int id_lista_exercicio){
    String condicao = "WHERE id_lista_exercicio = "+ id_lista_exercicio;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
}
    public int editar_lista_exercicio_pojo(lista_exercicio_POJO lista_exercicio_pojo) {
        int op = 0;
       String[] coluna = {"ordem","serie","estado"};
       String[] info = {lista_exercicio_pojo.getOrdem(),lista_exercicio_pojo.getSerie(),lista_exercicio_pojo.getEstado()+""};
       String condicao = "WHERE  "+colunas[0]+"="+lista_exercicio_pojo.getId_lista()+'"';
   
    
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
