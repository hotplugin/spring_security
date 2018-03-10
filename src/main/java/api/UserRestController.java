package api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping
    public String getUsers(){
        return "hello";
    }

    @RequestMapping("/index")
    String index() {

        //mapped to hostname:port/home/index/

        return "Hello from index";

    }
}
