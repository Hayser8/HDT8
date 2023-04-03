/**
* Tarea: Hoja de trabajo 8
* Autores: Julio García Salas, Joaquín Campos
* Fecha: 1/04/2023
*/
import java.io.BufferedReader;
import java.io.FileReader;

public class ProcesoFileReader {

    /**
     * Lee el archivo de texto con información de procesos y los agrega a la cola de prioridad
     * @param priorityQueue La cola de prioridad donde se agregan los procesos
     * @param filePath La ruta del archivo de texto
     */
    public static void readProcesosFromFile(IPriorityQueue<Proceso> priorityQueue, String filePath) {
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                String nombreP = data[0].trim();
                String usuario = data[1].trim();
                int nice = Integer.parseInt(data[2].trim());
                Proceso proceso = new Proceso(nombreP, usuario, nice);
                priorityQueue.add(proceso);
            }

        } catch (Exception e) {
            System.err.println("Error al leer el archivo de procesos: " + e.getMessage());
        }
    }
}
