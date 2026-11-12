import java.util.Scanner;

/**
 * 程序 2：Calculator
 * 简单的命令行计算器：演示 Scanner 输入、方法封装与循环。
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== 简易计算器 =====");
        System.out.print("请输入第一个数字：");
        double a = scanner.nextDouble();
        System.out.print("请输入运算符（+ - * /）：");
        String op = scanner.next();
        System.out.print("请输入第二个数字：");
        double b = scanner.nextDouble();

        double result;
        switch (op) {
            case "+": result = add(a, b); break;
            case "-": result = subtract(a, b); break;
            case "*": result = multiply(a, b); break;
            case "/":
                if (b == 0) {
                    System.out.println("错误：除数不能为 0。");
                    scanner.close();
                    return;
                }
                result = divide(a, b);
                break;
            default:
                System.out.println("不支持的运算符：" + op);
                scanner.close();
                return;
        }
        System.out.printf("结果：%.2f %s %.2f = %.2f%n", a, op, b, result);
        scanner.close();
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }
}
