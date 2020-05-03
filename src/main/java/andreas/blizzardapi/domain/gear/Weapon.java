
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Weapon {

    private Damage damage;
    private AttackSpeed attackSpeed;
    private Dps dps;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public AttackSpeed getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(AttackSpeed attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Dps getDps() {
        return dps;
    }

    public void setDps(Dps dps) {
        this.dps = dps;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
