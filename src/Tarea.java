public class Tarea {
    private String titulo; //sacar basura
    private boolean completada;
    private String descripcionCorta;

    public Tarea(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcionCorta = descripcion;
        this.completada = false;
    }

    private String getTitulo(){
        return this.titulo;
    }

    private String getDescripcion(){
        return this.descripcionCorta;
    }

    private boolean getCompletado(){
        return this.completada;
    }
}