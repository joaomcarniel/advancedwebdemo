package ie.dbs.advancedwebdemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello Advanced Web Development";
    }

    @GetMapping("/module")
    public String module() {
        return "Advanced Web Development";
    }

    @GetMapping("/student")
    public String student(@RequestParam String name) {
        return "Welcome " + name;
    }
}
