
package andreas.blizzardapi.domain.summary;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Titles implements Serializable
{

    private String href;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6876979050070037792L;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
