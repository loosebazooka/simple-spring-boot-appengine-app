package hello;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("file.txt"), Charset.defaultCharset());
        return "Greetings from Spring Boot! " + lines.toString();
    }
    
}
