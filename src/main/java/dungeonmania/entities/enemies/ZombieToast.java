https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package dungeonmania.entities.enemies;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import dungeonmania.Game;
import dungeonmania.map.GameMap;
import dungeonmania.util.Position;

public class ZombieToast extends Enemy {
    public static final double DEFAULT_HEALTH = 5.0;
    public static final double DEFAULT_ATTACK = 6.0;
    private Random randGen = new Random();

    public ZombieToast(Position position, double health, double attack) {
        super(position, health, attack);
    }

    @Override
    public void move(Game game) {
        Position nextPos;
        GameMap map = game.getMap();
        List<Position> pos = getPosition().getCardinallyAdjacentPositions();
        pos = pos
            .stream()
            .filter(p -> map.canMoveTo(this, p)).collect(Collectors.toList());
        if (pos.size() == 0) {
            nextPos = getPosition();
            game.getMap().moveTo(this, nextPos);
        } else {
            nextPos = pos.get(randGen.nextInt(pos.size()));
            game.getMap().moveTo(this, nextPos);
        }

    }

}
