https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package dungeonmania.entities;

import dungeonmania.Game;
import dungeonmania.battles.BattleStatistics;

/**
 * Item has buff in battles
 */
public interface BattleItem {
    public BattleStatistics applyBuff(BattleStatistics origin);
    public void use(Game game);
    public int getDurability();
}
