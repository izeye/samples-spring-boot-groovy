package samples.springboot.groovy

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by izeye on 14. 12. 21..
 */
@RestController
class TestController {

    @RequestMapping("/test")
    String test() {
        return "test"
    }

}
