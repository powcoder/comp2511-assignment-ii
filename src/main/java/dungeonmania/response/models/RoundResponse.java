https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package dungeonmania.response.models;

public class RoundResponse {
    private double deltaPlayerHealth;
    private double deltaEnemyHealth;

    public RoundResponse(double deltaPlayerHealth, double deltaEnemyHealth) {
        this.deltaPlayerHealth = deltaPlayerHealth;
        this.deltaEnemyHealth = deltaEnemyHealth;
    }

    public double getDeltaCharacterHealth() {
        return deltaPlayerHealth;
    }

    public double getDeltaEnemyHealth() {
        return deltaEnemyHealth;
    }

}
