package citybike.station;
import java.util.Optional;

import org.springframework.data.jpa.domain.AbstractPersistable;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Station extends AbstractPersistable<Long> {
    
    private Long stationId;
    private String nameFI;
    private String nameSE;
    private String nameEN;
    private String addressFI;
    private String addressSE;
    private String cityFI;
    private String citySE;
    private String operator;
    private Integer capasity;
    private Double x;
    private Double y;
    
}
