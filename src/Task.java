import java.time.LocalDate;

public class Task {
    private int nextId = 1;
    private int id;
    private String name;
    private LocalDate creationDate;
    private LocalDate dueDate;
    private TaskStatus status;

    public Task() {
    }

    public Task(String name, int daysToComplete) {
        this.nextId = nextId++;
        this.id = id;
        this.name = name;
        this.creationDate = creationDate.now();
        this.dueDate = dueDate.plusDays(daysToComplete);
        this.status = status;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
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
        return id + " | " + name + " | Criado: " + creationDate + " | Finaliza: " + dueDate + " | Status: " + status;
    }


}
