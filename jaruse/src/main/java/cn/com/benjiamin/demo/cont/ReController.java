package cn.com.benjiamin.demo.cont;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Time;
import java.util.Date;

/**
 * created at 2021/9/15 16:37  jaruse
 */
@RestController
//@RequestMapping("/v1")
@Slf4j
public class ReController {
    @RequestMapping("/rep")
    public String rep() {
        long data = new Date().getTime();
        log.info("{}", data);
        System.out.println("jar--use");
        return "jar--use";
    }
    @RequestMapping("/rep2")
    public ModelAndView rep2() {
        long data=new Date().getTime();
        log.info("{}",data+","+"benjiamin");
        return   new ModelAndView("index");
    }
}
