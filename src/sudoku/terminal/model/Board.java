package sudoku.terminal.model;

import java.util.Collection;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static sudoku.terminal.model.GameStatusEnum.*;

public class Board {
    private final List<List<Space>> spaces;

    public Board(final List<List<Space>> spaces) {
        this.spaces = spaces;
    }

    public List<List<Space>> getSpaces() {
        return spaces;
    }

    public GameStatusEnum getStatus(){
        // Verifica a lista mais interna para ver se há espaço não fixo e não nulo (Jogo não começou)
        if (spaces.stream().flatMap(Collection::stream).noneMatch(s -> !s.isFixed() && nonNull(s.getActual()))){
            return NON_STARTED;
        }

        // Verifica se há pelo menos um valor preenchido no jogo
        return spaces.stream().flatMap(Collection::stream).anyMatch(s -> isNull(s.getActual())) ? INCOMPLETE : COMPLETE;
    }

    // Verifica se há erros
    public boolean hasErrors(){
        if(getStatus() == NON_STARTED){
            return false;
        }

        // Se uma casa possuir um valor atual diferente do experado há erro
        return spaces.stream().flatMap(Collection::stream)
                .anyMatch(s -> nonNull(s.getActual()) && !s.getActual().equals(s.getExpected()));
    }

    // Adicionar um valor em uma coluna e uma linha
    public boolean changeValue(final int col, final int row, final int value){
        var space = spaces.get(col).get(row);
        if (space.isFixed()){
            return false;
        }

        space.setActual(value);
        return true;
    }

    // Apagar o valor em um campo
    public boolean clearValue(final int col, final int row){
        var space = spaces.get(col).get(row);
        if (space.isFixed()){
            return false;
        }

        space.clearSpace();
        return true;
    }

    // Reinicia o jogo
    public void reset(){
        spaces.forEach(c -> c.forEach(Space::clearSpace));
    }

    // Verifica se o jogo acabou
    public boolean gameIsFinished(){
        return !hasErrors() && getStatus().equals(COMPLETE);
    }

}
