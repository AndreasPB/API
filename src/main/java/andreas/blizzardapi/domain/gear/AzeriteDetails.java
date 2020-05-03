
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AzeriteDetails {

    private List<SelectedPower> selectedPowers = null;
    private String selectedPowersString;
    private Double percentageToNextLevel;
    private List<SelectedEssence> selectedEssences = null;
    private Level level;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<SelectedPower> getSelectedPowers() {
        return selectedPowers;
    }

    public void setSelectedPowers(List<SelectedPower> selectedPowers) {
        this.selectedPowers = selectedPowers;
    }

    public String getSelectedPowersString() {
        return selectedPowersString;
    }

    public void setSelectedPowersString(String selectedPowersString) {
        this.selectedPowersString = selectedPowersString;
    }

    public Double getPercentageToNextLevel() {
        return percentageToNextLevel;
    }

    public void setPercentageToNextLevel(Double percentageToNextLevel) {
        this.percentageToNextLevel = percentageToNextLevel;
    }

    public List<SelectedEssence> getSelectedEssences() {
        return selectedEssences;
    }

    public void setSelectedEssences(List<SelectedEssence> selectedEssences) {
        this.selectedEssences = selectedEssences;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
