package hellojenkins.service;

import hellojenkins.bean.Task;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TaskService {

    void publishTask(Task task);

    List<Task> getAllTask();
}
