import java.time.LocalDate;

public class Task {
    private int id;
    private String name;
    private LocalDate creationDate;
    private LocalDate dueDate;
    private TaskStatus status;

    public Task() {
    }

    public Task(int id, String name, LocalDate creationDate, LocalDate dueDate, TaskStatus status) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public TaskStatus getStatus() {
        return status;
    }
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", dueDate=" + dueDate +
                ", status=" + status +
                '}';
    }


}
