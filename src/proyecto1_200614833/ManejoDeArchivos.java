/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1_200614833;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Mario
 */
public class ManejoDeArchivos {
    
     public static void Guardar(String nombreArchivo, String texto){ 
            FileWriter fichero = null;
            PrintWriter pw = null;
            try
            {
                fichero = new FileWriter(nombreArchivo);
                pw = new PrintWriter(fichero);
                    pw.println(texto);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               try {
               if (null != fichero)
                  fichero.close();
               } catch (Exception e2) {
                  e2.printStackTrace();
               }
            }
        }


    public static String Cargar(String nombre){
          
          String ret ="";
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;

          try {
             archivo = new File (nombre);
             fr = new FileReader (archivo);
             br = new BufferedReader(fr);
             String linea;
             while((linea=br.readLine())!=null){
                ret=ret+linea+"\n";
             }
             ret=ret.substring(0, ret.length()-1);
          }
          catch(Exception e){
             e.printStackTrace();
          }finally{
             try{                    
                if( null != fr ){   
                   fr.close();     
                }                  
             }catch (Exception e2){ 
                e2.printStackTrace();
             }
          }
        
        return ret;
    }
}
