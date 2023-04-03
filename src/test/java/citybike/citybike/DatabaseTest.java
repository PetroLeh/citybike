package citybike.citybike;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import citybike.station.StationService;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseTest {
    
    @Autowired
    StationService stationService;
    
    @Test
    public void stationServiceReturnsList() {
        assertInstanceOf(List.class, stationService.list());
    }

}
