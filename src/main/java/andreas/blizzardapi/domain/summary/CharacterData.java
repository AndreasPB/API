package andreas.blizzardapi.domain.summary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterData {

    List<Character> data;

    public List<Character> getData() {
        return data;
    }

    public void setData(List<Character> data) {
        this.data = data;
    }
}
