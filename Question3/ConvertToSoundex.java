import java.util.Scanner;

public class ConvertToSoundex {

    //supportive function to remove 0s in string
    public static String duplicate(String c, char chr) {
        StringBuilder output = new StringBuilder("" + chr);
        for (int i = 1; i < c.length(); i++) {
            if (c.charAt(i) != c.charAt(i - 1) && c.charAt(i) != '0') output.append(c.charAt(i));
        }
        return output.toString();
    }

    //method to convert input string to required pattern
    public static String convertToSoundex(String s) {
        //store input in char array
        char[] arr = s.toUpperCase().toCharArray();

        //to store first character
        char firstChar = arr[0];

        //replacing consonants with required digits
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'B' || arr[i] == 'F' || arr[i] == 'P' || arr[i] == 'V') {
                arr[i] = '1';
            } else if (arr[i] == 'C' || arr[i] == 'G' || arr[i] == 'J' || arr[i] == 'K' || arr[i] == 'Q' || arr[i] == 'S' || arr[i] == 'X' || arr[i] == 'Z') {
                arr[i] = '2';
            } else if (arr[i] == 'D' || arr[i] == 'T') {
                arr[i] = '3';
            } else if (arr[i] == 'L') {
                arr[i] = '4';
            } else if (arr[i] == 'M' || arr[i] == 'N') {
                arr[i] = '5';
            } else if (arr[i] == 'R') {
                arr[i] = '6';
            } else {
                arr[i] = '0';
            }
        }

        //initialize StringBuilder starting with initial first character
        //using StringBuilder because it has append and insert principals
        StringBuilder output = new StringBuilder("" + firstChar);

        //add characters to the output string
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] != '0') {
                if (arr[i] != arr[i - 1]) output.append(arr[i]);
            }
        }

        //initializing output
        output = new StringBuilder(duplicate(output.toString(), firstChar) + "0000");
        return output.substring(0, 4);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a surname to encode : ");
        //getting user input
        String input = sc.nextLine();

        //display output
        System.out.println("output of Soundex is: " + convertToSoundex(input));
    }
}
