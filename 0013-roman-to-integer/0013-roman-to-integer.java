class Solution {
    public int romanToInt(String s) {
        String regex = "(?<=(?!IV|IX|XL|XC|CD|CM)[IVXLCDM])(?=[IVXLCDM])";

        return Arrays.stream(s.split(regex))
                .mapToInt(s1 -> {
                    return switch (s1) {
                        case "IV" -> 4;
                        case "IX" -> 9;
                        case "XL" -> 40;
                        case "XC" -> 90;
                        case "CD" -> 400;
                        case "CM" -> 900;
                        default -> s1.chars().mapToObj(i -> (char) i).mapToInt(operand -> {
                            return switch (operand) {
                                case 'I' -> 1;
                                case 'V' -> 5;
                                case 'X' -> 10;
                                case 'L' -> 50;
                                case 'C' -> 100;
                                case 'D' -> 500;
                                case 'M' -> 1000;
                                default -> 0;
                            };
                        }).sum();
                    };
                }).sum();
    }
}