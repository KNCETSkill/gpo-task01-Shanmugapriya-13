import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();

        // TODO:
        // Print "Small", "Medium", or "Large"
        // based on the given volume
        if(volume>350)
            System.out.println("Large");
        else if(volume>=250 && volume<=350)
            System.out.println("Medium");
        else if(volume>250)
            System.out.println("Small");
        else
            System.out.println("Invalid input,give a positive number")
        
    


        

        sc.close();
    }
}

