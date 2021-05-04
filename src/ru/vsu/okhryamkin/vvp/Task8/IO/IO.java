package ru.vsu.okhryamkin.vvp.Task8.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class IO {
    public void readFile(String path) {
        try(FileInputStream in = new FileInputStream(path)) {


            int i=-1;
            while((i=in.read())!=-1){
                System.out.print((char)i);
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    };

    public void writeFile(String path) {};
}
