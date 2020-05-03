package springrestclient.services;

import andreas.blizzardapi.domain.gear.Gear;
import andreas.blizzardapi.domain.statistics.Statistics;
import andreas.blizzardapi.domain.summary.Character;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetCharacters() throws Exception {




        Character character = apiService.getCharacter("draenor", "mooand");
        Gear gear = apiService.getGear("draenor", "mooand");
//        Statistics statistics = apiService.getStatistics("draenor", "mooand");


        assertNotNull(character);
        assertNotNull(gear);
//        assertNotNull(statistics);
    }
}