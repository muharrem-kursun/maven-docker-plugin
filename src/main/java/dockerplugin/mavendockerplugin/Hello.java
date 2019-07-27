package dockerplugin.mavendockerplugin;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class Hello {
    @GetMapping(value = "/message" , produces = {MediaType.TEXT_EVENT_STREAM_VALUE})
public String sayHello() {

    return "Hello, World!!";
}
}



