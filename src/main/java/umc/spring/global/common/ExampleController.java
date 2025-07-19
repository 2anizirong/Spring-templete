package umc.spring.global.common;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Hidden
@RestController
public class ExampleController {

    @GetMapping("/example")
    public String example() {
        return "this is example";
    }
}
