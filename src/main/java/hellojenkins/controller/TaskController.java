package hellojenkins.controller;

import hellojenkins.bean.Task;
import hellojenkins.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping("/publishTask")
    public String publishTask(@RequestParam("user") String user,@RequestParam("content") String content){
        Task task = new Task(user,content);
        taskService.publishTask(task);
        return "redirect:/";
    }
}
