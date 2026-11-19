package padroesestruturais.composite;

public class Capitulo extends Secao {

    private int paginas;

    public Capitulo(String descricao, int paginas) {
        super(descricao);
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getSecao() {
        return "Capítulo: " + this.getDescricao() + " - páginas: " + this.paginas + "\n";
    }

}
