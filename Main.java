/**
* Tarea: Hoja de trabajo 8
* Autores: Julio García Salas, Joaquín Campos
* Fecha: 1/04/2023
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║ Bienvenido a ChichicasteLinux  ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("¡Bienvenido al programa de gestión de procesos!");
        System.out.println("Por favor, indique la ruta del archivo de procesos: ");
        String ruta = sc.nextLine();
        System.out.println("Seleccione el tipo de implementación de Priority Queue: ");
        System.out.println("[1] VectorHeap");
        System.out.println("[2] PriorityQueue (Java Framework Collection)");
        String opc = sc.nextLine();
        IPriorityQueue<Proceso> priorityQueue;
        if(opc.equals("1")){
            priorityQueue = new VectorHeap<>();
        }else{
            priorityQueue = new PriorityQueueJavaFrameworks<>();
        }
        System.out.println("\nCargando procesos...");
        Thread.sleep(1000);
        ProcesoFileReader.readProcesosFromFile(priorityQueue, ruta);
        System.out.println("¡Los procesos se han cargado exitosamente!\n");
        System.out.println("Iniciando la ejecución de los procesos...");
        while(!priorityQueue.isEmpty()){
            Thread.sleep(1000);
            System.out.println(">>> Ejecutando: " + priorityQueue.remove());
            System.out.println("-----------------------------------------------");
        }
        System.out.println("\n¡Todos los procesos se han ejecutado con éxito!");
    }
}
