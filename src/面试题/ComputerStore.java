package 面试题;

import java.util.ArrayList;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/17 15:47<br/>
 *
 * @author zuo<br />
 * @since JDK 1.8
 */
public class ComputerStore {
    public static void main(String[] args) {
        new Computer(20,"笔记本","笔记本1");
        new Computer(15,"笔记本","笔记本2");
        new Computer(20,"笔记本","笔记本3");
        new Computer(20,"笔记本","笔记本4");
        new Computer(20,"笔记本","笔记本5");
        new Computer(20,"台式","台式1");
        new Computer(20,"台式","台式2");
        new Computer(20,"台式","台式3");
        new Computer(20,"台式","台式4");

        Computer computer = new Computer();
        computer.remove("笔记本");

        Computer.getDesktop();
        ArrayList<Computer> notebook = Computer.getNotebook();
        System.out.println(notebook);
    }
}