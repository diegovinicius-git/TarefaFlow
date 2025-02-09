import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    /*
    *  TODO: Adicionar uma task
    * */
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Tarefa adicionada: " + task.getName());
    }

    /*
    *  TODO: Remover task pelo Id
    *  Usar decisões e loop
    * */
    public void removeTask(int id) {
        Task taskToRemove = null;

        for (Task task : tasks) {
            if (task.getId() == id) {
                taskToRemove = task;
                break;
            }

        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Tarefa removida: " + taskToRemove.getName());
        } else {
            System.out.println("Tarefa não encontrada: " + id);
        }

        }
    }

    /*
    * TODO: Listar as tasks
    *  Decisão
    * */
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Não há tarefas.");
        } else {
            System.out.println("\n Lista de Tarefas:");
            tasks.forEach(System.out::println);
        }
    }


}

