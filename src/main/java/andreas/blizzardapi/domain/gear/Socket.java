
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Socket {

    private SocketType socketType;
    private Item__ item;
    private String displayString;
    private Media__ media;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public SocketType getSocketType() {
        return socketType;
    }

    public void setSocketType(SocketType socketType) {
        this.socketType = socketType;
    }

    public Item__ getItem() {
        return item;
    }

    public void setItem(Item__ item) {
        this.item = item;
    }

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public Media__ getMedia() {
        return media;
    }

    public void setMedia(Media__ media) {
        this.media = media;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
