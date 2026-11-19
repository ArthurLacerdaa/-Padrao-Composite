package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Parte extends Secao {

    private List<Secao> secoes;

    public Parte(String descricao) {
        super(descricao);
        this.secoes = new ArrayList<Secao>();
    }

    public void addSecao(Secao secao) {
        this.secoes.add(secao);
    }

    public String getSecao() {
        String saida = "";
        saida = "Parte: " + this.getDescricao() + "\n";
        for (Secao secao : secoes) {
            saida += secao.getSecao();
        }
        return saida;
    }
}
