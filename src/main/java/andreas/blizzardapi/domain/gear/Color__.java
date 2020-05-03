
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class Color__ {

    private Integer r;
    private Integer g;
    private Integer b;
    private Integer a;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
