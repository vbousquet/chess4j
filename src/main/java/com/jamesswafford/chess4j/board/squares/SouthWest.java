package com.jamesswafford.chess4j.board.squares;


import java.util.Optional;

public final class SouthWest extends Direction {

    private static final SouthWest INSTANCE = new SouthWest();

    private SouthWest() {
    }

    @Override
    public Optional<Square> next(Square sq) {
        return Square.valueOf(sq.file().west(), sq.rank().south());
    }

    public static SouthWest getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean isDiagonal() {
        return true;
    }

    @Override
    public int value() {
        return 5;
    }
}
