
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Realm {

    private Key_ key;
    private String name;
    private Integer id;
    private String slug;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Key_ getKey() {
        return key;
    }

    public void setKey(Key_ key) {
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
