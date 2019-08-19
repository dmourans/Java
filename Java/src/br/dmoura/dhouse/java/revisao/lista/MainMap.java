package br.dmoura.dhouse.java.revisao.lista;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Shurato");
        mapa.put(2, "Cavaleiros do Zodiaco");
        mapa.put(3, "Yu-Yu Hakusho");
        mapa.put(4, "Changeman");

        mapa.remove(4);

        for (Integer chave :mapa.keySet()){
            String valor = mapa.get(chave);
            System.out.println(valor);
        }

    }

}
