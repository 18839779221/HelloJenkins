package hellojenkins.controller;

import hellojenkins.bean.Task;
import hellojenkins.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "main";
    }

    @GetMapping("/toPublishTask")
    public String toPublishTask(){
        return "publish_task";
    }

}
