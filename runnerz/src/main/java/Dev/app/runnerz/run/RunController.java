package Dev.app.runnerz.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RunController {

    private final RunRepository runRepository;

    public RunController(RunRepository runRepository){
        this.runRepository= runRepository;
    }

    @GetMapping("/api/runs")
    List<run> findAll(){
        return runRepository.findAll();
    }


}
