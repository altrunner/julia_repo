package com.github.altrunner.tictactoe;

import com.github.altrunner.tictactoe.exception.FieldAlreadyMarkedException;
import com.github.altrunner.tictactoe.exception.InvalidFieldException;

public class Game {

    // TODO add a bidimensional array of Player to keep game state.
    // The array should contain null elements for empty fields and Player references for the marked ones
    //     0 | 1 | 2
    // 0   X | O |
    // 1   O | X |
    // 2   X |   | X

    /**
     * I place a mark on the field on behalf of the provided player
     *
     * @param x      coordinate of the field to place players mark on, allowed values must be 0, 1, 2
     * @param y      coordinate of the field to place players mark on, allowed values must be 0, 1, 2
     * @param player player whose mark should be placed on the field
     * @throws InvalidFieldException       if 2 < x < 0 or 2 <  y < 0
     * @throws FieldAlreadyMarkedException if field with provided coordinates is not null
     */
    public void placeMark(int x, int y, Player player) throws InvalidFieldException, FieldAlreadyMarkedException {

    }

    /**
     * I will return true if the provided player managed to mark three field in a row.
     *
     * @param player to be check for winning position
     * @return true if player wins the game
     */
    public boolean isWinner(Player player) {
        return false;
    }
}
