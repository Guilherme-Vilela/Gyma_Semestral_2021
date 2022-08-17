/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.treino;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.treinos.lista_treino_POJO;
import semestral.pojo.treinos.treino_POJO;

/**
 *
 * @author guilh
 */
public class treino_DAO {
    Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_treino","id_colaborador","estado","nivel","nome","genero","dias","especial"};
    String tabela = "treino";
      public int cadastro_treino_pojo(treino_POJO treino_pojo){
        String[] coluna = {"id_colaborador","estado","nivel","nome","genero","dias","especial"};
        String[] dados = {treino_pojo.getId_colaborador()+"",treino_pojo.getEstado()+"",treino_pojo.getNivel(),treino_pojo.getNome(), treino_pojo.getGenero(),treino_pojo.getDias(),treino_pojo.getEspecial()};  
         int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
      return op;
    }
     public String[][] buscar_treino_nome(String nome){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "nome LIKE '%"+nome+"%'"+"";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}
     public int deletar_treino_id_treino(int id_treino){
    String condicao = "WHERE id_treino = "+ id_treino;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
}
     public int editar_treino_pojo(treino_POJO treino_pojo) {
        int op = 0;
       String[] coluna = {"id_colaborador","estado","nivel","nome","genero","dias","especial"};
       String[] info = {treino_pojo.getId_colaborador()+"",treino_pojo.getEstado()+"",treino_pojo.getNivel(),treino_pojo.getNome(), treino_pojo.getGenero(),treino_pojo.getDias(),treino_pojo.getEspecial()};
       String condicao = "WHERE  "+colunas[0]+"="+treino_pojo.getId_treino()+'"';
   
    
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    }
}
