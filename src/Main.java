import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static void escribir(){
        try (OutputStream fos = new FileOutputStream("data.txt")){
            for(int i = 0x30; i <= 0x39; i++){
                fos.write(i);
            }
            // Todo lo que tiene acumulado lo envie de golpe
            fos.flush(); // Hace que se asegure de que los bytes enviados lleguen a su destino
            fos.close(); // close the file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static  void leer(){
        try(InputStream fis = new FileInputStream("data.txt")){
            // Forma correcta
            byte [] arr = new byte[4096];
            int cuantos = fis.read(arr);
            System.out.println(cuantos);
            // Esta forma no es la recomendad porque estamos leyendo byte por byte
            /*int val;
            do{
                val = fis.read();
                if(val != -1){
                    System.out.println(val);
                }else{
                    System.out.println("FIN");
                }
            }while (val != -1);*/
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    static void escribirObjeto(){}

    static void leerObjeto(){
    }

    public static void main(String[] args) throws IOException {
        try {
            InputStream fis = new FileInputStream("data.txt");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}