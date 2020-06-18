package 面试题;

import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * 计算机类
 * Description: <br/>
 * date: 2020/6/17 15:48<br/>
 *
 * @author zuo<br />
 * @since JDK 1.8
 */
public class Computer implements Comparable {


    //存放的时间
    private LocalDateTime time = LocalDateTime.now();
    //类型
    private String type;
    //电脑姓名
    private String name;


    private static ArrayList<Computer> desktop =new ArrayList();
    private static ArrayList<Computer> notebook =new ArrayList();

    public Computer() {
    }

    public Computer(String type,String name) {
        this.type = type;
        this.name = name;
        put(this);
    }

    public static ArrayList<Computer> getDesktop() {
        return desktop;
    }

    public static ArrayList<Computer> getNotebook() {
        return notebook;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }


    //根据类型存放电脑
    private void put(Computer computer) {
        if (computer.type == "台式") {
            //存放到台式数组
            desktop.add(computer);
        } else if(computer.type == "笔记本") {
            //存放到笔记本数组
            notebook.add(computer);
        }
    }

    //取出电脑
    public String remove(String name) {
        if (name .equals("台式")) {
            Computer computer = desktop.remove(0);
            return computer.getName();
        } else if (name.equals("笔记本")) {
            Computer computer = notebook.remove(0);
            return computer.getName();
        } else {
            Computer computer = desktop.get(0);
            Computer computer1 = notebook.get(0);
            int i = computer.compareTo(computer1);
            if (i == 1) {
                desktop.remove(0);
                return computer.getName();
            } else if (i == -1) {
                notebook.remove(0);
                return computer1.getName();
            } else {
                desktop.remove(0);
                return computer.getName();
            }
        }
    }

    //当同时随便取出电脑时，比较时间
    @Override
    public int compareTo(Object o) {
        Computer computer = (Computer) o;
        //判断是否在指定时间之后
        if (computer.time.isAfter(this.time)) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "time=" + time +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}