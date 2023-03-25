import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws RomaException, FormatException {
        Scanner scanner = new Scanner(System.in);
        String ex = scanner.nextLine();
        System.out.println(Calc(ex));
    }
    public static String Calc (String ex) throws RomaException, FormatException {

        String result = "";
        String[] array;

        array = ex.split(" ");

        Convector convector = new Convector();

        boolean checkArabic = convector.checkArabic(array[0]) & convector.checkArabic(array[2]);
        if (checkArabic) {
                int a = Integer.parseInt(array[0]);
                int b = Integer.parseInt(array[2]);

                Calculator calculator = new Calculator();

                int answer = calculator.calcul(array[1], a, b);
                result = Integer.toString(answer);
        }
        boolean checkRoma = convector.checkRoma(array[0]) & convector.checkRoma(array[2]);
        if (checkRoma) {
            int a = convector.romaToArabic(array[0]);
            int b = convector.romaToArabic(array[2]);

            Calculator calculator = new Calculator();

            int answer = calculator.calcul(array[1], a, b);

            if(answer<1) throw new RomaException("Ответ по римским цифрам меньше 1");

            result = convector.arabicToRoma(answer);
        }
        return result;
    }

}




