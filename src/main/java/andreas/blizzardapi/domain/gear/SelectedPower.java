
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class SelectedPower {

    private Integer id;
    private Integer tier;
    private SpellTooltip spellTooltip;
    private Boolean isDisplayHidden;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public SpellTooltip getSpellTooltip() {
        return spellTooltip;
    }

    public void setSpellTooltip(SpellTooltip spellTooltip) {
        this.spellTooltip = spellTooltip;
    }

    public Boolean getIsDisplayHidden() {
        return isDisplayHidden;
    }

    public void setIsDisplayHidden(Boolean isDisplayHidden) {
        this.isDisplayHidden = isDisplayHidden;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
