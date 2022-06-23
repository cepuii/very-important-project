package edu.cepuii;

import edu.cepuii.work_with_files.FilesUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
        String text = """
            Welcome to Java
            Добро пожаловать в Яву
                        %s""".formatted(System.getProperty("user.name"));
       // FilesUtils.writeFile("text.txt", text);
        FilesUtils.readFile("text.txt").forEach(System.out::println);
        try {
            Files.deleteIfExists(Path.of("text.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
