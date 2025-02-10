import java.time.LocalDate;

public class Task {
    private static int nextId = 1;
    private int id;
    private String name;
    private LocalDate creationDate;
    private LocalDate dueDate;
    private TaskStatus status;

    public Task() {
    }

    public Task(String name, long daysToComplete) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.creationDate = creationDate.now();
        this.dueDate = creationDate.plusDays(daysToComplete);
        this.status = TaskStatus.TO_DO;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Criado: " + creationDate + " | Finaliza: " + dueDate + " | Status: " + status;
    }


}
