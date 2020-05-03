
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Spell___ {

    private Spell____ spell;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Spell____ getSpell() {
        return spell;
    }

    public void setSpell(Spell____ spell) {
        this.spell = spell;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
