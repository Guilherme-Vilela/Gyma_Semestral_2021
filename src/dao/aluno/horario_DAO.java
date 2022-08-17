/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.aluno;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.aluno.aluno_POJO;
import semestral.pojo.aluno.contato_emergencia_POJO;
import semestral.pojo.aluno.horario_POJO;
import semestral.pojo.pessoas.pessoa_POJO;

/**
 *
 * @author guilh
 */
public class horario_DAO {
    Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_horario","id_aluno","dia_semana","turno","horario"};
    String tabela = "horario";
    
    
         public int cadastro_horario_pojo(horario_POJO horario_pojo){
    String[] coluna = {"id_aluno","dia_semana","turno","horario"};
    String[] dados = {horario_pojo.getId_aluno()+"",horario_pojo.getDia_semana(),horario_pojo.getTurno(),horario_pojo.getHorario()};
     int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
    return op;
}

   public String[][] buscar_horario_id_aluno(int id_aluno){
        String[] coluna = colunas;//{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4]};
        String condicao = "id_aluno = '"+id_aluno+"'"+"AND estado = 1";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}  
   public int deletar_horario_id_horario(int id_horario){
    String condicao = "WHERE id_horario = "+ id_horario;
    int op = metodo_sql.deletar_banco(tabela, condicao);
    return op;
}   
   public int editar_horario_pojo(horario_POJO horario_pojo) {
        int op = 0;
       String[] coluna = {"dia_semana","turno","horario"};
       String[] info = {horario_pojo.getDia_semana(),horario_pojo.getTurno(),horario_pojo.getHorario()};
       String condicao = "WHERE "+colunas[0]+"="+horario_pojo.getId_horario();
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
   public List buscar_dados_horario_tela_cadastro_aluno(int id_aluno){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "WHERE id_aluno = " + id_aluno;
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
        int tamanho = lista.length;
        List array = new ArrayList();
        if (!lista[0][0].equals("")){
        for(int i=0 ; i< tamanho ; i++){
        horario_POJO horario_pojo = new horario_POJO();
        horario_pojo.setId_horario(Integer.parseInt(lista[i][0]));
        horario_pojo.setId_aluno(Integer.parseInt(lista[i][1]));
        horario_pojo.setDia_semana(lista[i][2]);
        horario_pojo.setTurno(lista[i][3]);
        horario_pojo.setHorario((lista[i][4]));
        array.add(horario_pojo);
        }
         }else{
            JOptionPane.showMessageDialog(null, "nenhum dado referente ao horario do aluno com  id_aluno "+ id_aluno+" encontrado");
        }
       // ajustar set genero
    return array;
}
    public int verificar_horario_tela_cadastro_aluno(int id_aluno, String dia){
        int resposta = 0;
        String[] coluna = {"id_horario"};//{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4]};
        String condicao = "WHERE id_aluno = "+'"'+id_aluno+'"'+" AND dia_semana = "+'"'+dia+'"';
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
        if(!lista[0][0].equals("")){
        resposta = Integer.parseInt(lista[0][0]);    
        }
        
        return resposta;   
    }
}
