class Convector {
    public String arabicToRoma(int result) {
        return switch (result) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            case 11 -> "XI";
            case 12 -> "XII";
            case 13 -> "XIII";
            case 14 -> "XIV";
            case 15 -> "XV";
            case 16 -> "XVI";
            case 17 -> "XVII";
            case 18 -> "XVIII";
            case 19 -> "XIX";
            case 20 -> "XX";
            case 21 -> "XXI";
            case 24 -> "XXIV";
            case 25 -> "XXV";
            case 27 -> "XXVII";
            case 28 -> "XXVIII";
            case 30 -> "XXX";
            case 32 -> "XXXII";
            case 35 -> "XXXV";
            case 36 -> "XXXVI";
            case 40 -> "XL";
            case 42 -> "XLII";
            case 45 -> "XLV";
            case 48 -> "XLVIII";
            case 49 -> "XLIX";
            case 50 -> "L";
            case 54 -> "LIV";
            case 56 -> "LVI";
            case 60 -> "LX";
            case 63 -> "LXIII";
            case 64 -> "LXIV";
            case 70 -> "LXX";
            case 72 -> "LXXII";
            case 80 -> "LXXX";
            case 81 -> "LXXXI";
            case 90 -> "XC";
            case 100 -> "C";
            default -> throw new NumberFormatException(
                    " Данный ввод:\"" + result + "\" не соотвествует диапазону.");
        };

    }

    public int romaToArabic(String roma) {
        return switch (roma) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new NumberFormatException(
                    " Данный ввод:\"" + roma + "\" не соотвествует диапазону.");
        };
    }

    public boolean checkArabic(String character) throws FormatException {
       boolean check = character.equals("0") ||
                character.equals("1") ||
                character.equals("2") ||
                character.equals("3") ||
                character.equals("4") ||
                character.equals("5") ||
                character.equals("6") ||
                character.equals("7") ||
                character.equals("8") ||
                character.equals("9") ||
                character.equals("10");
            return check;


    }

    public boolean checkRoma(String character) throws FormatException {
        boolean check = character.equals("I") ||
                character.equals("II") ||
                character.equals("III") ||
                character.equals("IV") ||
                character.equals("V") ||
                character.equals("VI") ||
                character.equals("VII") ||
                character.equals("VIII") ||
                character.equals("IX") ||
                character.equals("X");
            return check;
    }
}