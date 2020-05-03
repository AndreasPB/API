package springrestclient.services;

import andreas.blizzardapi.domain.gear.Gear;
import andreas.blizzardapi.domain.statistics.Statistics;
import andreas.blizzardapi.domain.summary.Character;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;
    private String apiToken;
    private String profileApi;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.token}") String apiToken,
                          @Value("${profile.api}") String profileApi) {
        this.restTemplate = restTemplate;
        this.apiToken = apiToken;
        this.profileApi = profileApi;
    }

    @Override
    public Character getCharacter(String realm, String name) {

        Character character = restTemplate.getForObject(profileApi + realm + "/" + name +
                "?namespace=profile-eu&locale=en_US" + apiToken, Character.class);
        return character;
    }

    @Override
    public Gear getGear(String realm, String name) {
        Gear gear = restTemplate.getForObject(profileApi + realm + "/" + name + "/equipment" +
                "?namespace=profile-eu&locale=en_US" + apiToken, Gear.class);

        return gear;
    }

//
//    @Override
//    public Statistics getStatistics(String realm, String name) {
//        Statistics statistics = restTemplate.getForObject(profileApi + realm + "/" + name + "/statistics" +
//                "?namespace=profile-eu&locale=en_US" + apiToken, Statistics.class);
//
//        return statistics;
//    }

}
