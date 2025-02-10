public class Main {
    public static void main(String[] args) {
        taskManager TaskManager = new taskManager();

        Task tarefa1 = new Task("Projeto Java",5);
        Task tarefa2 = new Task("Implementar Banco de Dados",1);
        Task tarefa3 = new Task("Finalizar projeto",10);

        TaskManager.addTask(tarefa1);
        TaskManager.addTask(tarefa2);
        TaskManager.addTask(tarefa3);

        TaskManager.listTasks();

        TaskManager.removeTask(tarefa2.getId());
        TaskManager.listTasks();

    }
}
