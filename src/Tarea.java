public class Tarea {
    private String titulo; //sacar basura
    private boolean completada;
    private String descripcionCorta;

    public Tarea(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcionCorta = descripcion;
        this.completada = false;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getDescripcion(){
        return this.descripcionCorta;
    }

    public boolean getCompletado(){
        return this.completada;
    }

    public void completarTarea(){
        this.completada = true;
    }
}