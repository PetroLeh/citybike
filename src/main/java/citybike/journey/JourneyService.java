package citybike.journey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JourneyService {
    
    @Autowired
    JourneyRepository journeyRepository;
}
