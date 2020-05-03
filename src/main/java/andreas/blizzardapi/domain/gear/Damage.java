
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Damage {

    private Integer minValue;
    private Integer maxValue;
    private String displayString;
    private DamageClass damageClass;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getMinValue() {
        return minValue;
    }

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public DamageClass getDamageClass() {
        return damageClass;
    }

    public void setDamageClass(DamageClass damageClass) {
        this.damageClass = damageClass;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
