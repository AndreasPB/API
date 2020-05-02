package springrestclient.services;

import andreas.blizzardapi.domain.Character;

import java.util.List;

public interface ApiService {

    Character getCharacter(String realm, String charName);
}
