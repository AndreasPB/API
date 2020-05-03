
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class PassiveSpellTooltip {

    private Spell__ spell;
    private String description;
    private String castTime;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Spell__ getSpell() {
        return spell;
    }

    public void setSpell(Spell__ spell) {
        this.spell = spell;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCastTime() {
        return castTime;
    }

    public void setCastTime(String castTime) {
        this.castTime = castTime;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
