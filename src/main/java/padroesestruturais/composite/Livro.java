package padroesestruturais.composite;

public class Livro {

    private Secao sumario;

    public void setSumario(Secao sumario) {
        this.sumario = sumario;
    }

    public String getSumario() {
        if (this.sumario == null) {
            throw new NullPointerException("Livro sem sumário");
        }
        return this.sumario.getSecao();
    }
}
