package com.modernjava.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author kansanja on 21/02/24.
 */
public class FilesMismatchDemo {
    public static void main(String[] args) throws IOException {

        /**
         Files.mismatch method is used to compare the content of two  files
         This method will return -1 if both files are matching. Otherwise it returns the position of first byte at which both files differ
         If one of the file ends before finding difference then the length of the file will be returned
         */


        Path path1 = Paths.get("/Users/kansanja/Downloads/Codes/modern-java/explore-latest-java-features/src/main/resources/welcome1.txt");
        Path path2 = Paths.get("/Users/kansanja/Downloads/Codes/modern-java/explore-latest-java-features/src/main/resources/welcome2.txt");
        long mismatch = Files.mismatch(path1, path2);
        if (mismatch == -1) {
            System.out.println("Files content is matched");
        } else {
            System.out.println("Files content is mismatched at: " + mismatch);
        }
    }
}
