public class Task {
    private int id;
    private String title;
    private boolean completed;


    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    @Override
    public String toString() {
        return id + " | " + title + " | " +
           (completed ? "COMPLETADA" : "PENDIENTE");
    }

    public int getId() {
        return id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }

    public void reopen() {
        this.completed = false;
    }


}