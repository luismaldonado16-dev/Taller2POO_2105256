import java.util.Scanner;

public class Controlador {

    private Modelo modelo;
    private Vista vista;
    private Scanner scn;

    public void menuOpciones(){

        int opcion;

        do {
            opcion = 0;
            if(opcion == 0) {
                vista.mostrarMenu();
                opcion = scn.nextInt();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Cual sera el titulo de tu tarea?\n");
                    String titulo = scn.nextLine();

                    System.out.println("Cual sera la descripcion de tu tarea?\n");
                    String descripcion = scn.nextLine();

                    modelo.agregarTareas(titulo,descripcion);
                    break;
                case 2:
                    break;
                case 3:
                    modelo.mostrarTareas();
                    break;
                case 4:
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