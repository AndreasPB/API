package springrestclient.services;

import andreas.blizzardapi.domain.Character;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;
    private String apiToken;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.token}") String apiToken) {
        this.restTemplate = restTemplate;
        this.apiToken = apiToken;
    }

    @Override
    public Character getCharacter(String realm, String name) {

        Character character = restTemplate.getForObject("https://eu.api.blizzard.com/profile/wow/character/"
                + realm + "/" + name + "?namespace=profile-eu&locale=en_US&access_token=" + apiToken, Character.class);
        return character;
    }
}
