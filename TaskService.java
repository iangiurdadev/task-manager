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

    public boolean hasPendingTasks() {
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                return true;
            }
        }

        return false;
    }

    public boolean completeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                return true;
            }
        }

        return false;
    }

    public boolean deleteTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                return true;
            }
        }

        return false;
    }


}