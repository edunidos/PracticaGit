/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Character.*;


/**
 *
 * @author dam128
 */
public class Nif {
    private String num;

   
    public Nif(String dni) throws errorTamañoException, errorFormatoException  {       
                           
        this.num=dni;
        
       controlTamaño();
       todoDigitos();
       tieneLetra();
       letraCorrecta();
     
     
      
    }

    public String getNum() {
        return num;
    }
    public void controlTamaño() throws errorTamañoException{
        int limite=9;  
        
            if(num.length()==limite){
//                System.out.println("El tamaño del Nif es el correcto");
            
            }else{
                throw new errorTamañoException("El tamaño del Nif es incorrecto.");
            }
    }
    public  void todoDigitos()throws errorFormatoException{
        boolean digito;
        char caracter;
        for(int i=0;i<=7;i++){
           caracter = num.charAt(i);
           digito= isDigit(caracter);
           
           
          if(digito==true){
//               System.out.println("Todo son digitos");
           }else{
              throw new errorFormatoException("El dni escrito no consta de 8 numeros.");
          }
        }
            
        }
    public void tieneLetra() throws errorFormatoException{
       boolean letra;
        char caracter,mayuscula;
        
        caracter = num.charAt(8);
         mayuscula =Character.toUpperCase(caracter);
        letra = Character.isAlphabetic(mayuscula);
        if(letra==true){
//            System.out.println("tiene letra");
        }else{
             throw new errorFormatoException("El dni no consta de su letra.");
        }
       
      }
    
    public void letraCorrecta() throws errorFormatoException{
    String letrascorrec= "TRWAGMYFPDXBNJZSQVHLCKE";
    int numero;
    char letra2;
    char letra = num.charAt(8);
    letra=Character.toUpperCase(letra);
    numero= Integer.parseInt(num.substring(0,8));
   letra2= letrascorrec.charAt(numero%23);
        if(letra == letra2){
//            System.out.println("la letra es la correcta");
        }else{
             throw new errorFormatoException( "la letra no es la correcta.");
        }
    
    
    
    
    
    
    
}
    
    
}

        
                       
                        
   

