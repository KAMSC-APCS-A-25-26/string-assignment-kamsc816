import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
        Scanner sc = new Scanner(System.in);
        System.out.println("Example input: ");
        String input = sc.nextLine();

        String dang = "dang";
        String nuts = "nuts";
        String oops = "oops";
        String yikes = "yikes";

        String dinput = input.replace(dang, "***");
        String dinput = input.replace(nuts, "***");
        String dinput = input.replace(oops, "***");
        String dinput = input.replace(yikes, "***");
        System.out.println("Censored: " + dinput);




        
    }
}
