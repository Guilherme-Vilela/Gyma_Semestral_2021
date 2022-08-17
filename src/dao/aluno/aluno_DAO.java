/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.aluno;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.aluno.aluno_POJO;
import semestral.pojo.aluno.contato_emergencia_POJO;

/**
 *
 * @author guilh
 */
public class aluno_DAO {
    Metodos_banco metodo_sql = new Metodos_banco();
    String tabela = "alunos";
    String[] colunas = {"id_aluno","id_pessoa", "matricula", "objetivo","estado",};
    
    
      public int cadastar_aluno_pojo(aluno_POJO aluno_pojo){
    String[] coluna = {"id_pessoa", "matricula", "objetivo","estado",};
    String[] dados = {aluno_pojo.getId_pessoa()+"",aluno_pojo.getMatricula()+"",aluno_pojo.getObjetivo(),
    aluno_pojo.getEstado()+""};
    int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
    return op;
}
//id_pessoa = "+id_pessoa+" "+"AND estado = 1
    public String[][] buscar_aluno_id_pessoa(String[] id_){
        String condicao = "WHERE id_pessoa = ";
        int tamanho = id_.length;
        for (int i =0 ; i<tamanho ; i++){
        if(i == 0){
        condicao = condicao+"  "+id_[i];

        }else{
            condicao = condicao + " OR "+ " " + id_[i];
        }
        }
        condicao = condicao + " AND estado = 1";
        String[] coluna = colunas;//{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5]};
        
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}
    public int deletar_aluno_id_aluno(int id_aluno){
    String condicao = "WHERE id_aluno = "+id_aluno;
    int op = metodo_sql.deletar_banco(tabela, condicao);
    return op;
}
    public int editar_aluno_pojo(aluno_POJO aluno_pojo) {
        int op = 0;
       String[] coluna = {"matricula", "objetivo","estado"};
       String[] info = {""+aluno_pojo.getMatricula(),aluno_pojo.getObjetivo(),""+aluno_pojo.getEstado()};
       String condicao = "WHERE "+colunas[1]+"="+aluno_pojo.getId_pessoa();
       try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    }                                      
    public int buscar_id_aluno(){
        int id_aluno = -1;
        String[] coluna = {"max("+colunas[0]+")"}; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
        id_aluno = Integer.parseInt(lista[0][0]); 
    return id_aluno;
}
  public String[][] buscar_aluno_tela_aluno(String nome){
       int id_aluno = -1;
        String[] coluna = {"B.id_aluno", "A.nome", "C.data_inicio", "C.data_termino", "D.data_avaliacao"};   
        String tabelas = "pessoa as A INNER JOIN alunos as B on A.id_pessoa = B.id_pessoa LEFT JOIN treino_alunos as C on B.id_aluno = C.id_aluno LEFT JOIN avaliacoes as D on B.id_aluno = D.id_aluno";
        String condicao = "WHERE nome LIKE '%"+nome+"%'"+ " ORDER BY B.id_aluno";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabelas, condicao);
        return lista;
  }
      public aluno_POJO buscar_dados_aluno_tela_cadastro_aluno(int id_aluno){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "WHERE id_aluno =" +id_aluno;
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
        aluno_POJO aluno_pojo = new aluno_POJO();
        if (!lista[0][0].equals("")){
         aluno_pojo.setId_aluno(Integer.parseInt(lista[0][0]));
         aluno_pojo.setId_pessoa(Integer.parseInt(lista[0][1]));
         aluno_pojo.setMatricula(Integer.parseInt(lista[0][2]));
         aluno_pojo.setObjetivo(lista[0][3]);
        }else{
            JOptionPane.showMessageDialog(null, "nenhum dado do aluno encontrado.  Aluno ID "+ id_aluno);
        }
    return aluno_pojo;
}
        public int buscar_id_pessoa_id_aluno(int id_aluno){
        int id_pessoa = -1;
        String[] coluna = {"id_pessoa"}; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "WHERE id_aluno = " + id_aluno;
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
        id_pessoa = Integer.parseInt(lista[0][0]); 
    return id_pessoa;
        }
}
