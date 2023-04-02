package calculator;



import java.util.Scanner;
public class CalculatorArabian {
    public static void main(String[] args) {
        //2+3 = 5
        //V+VII = II
        Converter converter = new Converter();
        String[] actions = {"+", "-", "/", "\\*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in);
        System.out.print("Ведите выражение: ");
        String exp = scn.nextLine();
        // Оприделяем Арефмитическое Действие:
        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (exp.contains(actions[i])) {
                actionIndex = i;
                break;
            }
        }
        if (actionIndex == -1) {
            System.out.println("Некоректное вырожение");
            return;
        }
        //"2-4".split("-")-> {"2", "4"}
        String[] data = exp.split(regexActions[actionIndex]);
        if (converter.isRoman(data[0])  == converter.isRoman(data[1])){
         int a,b;
         Boolean isRoman = converter.isRoman(data[0]);
         if(isRoman) {


            a = Integer.romanToInt(data[0]);
            b = Integer.romanToInt(data[1]);

        } else {

            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);
        }

        int result;
        switch (actions[actionIndex]) {
            case "+":
                result = a + b;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                result = a / b;
                break;
        }
        System.out.println(result);
    }else{
          System.out.println("Число должны быть в одном формате");
      }

      }
    }