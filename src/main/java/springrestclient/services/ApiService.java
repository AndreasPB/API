package springrestclient.services;

import andreas.blizzardapi.domain.Character;
import reactor.core.publisher.Mono;

public interface ApiService {

    Character getCharacter(String realm, String name);

    // Mono<Character> getCharacter(Mono<String> charName);
}
