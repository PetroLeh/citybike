package citybike.journey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JourneyController {
    
    @Autowired
    JourneyService journeyService;

    @GetMapping("/journey")
    public String journeys() {
        return "journey";
    }
}
