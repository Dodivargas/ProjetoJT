package modelo;

import jdk.nashorn.internal.objects.NativeDataView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Pessoa {

    private String nome;
    private int id;
    private ArrayList<Atividade> atividades;


    public Pessoa(String nome) {
        this.nome = nome;
        atividades = new ArrayList<Atividade>();
    }

    public Pessoa(){
        atividades = new ArrayList<Atividade>();
    }


    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaAtividadeDia(Atividade atividade){
        atividades.add(atividade);
        Collections.sort(atividades);
    }
    public void removeAtividadeDia(String atividadeRemover){

        for (int i = 0 ;i<atividades.size();i++){

            if(atividadeRemover == atividades.get(i).getNome()){

                atividades.remove(atividades.get(i));
            }
        }
        Collections.sort(atividades);
    }
    public void editaAtividade(String atividadeARemover, Atividade atividade){

        for (int i = 0 ;i<atividades.size();i++){

            if(atividadeARemover == atividades.get(i).getNome()){
                atividades.remove(i);
                atividades.add(i,atividade);
            }
        }

    }

}