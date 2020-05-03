
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Item__ {

    private Key_____________ key;
    private String name;
    private Integer id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Key_____________ getKey() {
        return key;
    }

    public void setKey(Key_____________ key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
