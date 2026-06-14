import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskService service = new TaskService();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- TASK MANAGER ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");

            System.out.print("Opción: ");
            int option = Integer.parseInt(input.nextLine());

            switch (option) {

                case 1:
                    System.out.print("Título: ");
                    String title = input.nextLine();
                    service.addTask(title);
                    System.out.println("Tarea creada.");
                    break;

                case 2:
                    service.getAllTasks().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("ID: ");
                    int idComplete = Integer.parseInt(input.nextLine());
                    service.completeTask(idComplete);
                    System.out.println("Tarea completada.");
                    break;

                case 4:
                    System.out.print("ID: ");
                    int idDelete = Integer.parseInt(input.nextLine());
                    service.deleteTask(idDelete);
                    System.out.println("Tarea eliminada.");
                    break;

                case 5:
                    input.close();
                    System.out.println("Saliendo...");
                    return;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}