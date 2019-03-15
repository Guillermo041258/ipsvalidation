/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificacionip;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author USER
 */
public class VerificacionIp {

    /**
     * @param args the command line arguments
     */
  
    private Matcher mat;
    private Pattern pat;
    private String pip;
    private boolean com = false;
 
   
    public static void main(String[] args) throws IOException {
  VerificacionIp Ip = new VerificacionIp();
  Ip.PediriP();
System.out.print(Ip.PatronIp());

        
    }
    private void PediriP() throws IOException
    {  
        Scanner in = new Scanner(System.in);
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Dame la direccion ip para comprobar si es no");
       pip = bc.readLine();
    
       
    }
    private  boolean  PatronIp() throws IOException
    { 
        String patron ="(\\d[^0]{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-4])";
        
              
        pat =Pattern.compile(patron + "\\." + patron + "\\." + patron + "\\." + patron);       
        mat = pat.matcher(pip);
     
       com = mat.matches();
        
            
      
           
                
                
    return com;
    }  
}
    
  