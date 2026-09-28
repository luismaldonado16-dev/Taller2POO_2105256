import java.util.ArrayList;

public class Modelo {
    private ArrayList<Tarea> listaTareas;
    private Tarea tarea;

    public Modelo(){
        listaTareas = new ArrayList<Tarea>();
    }

    //funcion agregar, eliminar, mostrar, completar

    public void agregarTareas(String titulo, String descripcion){
        tarea = new Tarea(titulo, descripcion);
        listaTareas.add(tarea);
    }

    public void mostrarTareas(){
        int i = 0;
        for(Tarea tarea : listaTareas){
            System.out.println(tarea.getTitulo());
            System.out.println(tarea.getDescripcion());
            System.out.println(tarea.getCompletado());
            i++;
        }
    }

}