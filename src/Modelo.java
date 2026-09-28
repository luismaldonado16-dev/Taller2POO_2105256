import java.util.ArrayList;

public class Modelo {
    private ArrayList<Tarea> listaTareas;

    public Modelo(){
        listaTareas = new ArrayList<Tarea>();
    }

    //funcion agregar, eliminar, mostrar, completar

    public void agregarTareas(String titulo, String descripcion){
        Tarea tarea = new Tarea(titulo, descripcion);
        listaTareas.add(tarea);
    }

    public void mostrarTareas(){
        int i = 1;
        System.out.println("\n");
        for(Tarea tarea : listaTareas){
            System.out.println("-------------------------------------------------");
            System.out.println("Tarea #" + i + "\n");
            System.out.println("Titulo: " + tarea.getTitulo());
            System.out.println("Descripcion: " + tarea.getDescripcion());
            System.out.println("Estatus: " + tarea.getCompletado());
            System.out.println("-------------------------------------------------\n");
            i++;
        }
    }

    public boolean eliminarTarea(int indexTarea){
        if(indexTarea >= 0 && indexTarea < listaTareas.size()){
            listaTareas.remove(indexTarea);
            return true;
        }
        return false;
    }

    public boolean completarTarea(int indexTarea){
        if(indexTarea >= 0 && indexTarea < listaTareas.size()){
            Tarea tareaCompletada = listaTareas.get(indexTarea);
            tareaCompletada.completarTarea();
            return true;
        }
        return false;
    }
}