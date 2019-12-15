package hellojenkins.controller;

import hellojenkins.bean.Task;
import hellojenkins.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    TaskService taskService;

    @GetMapping("/")
    public ModelAndView hello(){
        List<Task> tasks = taskService.getAllTask();
        ModelAndView mv = new ModelAndView("main");
        mv.addObject("tasks",tasks);
        return mv;
    }

    @GetMapping("/toPublishTask")
    public String toPublishTask(){
        System.out.println("pub");
        return "publish_task";
    }
}
