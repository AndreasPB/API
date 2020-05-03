
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.Map;

public class SelectedEssence {

    private Integer slot;
    private Integer rank;
    private MainSpellTooltip mainSpellTooltip;
    private PassiveSpellTooltip passiveSpellTooltip;
    private Essence essence;
    private Media media;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public MainSpellTooltip getMainSpellTooltip() {
        return mainSpellTooltip;
    }

    public void setMainSpellTooltip(MainSpellTooltip mainSpellTooltip) {
        this.mainSpellTooltip = mainSpellTooltip;
    }

    public PassiveSpellTooltip getPassiveSpellTooltip() {
        return passiveSpellTooltip;
    }

    public void setPassiveSpellTooltip(PassiveSpellTooltip passiveSpellTooltip) {
        this.passiveSpellTooltip = passiveSpellTooltip;
    }

    public Essence getEssence() {
        return essence;
    }

    public void setEssence(Essence essence) {
        this.essence = essence;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
