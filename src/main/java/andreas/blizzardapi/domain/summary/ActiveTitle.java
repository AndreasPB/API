
package andreas.blizzardapi.domain.summary;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ActiveTitle implements Serializable
{

    private Key______ key;
    private String name;
    private Integer id;
    private String displayString;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8126518530809169144L;

    public Key______ getKey() {
        return key;
    }

    public void setKey(Key______ key) {
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
