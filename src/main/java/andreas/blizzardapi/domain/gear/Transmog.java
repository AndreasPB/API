
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Transmog {

    private Item_ item;
    private String displayString;
    private Integer itemModifiedAppearanceId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Item_ getItem() {
        return item;
    }

    public void setItem(Item_ item) {
        this.item = item;
    }

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public Integer getItemModifiedAppearanceId() {
        return itemModifiedAppearanceId;
    }

    public void setItemModifiedAppearanceId(Integer itemModifiedAppearanceId) {
        this.itemModifiedAppearanceId = itemModifiedAppearanceId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
