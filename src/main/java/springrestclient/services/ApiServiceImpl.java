package springrestclient.services;

import andreas.blizzardapi.domain.Character;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;
    private String api_token;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.token}") String api_token) {
        this.restTemplate = restTemplate;
        this.api_token = api_token;
    }

    @Override
    public Character getCharacter(String realm, String charName) {

        Character character = restTemplate.getForObject("https://eu.api.blizzard.com/profile/wow/character/"
                + realm + "/" + charName + "?namespace=profile-eu&locale=en_US&access_token=" + api_token, Character.class);
        return character;
    }
}
