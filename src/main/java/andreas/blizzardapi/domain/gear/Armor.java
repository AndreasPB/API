
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Armor {

    private Integer value;
    private Display display;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
