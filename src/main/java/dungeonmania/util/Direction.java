https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package dungeonmania.util;

public enum Direction {
    UP(0, -1),
    DOWN(0, 1),
    LEFT(-1, 0),
    RIGHT(1, 0),
    NONE(0, 0);

    private final Position offset;

    private Direction(Position offset) {
        this.offset = offset;
    }

    private Direction(int x, int y) {
        this.offset = new Position(x, y);
    }

    public Position getOffset() {
        return this.offset;
    }
}
