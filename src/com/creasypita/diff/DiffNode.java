package com.creasypita.diff;

public final class DiffNode extends PathNode {
    public DiffNode(int i, int j, PathNode prev) {
        super(i, j, prev);
    }

    @Override
    public Boolean isSnake() {
        return false;
    }
}
