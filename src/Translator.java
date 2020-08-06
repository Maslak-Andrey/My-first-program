public class Translator {

public static int convert(String number){
   if (number.equals("I"))
       return 1;

   else if (number.equals("II"))
        return 2;

   else if (number.equals("III"))
        return 3;

   else if (number.equals("IV"))
        return 4;

   else if (number.equals("V"))
        return 5;

   else if (number.equals("VI"))
        return 6;

   else if (number.equals("VII"))
        return 7;

   else if (number.equals("VIII"))
        return 8;

   else if (number.equals("IX"))
        return 9;

   else if (number.equals("X"))
        return 10;

   else {
       return -1;                                      // вернет число не подходящее под условие
   }
}

}
