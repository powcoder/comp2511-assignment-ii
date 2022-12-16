https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package dungeonmania.entities;

import dungeonmania.map.GameMap;
import dungeonmania.entities.enemies.Spider;
import dungeonmania.util.Position;

public class Wall extends Entity {
    public Wall(Position position) {
        super(position.asLayer(Entity.CHARACTER_LAYER));
    }

    @Override
    public boolean canMoveOnto(GameMap map, Entity entity) {
        return entity instanceof Spider;
    }

    @Override
    public void onOverlap(GameMap map, Entity entity) {
        return;
    }

    @Override
    public void onMovedAway(GameMap map, Entity entity) {
        return;
    }

    @Override
    public void onDestroy(GameMap gameMap) {
        return;
    }
}
