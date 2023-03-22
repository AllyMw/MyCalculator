class Calculator {
    public int calcul(String mark, int a, int b) throws ArithmeticException, FormatException {
        int result = 0;

        switch (mark) {
            case "+":
                return result = a + b;
            case "-":
                return result = a - b;
            case "*":
                return result = a * b;
            case "/":
                if (b == 0)
                {
                    throw new ArithmeticException("Деление на 0");
                }
                else
                {
                      return result = a / b;
                }

            default:
                throw new FormatException("Введен некорректный знак вычисления");

        }

    }
}


