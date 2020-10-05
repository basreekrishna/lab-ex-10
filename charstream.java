/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author sksba
 */

public class charstream {
    public static void main(string[]args){
        FileReader fin=null;
        FileWriter fos=null;
        try{
            fin=newFileReader("input.jpg");
            fos=newFileWriter("output.jpg");
            int i;
            while((i=fin.read())!=-1)
            {
                fos.write(i);
                
            }
        } catch(Exception ex) {
            system.out.println(ex);
        }
    }
    
}
