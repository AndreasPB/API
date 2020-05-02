package springrestclient.services;

import andreas.blizzardapi.domain.Character;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Character getCharacter(String charName) {

        Character character = restTemplate.getForObject("https://eu.api.blizzard.com/profile/wow/character/draenor/"+ charName + "?namespace=profile-eu&locale=en_US&access_token=US6b2BMDDdJxMsLM2i690QXC4UxlYI8Zx7", Character.class);
        return character;
    }
}
