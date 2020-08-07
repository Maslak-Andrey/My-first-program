public class Logic {

    public static void logic(String value1, String operation, String value2) {
        int first = 0;
        int second = 0;
        int result = 0;

        boolean check = false;

        try {
            first = Integer.parseInt(value1);
            second = Integer.parseInt(value2);
        } catch (Exception e1) {
            try {
                first = Translator.convertToArabic(value1);
                second = Translator.convertToArabic(value2);
                check = true;
            } catch (Exception e2) {
                System.out.println("Ошибка ввода");
            }
        }
            if (first < 1 || first > 10 || second < 1 || second > 10) {
                System.out.println("Ошибка ввода данных");
                System.exit(0);
            } else {

                if (operation.equals("*")) {
                    result = first * second;
                } else if (operation.equals("/")) {
                    result = first / second;
                } else if (operation.equals("+")) {
                    result = first + second;
                } else if (operation.equals("-")) {
                    result = first - second;
                }
                if (check){
                System.out.println(Translator.convertToRoman(result));}
                else {
                    System.out.println(result);
                }
            }
        }

    }

