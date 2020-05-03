
package andreas.blizzardapi.domain.summary;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Guild implements Serializable
{

    private Key____ key;
    private String name;
    private Integer id;
    private Realm_ realm;
    private Faction_ faction;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5854652685876697728L;

    public Key____ getKey() {
        return key;
    }

    public void setKey(Key____ key) {
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

    public Realm_ getRealm() {
        return realm;
    }

    public void setRealm(Realm_ realm) {
        this.realm = realm;
    }

    public Faction_ getFaction() {
        return faction;
    }

    public void setFaction(Faction_ faction) {
        this.faction = faction;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
