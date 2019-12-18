package hellojenkins.mapper;

import hellojenkins.bean.Task;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskMapper {
    List<Task> getAllTask();

    void insertTask(Task task);

    void receiveTask(Task task);
}
