package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack example = new BishopBlack(Cell.F8);
        Cell expected = Cell.F8;
        assertEquals(example.position(), expected);
    }

    @Test
    public void testCopy() {
        BishopBlack example = new BishopBlack(Cell.F8);
        assertEquals(example.copy(Cell.F6).position(), Cell.F6);
    }

    @Test
    public void testWay() {
        BishopBlack example = new BishopBlack(Cell.C1);
        Cell[] result = example.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(result, expected);
    }
}