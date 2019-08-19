package br.dmoura.dhouse.java.revisao.impressora;

public class Principal {

    public static void main(String[] args) {

        Contrato novoContrato = new Contrato("Canon", "Boleto");
        Foto novaFoto = new Foto("Verão 2019", "Preta e Branca");
        Documento novoDocumento = new Documento("Contas a Receber", ".docx");
        Impressora novaImpressora = new Impressora();

        novaImpressora.adicionarImprimivel(novoContrato);
        novaImpressora.adicionarImprimivel(novaFoto);
        novaImpressora.adicionarImprimivel(novoDocumento);

        novaImpressora.imprimirTudo();

    }
}
