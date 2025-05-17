import java.util.Scanner;

public class Colour {
    Scanner scanner = new Scanner(System.in);

    public String colourName(){
        while(true) {
            System.out.println("Select first letter of colour: ");
            String firstLetter = scanner.nextLine().toUpperCase();
             switch (firstLetter) {
                 case "Y": return "yellow";
                 case "B": return  "blue";
                 case "G": return "green";
                 case "P": return "pink";
                 default:
                     System.out.println("Wrong letter. Try again!");
            };
        }
    }

 /*   public static void main(String[] args) {
        Colour colour = new Colour();
        String name = colour.colourName();
        System.out.println("Name of colour is: " + name);
    }*/
}
