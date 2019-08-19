package br.dmoura.dhouse.java.exercicios.voador;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    private List<Voador> voadores = new ArrayList<>();

    public void adicionarVoador (Voador voador){
        voadores.add(voador);
    }

    public void voemTodos(){
        for (int i = 0; i < voadores.size(); i++ )
            System.out.println(voadores.get(i));
    }

}
