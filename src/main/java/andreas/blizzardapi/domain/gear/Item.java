
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private Key__ key;
    private Integer id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Key__ getKey() {
        return key;
    }

    public void setKey(Key__ key) {
        this.key = key;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
