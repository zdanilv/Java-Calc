package com.zdanilv;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
           try{
               System.out.println("Возможные операции с ДВУМЯ числами:\n \"+\", \"-\", \"*\", \"/\", \"%\", \"^\".\n");
               String text = input.nextLine();
               String[] inp = text.split(" ");

               int x = Integer.parseInt(inp[0]);
               String key = inp[1];
               int y = Integer.parseInt(inp[2]);
               SwitchCase(key, x , y);
           } catch (Exception ex){
               System.out.println("Неверный ввод!\n" + ex.getMessage());
               continue;
           }
        }
    }

    private static void SwitchCase(String key, int x, int y){
        switch (key){
            case "+":
                Add(x, y);
                break;
            case "-":
                Subtract(x, y);
                break;
            case "*":
                Multiply(x, y);
                break;
            case "/":
                Divide(x, y);
                break;
            case "%":
                Mod(x, y);
                break;
            case "^":
                Square(x, y);
                break;
            default:
        }
    }

    private static void Add(int x, int y){
        int result = x + y;
        System.out.println("Результат: " + result);
    }

    private static void Subtract(int x, int y){
        int result = x - y;
        System.out.println("Результат: " + result);
    }

    private static void Multiply(int x, int y){
        int result = x * y;
        System.out.println("Результат: " + result);
    }

    private static void Divide(int x, int y){
        int result = x / y;
        System.out.println("Результат: " + result);
    }

    private static void Mod(int x, int y){
        int result = x % y;
        System.out.println("Результат: " + result);
    }

    private static void Square(int x, int y){
        double result = Math.pow(x, y);
        System.out.println("Результат: " + result);
    }
}
