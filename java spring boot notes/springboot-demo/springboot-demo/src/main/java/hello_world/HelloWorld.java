package hello_world;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld{
    public String getHelloWorld(){
        return "Hello World!\n";
    }
}