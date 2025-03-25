package sudoku.terminal.model;

public class Space {
    // Valor atual
    private Integer actual;
    // Valor esperado
    private final int expected;
    // Variável que analisa que p número é fixo (já existe) do jogo
    private final boolean fixed;


    public Space(final int expected, final boolean fixed) {
        this.expected = expected;
        this.fixed = fixed;
        if (fixed){
            actual = expected;
        }
    }

    public Integer getActual() {
        return actual;
    }

    //Valor fixo não pode ser alterado se não for faz a edição
    public void setActual(final Integer actual) {
        if (fixed) return;
        this.actual = actual;
    }

    // Apaga o valor de um campo
    public void clearSpace(){
        setActual(null);
    }

    public int getExpected() {
        return expected;
    }

    public boolean isFixed() {
        return fixed;
    }
}
