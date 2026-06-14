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
        return tasks;
    }

    public void completeTask(int id) {
        for (Task t : tasks) {
            if (t.id == id) {
                t.completed = true;
                return;
            }
        }
    }

    public void deleteTask(int id) {
        tasks.removeIf(t -> t.id == id);
    }
}