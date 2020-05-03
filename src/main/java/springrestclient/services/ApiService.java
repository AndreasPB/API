package springrestclient.services;

import andreas.blizzardapi.domain.gear.Gear;
import andreas.blizzardapi.domain.statistics.Statistics;
import andreas.blizzardapi.domain.summary.Character;

public interface ApiService {

    Character getCharacter(String realm, String name);

    Gear getGear(String realm, String name);

//    Statistics getStatistics(String realm, String name);/
}
