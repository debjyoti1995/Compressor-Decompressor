/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compressor;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.zip.GZIPOutputStream;
//
///**
// *
// * @author 91731
// */
//public class compressor {
//    public static void method(File file) throws IOException{
//      String filedirectory = file.getParent();
//        
//      FileInputStream fis = new FileInputStream(file);
//      FileOutputStream fos = new FileOutputStream(filedirectory+"/Compressedfile.gz");
//      
//        GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
//        
//        byte[] buffer = new byte[1024];
//        int len;
//        
//        while((len=fis.read(buffer))!=-1){
//            gzipOS.write(buffer,0,len);
//        }
//        
//        gzipOS.close();
//        fos.close();
//        fis.close();
//        
//    }
//    
//    public static void main(String[] args) {
//        File path =new File ("/Users/debjyoti das/Downloads/Compressor/compressordecompressor/Testfile");
//        method(path);
//    }
//    
//}


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author shivenduac
 */
public class compressor {
    public static void method(File file) throws IOException{
        String filedirectory= file.getParent();
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(filedirectory+"/Compressedfile.gz");
        GZIPOutputStream gzipOS=new GZIPOutputStream(fos);
        
        byte[] buffer =new byte[1024];
        int len;
        
        while((len=fis.read(buffer)) != -1){
            gzipOS.write(buffer,0,len);
        }
        gzipOS.close();
        fos.close();
        fis.close();
        
    }
    public static void main(String[] args) throws IOException{
        File path=new File("/Users/91731/OneDrive/Desktop");
        method(path);
    }
    
}