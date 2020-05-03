
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class SellPrice {

    private Integer value;
    private DisplayStrings displayStrings;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public DisplayStrings getDisplayStrings() {
        return displayStrings;
    }

    public void setDisplayStrings(DisplayStrings displayStrings) {
        this.displayStrings = displayStrings;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
