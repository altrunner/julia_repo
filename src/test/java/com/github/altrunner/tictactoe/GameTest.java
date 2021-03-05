package com.github.altrunner.tictactoe;

import com.github.altrunner.tictactoe.exception.FieldAlreadyMarkedException;
import com.github.altrunner.tictactoe.exception.InvalidFieldException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.github.altrunner.tictactoe.GameTest.Coordinate.coordinate;
import static com.github.altrunner.tictactoe.Player.PLAYER_O;
import static com.github.altrunner.tictactoe.Player.PLAYER_X;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void shouldNotBePossibleToPlaceAMarkOutsideTheGameField() {
        assertThatThrownBy(() -> game.placeMark(-1, 0, PLAYER_O)).isInstanceOf(InvalidFieldException.class);
        assertThatThrownBy(() -> game.placeMark(0, -1, PLAYER_O)).isInstanceOf(InvalidFieldException.class);
        assertThatThrownBy(() -> game.placeMark(3, 0, PLAYER_O)).isInstanceOf(InvalidFieldException.class);
        assertThatThrownBy(() -> game.placeMark(0, 3, PLAYER_O)).isInstanceOf(InvalidFieldException.class);
    }

    @Test
    void shouldNotBePossibleToMarkAlreadyMarkedFields() throws Exception {
        game.placeMark(1, 1, PLAYER_O);

        assertThatThrownBy(() -> game.placeMark(1, 1, PLAYER_O)).isInstanceOf(FieldAlreadyMarkedException.class);
        assertThatThrownBy(() -> game.placeMark(1, 1, PLAYER_X)).isInstanceOf(FieldAlreadyMarkedException.class);
    }

    @Test
    void thereAreNoWinnersInANewGame() {
        assertThat(game.isWinner(PLAYER_O)).isFalse();
        assertThat(game.isWinner(PLAYER_X)).isFalse();
    }

    @ParameterizedTest
    @MethodSource("winningPositions")
    void testWinningPositions(Coordinate field1, Coordinate field2, Coordinate field3) throws Exception {
        game.placeMark(field1.x, field1.y, PLAYER_O);
        game.placeMark(field2.x, field2.y, PLAYER_O);
        game.placeMark(field3.x, field3.y, PLAYER_O);

        assertThat(game.isWinner(PLAYER_O)).isTrue();
        assertThat(game.isWinner(PLAYER_X)).isFalse();
    }

    private static Stream<Arguments> winningPositions() {
        return Stream.of(
            // Vertical
            Arguments.of(coordinate(0, 0), coordinate(0, 1), coordinate(0, 2)),
            Arguments.of(coordinate(1, 0), coordinate(1, 1), coordinate(1, 2)),
            Arguments.of(coordinate(2, 0), coordinate(2, 1), coordinate(2, 2)),

            // Horizontal
            Arguments.of(coordinate(0, 0), coordinate(1, 0), coordinate(2, 0)),
            Arguments.of(coordinate(0, 1), coordinate(1, 1), coordinate(2, 1)),
            Arguments.of(coordinate(0, 2), coordinate(1, 2), coordinate(2, 2)),

            // Diagonal
            Arguments.of(coordinate(0, 0), coordinate(1, 1), coordinate(2, 2)),
            Arguments.of(coordinate(2, 0), coordinate(1, 1), coordinate(0, 2))
        );
    }


    static class Coordinate {
        private final int x;
        private final int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        static Coordinate coordinate(int x, int y) {
            return new Coordinate(x, y);
        }
    }
}