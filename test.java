
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    /**
     * Constructor for objects of class test
     */
    public test()
    {

    }

    /** 
     * Metodo que comprueba el metodo checkIndex de la clase MusicOrganizer.
     */
    public void testCheckIndex()
    {
        MusicOrganizer organizador = new MusicOrganizer();

        System.out.println("Comprobando que funciona el metodo checkIndex");
        System.out.println("-------------------------------------------");

        organizador.addFile("cancion1");
        organizador.addFile("cancion2");
        organizador.addFile("cancion3");
        System.out.println("Introduciendo el valor no valido inmediatamente anterior por el limite inferior");
        System.out.println("-------------------------------------------");
        organizador.checkIndex(-1);
        System.out.println("Introduciendo el valor del limite inferior");
        System.out.println("-------------------------------------------");
        organizador.checkIndex(0);
        System.out.println("Introduciendo un valor valido entre los limites");
        System.out.println("-------------------------------------------");
        organizador.checkIndex(1);
        System.out.println("Introduciendo el valor del limite superior");
        System.out.println("-------------------------------------------");
        organizador.checkIndex(2);
        System.out.println("Introduciendo el valor no valido inmediatamente posterior por el limite superior");
        System.out.println("-------------------------------------------");
        organizador.checkIndex(3);       
    }

    /** 
     * Metodo que comprueba el metodo validIndex de la clase MusicOrganizer.
     */
    public void testValidIndex()
    {
        MusicOrganizer organizador = new MusicOrganizer();

        System.out.println("Comprobando que funciona el metodo validIndex");
        System.out.println("-------------------------------------------");

        organizador.addFile("cancion1");
        organizador.addFile("cancion2");
        organizador.addFile("cancion3");
        System.out.println("Introduciendo el valor no valido inmediatamente anterior por el limite inferior");
        System.out.println("-------------------------------------------");
        organizador.validIndex(-1);
        System.out.println("Introduciendo el valor del limite inferior");
        System.out.println("-------------------------------------------");
        organizador.validIndex(0);
        System.out.println("Introduciendo un valor valido entre los limites");
        System.out.println("-------------------------------------------");
        organizador.validIndex(1);
        System.out.println("Introduciendo el valor del limite superior");
        System.out.println("-------------------------------------------");
        organizador.validIndex(2);
        System.out.println("Introduciendo el valor no valido inmediatamente posterior por el limite superior");
        System.out.println("-------------------------------------------");
        organizador.validIndex(3);       
    }

    /** 
     * Metodo que prueba el metodo listFile de la clase MusicOrganizer.
     */
    public void testListFile()
    {
        MusicOrganizer organizador = new MusicOrganizer();

        System.out.println("Probando que funciona el metodo listFile");
        System.out.println("-------------------------------------------");

        organizador.addFile("cancion1");
        organizador.addFile("cancion2");
        organizador.addFile("cancion3");
        System.out.println("Introduciendo el valor no valido inmediatamente anterior por el limite inferior");
        System.out.println("-------------------------------------------");
        organizador.listFile(-1);
        System.out.println("Introduciendo el valor del limite inferior");
        System.out.println("-------------------------------------------");
        organizador.listFile(0);
        System.out.println("Introduciendo un valor valido entre los limites");
        System.out.println("-------------------------------------------");
        organizador.listFile(1);
        System.out.println("Introduciendo el valor del limite superior");
        System.out.println("-------------------------------------------");
        organizador.listFile(2);
        System.out.println("Introduciendo el valor no valido inmediatamente posterior por el limite superior");
        System.out.println("-------------------------------------------");
        organizador.listFile(3);       
    }

    /** 
     * Metodo que prueba el metodo removeFile.
     */
    public void testRemoveFile()
    {
        MusicOrganizer organizador = new MusicOrganizer();

        System.out.println("Probando que funciona el metodo removeFile");
        System.out.println("-------------------------------------------");

        organizador.addFile("cancion1");
        organizador.addFile("cancion2");
        organizador.addFile("cancion3");
        System.out.println("Introduciendo el valor no valido inmediatamente anterior por el limite inferior");
        System.out.println("-------------------------------------------");
        organizador.removeFile(-1);
        System.out.println("Comprobamos el nombre del archivo que vamos a eliminar");
        System.out.println("-------------------------------------------");
        organizador.listFile(0);
        System.out.println("Introducimos el valor del limite inferior, que es el que vamos a eliminar");
        System.out.println("-------------------------------------------");
        organizador.removeFile(0);
        System.out.println("Comprobamos que el indice se actualiza al borrar un archivo. El nombre del archivo sera otro");
        System.out.println("-------------------------------------------");
        organizador.listFile(0);
    }
}
