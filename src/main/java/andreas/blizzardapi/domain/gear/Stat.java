
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Stat {

    private Type type;
    private Integer value;
    private Display_ display;
    private Boolean isNegated;
    private Boolean isEquipBonus;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Display_ getDisplay() {
        return display;
    }

    public void setDisplay(Display_ display) {
        this.display = display;
    }

    public Boolean getIsNegated() {
        return isNegated;
    }

    public void setIsNegated(Boolean isNegated) {
        this.isNegated = isNegated;
    }

    public Boolean getIsEquipBonus() {
        return isEquipBonus;
    }

    public void setIsEquipBonus(Boolean isEquipBonus) {
        this.isEquipBonus = isEquipBonus;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
