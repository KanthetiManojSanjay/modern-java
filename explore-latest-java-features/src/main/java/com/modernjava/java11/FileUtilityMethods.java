package com.modernjava.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author kansanja on 21/02/24.
 */
public class FileUtilityMethods {
    public static void main(String[] args) throws IOException {

      /*  Java 11 - Simplified reading & writing to files using readString & writeString methods

        Another feature of java11 is that we can run java files without explicitly compiling  using javac command
        Just by executing using java command compilation will also happen and then executed but we wont get class file.
        Backward compatability is still there i.e. we can use javac & java command to perform compilation & execution explicitly*/

        Path path = Paths.get("/Users/kansanja/Downloads/Codes/modern-java/explore-latest-java-features/src/main/resources/student.txt");
        String result = Files.readString(path);
        System.out.println("File read Demo: " + result);

        Path path1 = Paths.get("/Users/kansanja/Downloads/Codes/modern-java/explore-latest-java-features/src/main/resources/dummy.txt");
        Files.writeString(path1, "welcome to file write demo");
        String readString = Files.readString(path1);
        System.out.println("File write Demo: " + readString);
    }
}
