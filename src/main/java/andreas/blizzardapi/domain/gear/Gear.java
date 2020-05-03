
package andreas.blizzardapi.domain.gear;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Gear {

    private Links links;
    private Character character;
    private List<EquippedItem> equipped_items;
    private Map<String, Object> additional_properties = new HashMap<String, Object>();

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<EquippedItem> getEquipped_items() {
        return equipped_items;
    }

    public void setEquipped_items(List<EquippedItem> equipped_items) {
        this.equipped_items = equipped_items;
    }

    public Map<String, Object> getAdditional_properties() {
        return this.additional_properties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additional_properties.put(name, value);
    }

}
