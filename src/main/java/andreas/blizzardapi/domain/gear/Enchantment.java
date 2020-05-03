
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Enchantment {

    private String displayString;
    private SourceItem sourceItem;
    private Integer enchantmentId;
    private EnchantmentSlot enchantmentSlot;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public SourceItem getSourceItem() {
        return sourceItem;
    }

    public void setSourceItem(SourceItem sourceItem) {
        this.sourceItem = sourceItem;
    }

    public Integer getEnchantmentId() {
        return enchantmentId;
    }

    public void setEnchantmentId(Integer enchantmentId) {
        this.enchantmentId = enchantmentId;
    }

    public EnchantmentSlot getEnchantmentSlot() {
        return enchantmentSlot;
    }

    public void setEnchantmentSlot(EnchantmentSlot enchantmentSlot) {
        this.enchantmentSlot = enchantmentSlot;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
