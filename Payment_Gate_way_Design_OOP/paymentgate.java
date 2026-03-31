package Payment_Gate_way_Design_OOP_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

 class iohandle {
     String read() {
        String content = "";
        try {
             content = Files.readString(Path.of("devopslecture/text.txt"));
        } catch (IOException e) {
            System.out.println(e);
        }
        return content;
    }
}

public class paymentgate extends iohandle{

    String readFile(){
        String s = read();
        String[] arr = s.split(",");
        StringBuilder pass = new StringBuilder(arr[1].strip());
        pass.delete(0, "password: ".length());
        System.out.println(pass);
        return pass.toString();
    }
}
