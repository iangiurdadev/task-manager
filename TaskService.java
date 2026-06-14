import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String title) {
        Task task = new Task(nextId++, title);
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return List.copyOf(tasks);
    }

    public boolean hasPendingTasks() {
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                return true;
            }
        }

        return false;
    }

    public boolean completeTask(int id) {
        Task task = findById(id);
        if (task == null){return false;}

        task.complete();
        return true;
    }

    public boolean deleteTask(int id) {
        Task task = findById(id);
        if (task == null){return false;}

        tasks.remove(task);
        return true;
    }

    private Task findById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }


}