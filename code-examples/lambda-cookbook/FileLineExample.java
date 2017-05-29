import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;

public class FileLineExample{
    public static void main(String [] args){
        Path f = Paths.get("FileLineExample.java");
        
        try(Stream<String> stream = Files.lines(f)){
        
            stream.forEach(System.out::println);
        
        }catch(IOException ex){
            System.out.println("An exception has been caught: " + ex );
        }
    }
}