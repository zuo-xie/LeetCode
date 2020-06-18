package 面试题;

import com.sun.deploy.appcontext.AppContext;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * 仓库
 * Description: <br/>
 * date: 2020/6/17 15:47<br/>
 *
 * @author zuo<br />
 * @since JDK 1.8
 */
public class Main {

    public static void main(String[] args) {
        new Computer("台式","台式1");
        new Computer("笔记本","笔记本1");
        new Computer("笔记本","笔记本2");
        new Computer("笔记本","笔记本3");
        new Computer("笔记本","笔记本4");
        new Computer("笔记本","笔记本5");

        new Computer("台式","台式2");
        new Computer("台式","台式3");
        new Computer("台式","台式4");

        System.out.println(Computer.getNotebook());
        System.out.println(Computer.getDesktop());
        Computer computer = new Computer();
        String remove = computer.remove("123");
        System.out.println(remove);

        Computer.getDesktop();
        System.out.println(Computer.getNotebook());
        System.out.println(Computer.getDesktop());

    }
}