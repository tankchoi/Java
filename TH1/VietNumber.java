import java.util.Scanner;

public class VietNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        while(true){
        System.out.print("N = ");
        N = scanner.nextInt();
        if(N >= 0 && N <1000000000) break;
        }

        String vietnameseNumber = convertToVietnamese(N);
        System.out.println(vietnameseNumber);
        

        scanner.close();
    }

    public static String convertToVietnamese(int number) {
        if (number == 0) {
            return "không";
        }

        String[] units = {"", "nghìn", "triệu", "tỷ"};
        String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] teens = {"", "mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};

        String result = "";
        int unitIndex = 0;

        while (number > 0) {
            int group = number % 1000;
            number /= 1000;

            if (group > 0) {
                String groupText = "";
                int hundreds = group / 100;
                int tens = (group % 100) / 10;
                int onesDigit = group % 10;

                if (hundreds > 0) {
                    groupText += ones[hundreds] + " trăm";
                }

                if (tens == 1) {
                    groupText += " mười";
                } else if (tens > 1) {
                    groupText += " " + teens[tens];
                }

                if (onesDigit > 0 && tens != 1) {
                    groupText += " " + ones[onesDigit];
                }

                if (unitIndex > 0) {
                    groupText += " " + units[unitIndex];
                }

                result = groupText + " " + result;
            }

            unitIndex++;
        }

        return result.trim();
    }
}
