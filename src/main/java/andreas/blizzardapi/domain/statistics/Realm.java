
package andreas.blizzardapi.domain.statistics;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Realm implements Serializable
{

    private Key__ key;
    private Name_ name;
    private Integer id;
    private String slug;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5348953523226400195L;

    public Key__ getKey() {
        return key;
    }

    public void setKey(Key__ key) {
        this.key = key;
    }

    public Name_ getName() {
        return name;
    }

    public void setName(Name_ name) {
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
