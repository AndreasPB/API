
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class DisplayStrings {

    private String header;
    private String gold;
    private String silver;
    private String copper;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getSilver() {
        return silver;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    public String getCopper() {
        return copper;
    }

    public void setCopper(String copper) {
        this.copper = copper;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
