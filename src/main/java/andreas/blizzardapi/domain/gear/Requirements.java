
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Requirements {

    private Level_ level;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Level_ getLevel() {
        return level;
    }

    public void setLevel(Level_ level) {
        this.level = level;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
