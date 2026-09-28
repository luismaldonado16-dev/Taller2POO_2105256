import java.util.Scanner;

public class Controlador {

    private Modelo modelo;
    private Vista vista;
    private Scanner scn;

    public Controlador(Modelo modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
        this.scn = new Scanner(System.in);
    }

    public void opcionesPrograma(){

        int opcion;

        do {
            opcion = 0;
            if(opcion == 0) {
                vista.mostrarMenu();
                opcion = scn.nextInt();
                scn.nextLine();
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    System.out.println("Cual sera el titulo de tu tarea?");
                    String titulo = scn.nextLine();

                    System.out.println("\n");
                    System.out.println("Cual sera la descripcion de tu tarea?");
                    String descripcion = scn.nextLine();
                    System.out.println("\n");

                    modelo.agregarTareas(titulo,descripcion);

                    break;

                case 2:
                    modelo.mostrarTareas();
                    System.out.println("Que numero de tarea quieres eliminar?");
                    int indexEliminarTarea = scn.nextInt() - 1;
                    scn.nextLine();

                    boolean eliminado = modelo.eliminarTarea(indexEliminarTarea);
                    if(eliminado){
                        System.out.println("La tarea se elimino correctamente.\n");
                    }else{
                        System.out.println("La tarea no pudo ser eliminada.\n");
                    }

                    break;
                case 3:
                    modelo.mostrarTareas();

                    break;
                case 4:
                    modelo.mostrarTareas();
                    System.out.println("Que numero de tarea quieres completar?");
                    int indexCompletarTarea = scn.nextInt() - 1;
                    scn.nextLine();

                    boolean completado = modelo.completarTarea(indexCompletarTarea);
                    if(completado){
                        System.out.println("La tarea se completo correctamente.\n");
                    }else{
                        System.out.println("La tarea no pudo ser completada.\n");
                    }

                    break;
                case 5:
                    System.out.println("Saliendo del programa... Vuelva pronto! :D\n\n");

                    break;
                default:
                    System.out.println("\nError... Favor ingrese una opcion valida.\n");

                    break;
            }
        }while(opcion != 5);
    }

}