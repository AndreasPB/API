
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class NameDescription {

    private String displayString;
    private Color__ color;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public Color__ getColor() {
        return color;
    }

    public void setColor(Color__ color) {
        this.color = color;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
