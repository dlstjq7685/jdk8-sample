import com.ysd.hash.Basic;
import com.ysd.start;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world!");

        start tutorial1 = new Basic();
        tutorial1.run();

        /*
        String basePath = System.getProperty("user.dir");
        File f = new File(basePath);
        for(String ob: f.list()){
            File temp = new File(basePath.concat("\\" + ob));
            System.out.println(temp.isFile());
        }
        */
    }
}
