package Service;

import Model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    public Task create() {
        return new Task();
    }

    public void addTaskToSprintList(Task task,int idSprint) {
    }

    public void editTask(Task taskEdit) {
    }

    public Task findById(int idTask) {
        return new Task();
    }

    public List<Task> findAllTaskByIdSprint(int idSprint) {
        return new ArrayList<Task>();
    }

    public void deleteTask(int idTask) {
    }

    public void changeStatus (){}
}
