/**
* Tarea: Hoja de trabajo 8
* Autores: Julio García Salas, Joaquín Campos
* Fecha: 1/04/2023
*/
public class Proceso implements Comparable<Proceso>{
    String nombreP = "";
    String usuario = "";
    Integer nice = 0;
    Integer prioridad;

    /**
     * Constructor de la clase Proceso.
     *
     * @param nombreP el nombre del proceso.
     * @param usuario el nombre del usuario.
     * @param nice el valor nice.
     * Se calcula la prioridad sumando 120 al valor nice.
     */
    public Proceso(String nombreP, String usuario, Integer nice){
        this.nombreP = nombreP;
        this.usuario = usuario;
        this.nice = nice;
        this.prioridad = 120 + nice;
    }

    /**
     * Método que devuelve la prioridad del proceso.
     *
     * @return la prioridad del proceso.
     */
    public Integer getprioridad(){
        return prioridad;
    }

    /**
     * Método que devuelve el nombre del proceso.
     *
     * @return el nombre del proceso.
     */
    public String getnombreP(){
        return this.nombreP;
    }

    /**
     * Método que devuelve el nombre del usuario.
     *
     * @return el nombre del usuario.
     */
    public String getusuario(){
        return this.usuario;
    }

    /**
     * Método que devuelve el valor nice del proceso.
     *
     * @return el valor nice del proceso.
     */
    public Integer getnice(){
        return this.nice;
    }

    /**
     * Método que compara dos procesos por su prioridad.
     *
     * @param o el proceso a comparar.
     * @return un valor negativo si este proceso tiene menor prioridad que el proceso comparado, cero si tienen la misma prioridad, o un valor positivo si este proceso tiene mayor prioridad que el proceso comparado.
     */
    @Override
    public int compareTo(Proceso o) {
        return this.getprioridad().compareTo(o.getprioridad());
    }

    /**
     * Método que devuelve una cadena de caracteres con la información del proceso.
     *
     * @return una cadena de caracteres con la información del proceso.
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Proceso: ");
        sb.append(getnombreP());
        sb.append("\nUsuario: ");
        sb.append(getusuario());
        sb.append("\nValor de Nice: ");
        sb.append(getnice());
        sb.append("\nPrioridad: ");
        sb.append(getprioridad());
        sb.append("\n-----------------------------------------------\n");
        return sb.toString();
    }
}
