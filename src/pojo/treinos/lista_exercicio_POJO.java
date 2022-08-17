/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.pojo.treinos;

/**
 *
 * @author guilh
 */
public class lista_exercicio_POJO {
    int id_lista, id_exercicio, id_lista_execicio, estado;
    String ordem, serie;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId_lista() {
        return id_lista;
    }

    public void setId_lista(int id_lista) {
        this.id_lista = id_lista;
    }

    public int getId_exercicio() {
        return id_exercicio;
    }

    public void setId_exercicio(int id_exercicio) {
        this.id_exercicio = id_exercicio;
    }

    public int getId_lista_execicio() {
        return id_lista_execicio;
    }

    public void setId_lista_execicio(int id_lista_execicio) {
        this.id_lista_execicio = id_lista_execicio;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
