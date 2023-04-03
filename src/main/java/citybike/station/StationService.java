package citybike.station;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService {

    @Autowired
    StationRepository stationRepository;

    public List<Station> list() {
        return stationRepository.findAll();
    }
}
