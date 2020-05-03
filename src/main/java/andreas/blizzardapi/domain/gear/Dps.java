
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Dps {

    private Double value;
    private String displayString;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
