package citybike.citybike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class CitybikeAppApplication {

    @GetMapping("*")
    @ResponseBody
    public String hello() {
        return "Hello CityBikeApp!";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(CitybikeAppApplication.class, args);
	}

}
