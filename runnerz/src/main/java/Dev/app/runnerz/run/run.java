package Dev.app.runnerz.run;

import org.springframework.cglib.core.Local;

import javax.xml.stream.Location;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer KM,
         String location
) {
}
