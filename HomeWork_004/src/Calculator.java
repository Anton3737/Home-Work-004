import java.util.Scanner;

public class Calculator { //27.05.2022
    public static void main(String[] args) {
        Scanner oper1 = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        double operand1 = oper1.nextDouble();
        Scanner oper2 = new Scanner(System.in);
        System.out.println("Введіть друге число:");
        double operand2 = oper2.nextDouble();
        Scanner matOperation = new Scanner(System.in);
        System.out.println("Введіть знак математичної операції:");
        String simvolmatoper = matOperation.next();
        switch (simvolmatoper) {
            case "+":
                double varPlus = operand1 + operand2;
                System.out.printf("Результат додавання: " + operand1 + " та " + operand2 + " рівний = " + varPlus);
                break;
            case "-":
                double varMin = operand1 - operand2;
                System.out.println("Результат віднімання: " + operand1 + " та " + operand2 + " рівний = " + varMin);
                break;
            case "*":
                double varUmn = operand1 * operand2;
                System.out.println("Результат множення: " + operand1 + " та " + operand2 + " рівний = " + varUmn);
                break;
            case "/":
                double varDyl = operand1 / operand2;
                System.out.println("Результат ділення: " + operand1 + " та " + operand2 + " рівний = " + varDyl);
                    default:
                        System.out.println("Такої математичної операції не додано в дану програму,спробуйте з (+ - * /)!");
                } ;
        }
    }
// 09.06.22
