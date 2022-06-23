package edu.cepuii.work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.stream.Stream;

public class FilesUtils {
  
  public static void writeFile(String filename, String text) {
    try {
      Files.write(Paths.get(filename), Collections.singleton(text));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  public static Stream<String> readFile(String filename) {
    try {
      return Files.lines(Path.of(filename));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
}
