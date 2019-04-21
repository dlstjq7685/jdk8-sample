import com.ysd.classes.human;
import com.ysd.classes.interfaces;
import com.ysd.data.basic;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world!");
        //slack test

        basic tutorial1 = new basic();

        interfaces human = new human("jack");
        human.say();
    }
}
