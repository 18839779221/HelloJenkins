package hellojenkins.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import hellojenkins.bean.Task;
import hellojenkins.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

//    @RequestMapping("/publishTask")
//    public String publishTask(@RequestParam("user") String user,@RequestParam("content") String content){
//        Task task = new Task(user,content);
//        taskService.publishTask(task);
//        return "redirect:/";
//    }
//
//    @RequestMapping(value = "/receiveTask",consumes="application/json")
//    @ResponseBody
//    public String receiveTask(@RequestBody String jsonstr){
//        JSONObject json = JSON.parseObject(jsonstr);
//        taskService.receiveTask((int)json.get("id"),(String)json.get("ruser"));
//        return "";
//    }

    @RequestMapping("api/tasks")
    public List<Task> getList(){
        return taskService.getAllTask();
    }
}
