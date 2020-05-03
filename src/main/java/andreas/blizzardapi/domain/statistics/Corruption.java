
package andreas.blizzardapi.domain.statistics;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Corruption implements Serializable
{

    private Double corruption;
    private Double corruptionResistance;
    private Double effectiveCorruption;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7189807129009780907L;

    public Double getCorruption() {
        return corruption;
    }

    public void setCorruption(Double corruption) {
        this.corruption = corruption;
    }

    public Double getCorruptionResistance() {
        return corruptionResistance;
    }

    public void setCorruptionResistance(Double corruptionResistance) {
        this.corruptionResistance = corruptionResistance;
    }

    public Double getEffectiveCorruption() {
        return effectiveCorruption;
    }

    public void setEffectiveCorruption(Double effectiveCorruption) {
        this.effectiveCorruption = effectiveCorruption;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
