package com.modernjava.java9.tryWithResource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author kansanja on 17/02/24.
 */
public class FileWritingExample {
    public static void main(String[] args) throws FileNotFoundException {
        // we can create resource outside of try block and provide the reference in try
        FileOutputStream fos = new FileOutputStream("output.txt");
        try (fos) {
            fos.write("welcome to java".getBytes());
            System.out.println("String is written successfully in the file");
        } catch (Exception e) {

        }
    }
}
