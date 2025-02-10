import java.util.ArrayList;
import java.util.List;

public class taskManager {
    public List<Task> tasks;

    public taskManager() {
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
        boolean removed = false;

        for (int i = tasks.size() - 1; i >= 0; i--) {
            if (tasks.get(i).getId() == id) {
                System.out.println("Tarefa removida" + tasks.get(i).getName());
                tasks.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Tarefa não encontrada: " + id);
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

