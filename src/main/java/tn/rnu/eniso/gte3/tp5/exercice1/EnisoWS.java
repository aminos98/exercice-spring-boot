package tn.rnu.eniso.gte3.tp5.exercice1;

import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnisoWS {
    @Autowired
    static
    Service srv;
    @GetMapping("/hello")
    static String hello(){
        return "world";
    }

    @PostMapping("/send")
    static Message send(@RequestBody Message m){
        srv.addMessage(m);
        return m;
    }
}
