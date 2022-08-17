/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.treino;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.treinos.treino_POJO;
import semestral.pojo.treinos.treino_aluno_POJO;

/**
 *
 * @author guilh
 */
public class treino_aluno_DAO {
    Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"treino_aluno","id_treino","id_aluno","data_inicio","estado","data_termino"};
    String tabela = "treino_aluno";
      public int cadastro_treino_aluno_pojo(treino_aluno_POJO treino_aluno_pojo){
       String[] coluna = {"id_treino","id_aluno","data_inicio","estado","data_termino"};
       String[] dados = {treino_aluno_pojo.getId_treino()+"",treino_aluno_pojo.getId_aluno()+"",treino_aluno_pojo.getData_inicio(),treino_aluno_pojo.getEstado()+"",treino_aluno_pojo.getData_termino()};  
       int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
      return op;
    }
     public String[][] buscar_treino_aluno_id_aluno(int[] id_){
          String condicao = "WHERE id_aluno = ";
        int tamanho = id_.length;
        for (int i =0 ; i<tamanho ; i++){
        if(i == 0){
        condicao = condicao+"  "+id_[i];
        }else{
            condicao = condicao + " OR "+ " " + id_[i];
        }
        }
        condicao = condicao + " AND estado = 1";
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}
    public int deletar_treino_aluno_id_treino_aluno(int id_treino_aluno){
    String condicao = "WHERE id_treino_aluno = "+ id_treino_aluno;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
}
    public int editar_treino_aluno_pojo(treino_aluno_POJO treino_aluno_pojo) {
        int op = 0;
       String[] coluna = {"id_treino","id_aluno","data_inicio","estado","data_termino"};
       String[] info = {treino_aluno_pojo.getId_treino()+"",treino_aluno_pojo.getId_aluno()+"",treino_aluno_pojo.getData_inicio(),treino_aluno_pojo.getEstado()+"",treino_aluno_pojo.getData_termino()};  
       String condicao = "WHERE  "+colunas[0]+"="+treino_aluno_pojo.getId_treino_aluno()+'"';
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    }
}
