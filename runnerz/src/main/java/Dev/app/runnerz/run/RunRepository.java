package Dev.app.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {
    private List <run> runs = new ArrayList();

List <run> findAll() {

    return runs;
}
@PostConstruct
    private void init() {
    runs.add(new run(1,
            "Monday Morning run",
            LocalDateTime.now(),
            LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
            3,
            "INDOOR"));
}
}
