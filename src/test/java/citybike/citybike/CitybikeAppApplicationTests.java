package citybike.citybike;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import citybike.station.StationService;

@ActiveProfiles("test")
@SpringBootTest
public class CitybikeAppApplicationTests {

    @Autowired
    StationService stationService;

	@Test
	public void initialTest() {
        assertTrue(true);
    }

}
