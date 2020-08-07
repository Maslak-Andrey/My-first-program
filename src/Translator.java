import java.util.HashMap;
import java.util.Map;

public class Translator {

public static int convertToArabic(String number){
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

    public static String convertToRoman(int number){
    String value = null;
    Map<Integer, String> roman = new HashMap<>();

    roman.put(1, "I");
    roman.put(2, "II");
    roman.put(3, "III");
    roman.put(4, "IV");
    roman.put(5, "V");
    roman.put(6, "VI");
    roman.put(7, "VII");
    roman.put(8, "VIII");
    roman.put(9, "IX");
    roman.put(10, "X");
    roman.put(11, "XI");
    roman.put(12, "XII");
    roman.put(13, "XIII");
    roman.put(14, "XIV");
    roman.put(15, "XV");
    roman.put(16, "XVI");
    roman.put(17, "XVII");
    roman.put(18, "XVIII");
    roman.put(19, "XIX");
    roman.put(20, "XX");
    roman.put(21, "XXI");
    roman.put(22, "XXII");
    roman.put(23, "XXIII");
    roman.put(24, "XXIV");
    roman.put(25, "XXV");
    roman.put(26, "XXVI");
    roman.put(27, "XXVII");
    roman.put(28, "XXVIII");
    roman.put(29, "XXIX");
    roman.put(30, "XXX");
    roman.put(31, "XXXI");
    roman.put(32, "XXXII");
    roman.put(33, "XXXIII");
    roman.put(34, "XXXIV");
    roman.put(35, "XXXV");
    roman.put(36, "XXXVI");
    roman.put(37, "XXXVII");
    roman.put(38, "XXXVIII");
    roman.put(39, "XXXIX");
    roman.put(40, "XL");
    roman.put(41, "XLI");
    roman.put(42, "XLII");
    roman.put(43, "XLIII");
    roman.put(44, "XLIV");
    roman.put(45, "XLV");
    roman.put(46, "XLVI");
    roman.put(47, "XLVII");
    roman.put(48, "XLVIII");
    roman.put(49, "XLIX");
    roman.put(50, "L");
    roman.put(51, "LI");
    roman.put(52, "LII");
    roman.put(53, "LIII");
    roman.put(54, "LIV");
    roman.put(55, "LV");
    roman.put(56, "LVI");
    roman.put(57, "LVII");
    roman.put(58, "LVIII");
    roman.put(59, "LIX");
    roman.put(60, "LX");
    roman.put(61, "LXI");
    roman.put(62, "LXII");
    roman.put(63, "LXIII");
    roman.put(64, "LXIV");
    roman.put(65, "LXV");
    roman.put(66, "LXVI");
    roman.put(67, "LXVII");
    roman.put(68, "LXVIII");
    roman.put(69, "LXIX");
    roman.put(70, "LXX");
    roman.put(71, "LXXI");
    roman.put(72, "LXXII");
    roman.put(73, "LXIII");
    roman.put(74, "LXIV");
    roman.put(75, "LXV");
    roman.put(76, "LXXVI");
    roman.put(77, "LXXVII");
    roman.put(78, "LXXVIII");
    roman.put(79, "LXXIX");
    roman.put(80, "LXXX");
    roman.put(81, "LXXXI");
    roman.put(82, "LXXXII");
    roman.put(83, "LXXXIII");
    roman.put(84, "LXXXIV");
    roman.put(85, "LXXXV");
    roman.put(86, "LXXXVI");
    roman.put(87, "LXXXVII");
    roman.put(88, "LXXXVIII");
    roman.put(89, "LXXXIX");
    roman.put(90, "XC");
    roman.put(91, "XCI");
    roman.put(92, "XCII");
    roman.put(93, "XCIII");
    roman.put(94, "XCIV");
    roman.put(95, "XCV");
    roman.put(96, "XCVI");
    roman.put(97, "XCVII");
    roman.put(98, "XCVIII");
    roman.put(99, "XCIX");
    roman.put(100, "C");

    for (Map.Entry<Integer, String> entry : roman.entrySet()){
        if (entry.getKey() == number){
            value = entry.getValue();
        }
    }

    return value;
    }

}
