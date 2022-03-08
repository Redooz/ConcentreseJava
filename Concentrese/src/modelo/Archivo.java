package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import controlador.Usuario;

public class Archivo {
    private File fichero;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;  

    public Archivo() {
        fichero = new File("info.txt");
        
        if ( !fichero.exists() ) {
            System.out.println("Archivo no existe. ");
        } else {
            System.out.println("El archivo ya existe. ");
        }
    }
    
    public void escribir(Usuario nuevo){        
        try {
            salida = new ObjectOutputStream(new FileOutputStream("usuarios.txt",true));
            salida.writeUnshared(nuevo);
            salida.close();
        
            System.out.println("Archivo guardado ");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public List<Usuario> leer(){
        FileInputStream f = null;
        List <Usuario> lista = null;
        try {
            f = new FileInputStream("usuarios.txt");
            lista = new ArrayList<Usuario>();
            while ( f.available() > 0 ) { //Revisando si el archivo tiene bites
                ObjectInputStream e = new ObjectInputStream(f);
                Usuario obj = (Usuario)e.readUnshared();
                lista.add(obj);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1 al leer archivo");
        } catch (IOException ex) {
            System.out.println("Error 2 al leer archivo");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error 3 al leer archivo");
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                System.out.println("Error 4 al leer archivo");
            }
        }
        return lista;
        
    }
}
