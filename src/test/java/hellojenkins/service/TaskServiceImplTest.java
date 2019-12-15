package hellojenkins.service;

import hellojenkins.bean.Task;
import hellojenkins.mapper.TaskMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImplTest {

    @Autowired
    private TaskMapper taskMapper;

    @Test
    public void publishTask(){
        Task task = new Task();
        task.setT_user("a");
        task.setT_content("b");
        taskMapper.insertTask(task);
    }


}
