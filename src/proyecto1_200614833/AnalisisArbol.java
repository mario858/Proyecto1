/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1_200614833;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Stack;
import proyecto1_200614833.Analisis.*;

/**
 *
 * @author Mario
 */
public class AnalisisArbol {
   
    public boolean Error=false;
    
    Reader reader;
    LexicoH scanner;
    SintacticoH parser;
    
    
    
    public void analizar(String archivo){
        
                Error=false;
                reader = new StringReader(archivo);
                scanner = new LexicoH(reader);
                parser = new SintacticoH(scanner);
                
                try{
                    parser.parse() ;
                    if(parser.arbol!=null){
                        System.out.print("Ejecucion exitosa");
                    }
                    
                }
                
                catch(Exception e){
                    }
    }
    

}
