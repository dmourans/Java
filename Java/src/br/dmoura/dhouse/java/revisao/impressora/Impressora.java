package br.dmoura.dhouse.java.revisao.impressora;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    private List<Imprimivel> imprimiveis = new ArrayList<>();

    public void adicionarImprimivel(Imprimivel umImprimivel) {
        imprimiveis.add(umImprimivel);
    }

    public void imprimirTudo() {
        for (int i = 0; i < imprimiveis.size(); i++)
            imprimiveis.get(i).imprimir();
    }

}
