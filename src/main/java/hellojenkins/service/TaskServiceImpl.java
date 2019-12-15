package hellojenkins.service;

import hellojenkins.bean.Task;
import hellojenkins.mapper.TaskMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public void publishTask(Task task) {
        taskMapper.insertTask(task);
    }

    @Override
    public List<Task> getAllTask() {
        return taskMapper.getAllTask();
    }

}
