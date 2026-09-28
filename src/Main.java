public class Main{
    public static void main(String[] args){

        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo, vista);

        System.out.println("\n==========Registro de Tareas==========\n");
        controlador.opcionesPrograma();
    }
}
