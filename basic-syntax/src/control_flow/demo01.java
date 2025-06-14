package control_flow;

import java.util.Scanner;

// 请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），
// 然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入上一次成绩：");
        int score1 = scanner.nextInt();
        System.out.print("输入本次成绩：");
        int score2 = scanner.nextInt();

        float result = (float) (score2 - score1) / score1;
        result *= 100;
        System.out.printf("成绩提升了%.2f%%", result);
    }
}
