/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.avalicao;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.aluno.horario_POJO;
import semestral.pojo.avaliacao.avaliacao_POJO;

/**
 *
 * @author guilh
 */
public class avalicao_DAO {
     Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_avalicao","id_colaborador", "id_aluno", "data_avalicao","estado"};
    String tabela = "avalicao";
    
    
    
     public int cadastro_avalicao_pojo(avaliacao_POJO avaliacao_pojo){
    String[] coluna = {"id_colaborador", "id_aluno", "data_avalicao","estado"};
     String[] dados = {avaliacao_pojo.getId_colaborador()+"",avaliacao_pojo.getId_aluno()+"",avaliacao_pojo.getData(),avaliacao_pojo.getEstado()+""};
    int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
    return op;
    }
     public String[][] buscar_avalicao_id_aluno(int[] id_){
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
        String[] coluna = {colunas[0],colunas[1],colunas[2],colunas[3],colunas[4]};   
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}    
    public String[][] buscar_avalicao_id_colaborador(int id_colaborador){
        String[] coluna = colunas;//{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4]};
        String condicao = "id_aluno = '"+id_colaborador+"'"+"AND estado = 1";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}  
    public int deletar_avalicao_id_avalicao(int id_avalicao){
    String condicao = "WHERE id_avalicao = "+ id_avalicao;
    int op = metodo_sql.deletar_banco(tabela, condicao);
    return op;
}   
    public int editar_avalicao_pojo(avaliacao_POJO avalicao_pojo) {
        int op = 0;
       String[] coluna = {"data_avalicao","estado"};
       String[] info = {avalicao_pojo.getData(),avalicao_pojo.getEstado()+""};
      String condicao = "WHERE "+colunas[0]+"="+'"'+avalicao_pojo.getId_avaliacao()+"'";
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
