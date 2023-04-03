package citybike.station;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StationController {
 
    @Autowired
    StationService stationService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/station")
    public String stations(Model model) {
        List<Station> stations = stationService.list();
        model.addAttribute("stations", stations);
        return "station";
    }
}