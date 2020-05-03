
package andreas.blizzardapi.domain.statistics;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Character implements Serializable
{

    private Key_ key;
    private String name;
    private Integer id;
    private Realm realm;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4081161627711271298L;

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

    public Realm getRealm() {
        return realm;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
