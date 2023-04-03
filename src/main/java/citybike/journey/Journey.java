package citybike.journey;

import java.time.LocalDateTime;

import org.springframework.data.jpa.domain.AbstractPersistable;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Journey extends AbstractPersistable<Long> {

    private LocalDateTime departureTime;
    private LocalDateTime returnTime;

    private Long departureStationId;
    private String departureStationName;

    private Long returnStationId;
    private String returnStationName;

    private Integer distanceInMeters;
    private Integer durationInSeconds;
}
