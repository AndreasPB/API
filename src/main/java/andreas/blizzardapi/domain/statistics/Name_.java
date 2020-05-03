
package andreas.blizzardapi.domain.statistics;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Name_ implements Serializable
{

    private String enUS;
    private String esMX;
    private String ptBR;
    private String deDE;
    private String enGB;
    private String esES;
    private String frFR;
    private String itIT;
    private String ruRU;
    private String koKR;
    private String zhTW;
    private String zhCN;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7505302273980179746L;

    public String getEnUS() {
        return enUS;
    }

    public void setEnUS(String enUS) {
        this.enUS = enUS;
    }

    public String getEsMX() {
        return esMX;
    }

    public void setEsMX(String esMX) {
        this.esMX = esMX;
    }

    public String getPtBR() {
        return ptBR;
    }

    public void setPtBR(String ptBR) {
        this.ptBR = ptBR;
    }

    public String getDeDE() {
        return deDE;
    }

    public void setDeDE(String deDE) {
        this.deDE = deDE;
    }

    public String getEnGB() {
        return enGB;
    }

    public void setEnGB(String enGB) {
        this.enGB = enGB;
    }

    public String getEsES() {
        return esES;
    }

    public void setEsES(String esES) {
        this.esES = esES;
    }

    public String getFrFR() {
        return frFR;
    }

    public void setFrFR(String frFR) {
        this.frFR = frFR;
    }

    public String getItIT() {
        return itIT;
    }

    public void setItIT(String itIT) {
        this.itIT = itIT;
    }

    public String getRuRU() {
        return ruRU;
    }

    public void setRuRU(String ruRU) {
        this.ruRU = ruRU;
    }

    public String getKoKR() {
        return koKR;
    }

    public void setKoKR(String koKR) {
        this.koKR = koKR;
    }

    public String getZhTW() {
        return zhTW;
    }

    public void setZhTW(String zhTW) {
        this.zhTW = zhTW;
    }

    public String getZhCN() {
        return zhCN;
    }

    public void setZhCN(String zhCN) {
        this.zhCN = zhCN;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
