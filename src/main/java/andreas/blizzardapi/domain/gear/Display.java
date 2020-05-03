
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Display {

    private String displayString;
    private Color color;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
