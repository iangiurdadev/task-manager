import java.time.LocalDateTime;

public class Task {
    int id;
    String title;
    boolean completed;
    LocalDateTime createdAt;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
    return id + " | " + title + " | " +
           (completed ? "COMPLETADA" : "PENDIENTE");
           }
}