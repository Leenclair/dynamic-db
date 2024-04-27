package example.dynamicdb.interfaces.test;

import example.dynamicdb.constants.CustomerType;
import example.dynamicdb.domain.Test;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    private Test test(@RequestParam("test") String test){

        if(test.equals("master")) return testService.findById(1L, CustomerType.MASTER);
        else return testService.findById(1L, CustomerType.SLAVE);

    }

}
