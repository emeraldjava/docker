package ie.emeraldjava.agerank;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pauloconnell on 15/07/16.
 */
@RestController
public class AgerankController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "hi";//new Greeting(counter.incrementAndGet(),
                //String.format(template, name));
    }
}
