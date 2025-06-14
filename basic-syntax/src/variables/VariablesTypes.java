package variables;

public class VariablesTypes {
    public static void main(String[] args) {
        // 整数类型：byte，short，int，long
        int i = 100; // int 四个字节 -2147483648 ~ 2147483647
        int i2 = 2_000_000_000; // 加下划线好看

        long n1 = 9000000000000000000L; // long型的结尾需要加L，八个字节
        long n2 = 900; // 这里的 900 是 int， int可以赋值给long，反过来不行


        // 浮点型：float，double
        float f1 = 3.14f; // 四字节，带f，不带是double
        float f2 = 3.14e38f; // 科学计数：3.14*10^38

        double d = 1.79e308; // 这是double的上限，float是38次方


        // 布尔类型,只有true & false，没有规定大小，一般储存为四字节整数
        boolean b1 = true;
        boolean b2 = false;


        // 字符类型：char
        char a = 'A';
        char zh = '中';

        // 引用类型：String
        String s = "hello"; // 与char区分单双引号

        // 常量
        final double PI = 3.14; // 不可再次赋值
    }
}