/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaplication;
import java.util.scanner;
import java.io.File;
/**
 *
 * @author sksba
 */
public class bytes {
    public static void main (string[]args){
        scanner input=new scanner(system.in);
              string s=input.nextLine();
              File f1=new File(s);
              system.out.println("File Name:"+f1.getName());
              system.out.println("This file is:"+(f1.exists()?"Exists":"Does not exists"));
              system.out.println("Is file:"+f1.isFile());
              system.out.println("Is Readable:"+f1.canRead());
              system.out.println("Is writable:"+f1.canWrite());
              system.out.println("File Size:"+f1.length()+"bytes");
              
    }
    
}
