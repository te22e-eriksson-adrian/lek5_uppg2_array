import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Kod som tar in 4 heltal från tangentbordet som sedan lagras i fält
        Scanner tangentbord = new Scanner(System.in);
        int[] heltal_array = new int[4];
        System.out.println("Var så snäll och skriv 4 heltal nedan.");
        System.out.print("Skriv heltal 1 här: ");
        heltal_array[0] = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Skriv heltal 2 här: ");
        heltal_array[1] = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Skriv heltal 3 här: ");
        heltal_array[2] = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Skriv heltal 4 här: ");
        heltal_array[3] = tangentbord.nextInt();
        tangentbord.nextLine();
        int heltal_summa = heltal_array[0]+heltal_array[1]+heltal_array[2]+heltal_array[3];
        System.out.println("Summan av heltalen: "+heltal_summa);
        System.out.println("Fältet innehåller talen: "+heltal_array[0]+" "+heltal_array[1]+" "+heltal_array[2]+" "+heltal_array[3]);

        //Kod som byter plats på första och sista talet i fältet
        System.out.println("        ");
        int temp = heltal_array[0];
        heltal_array[0] = heltal_array[3];
        heltal_array[3] = temp;
        System.out.println("Fältet innehåller talen: "+heltal_array[0]+" "+heltal_array[1]+" "+heltal_array[2]+" "+heltal_array[3]);

        //Kod som låter användaren gissa vad som står i ett fält
        System.out.println("         ");
        String[] text_array = {"Hej", "på", "dig"};
        System.out.println("Du ska nu gissa på vilka ord ur det svenska språket som finns lagrade i fältet 'text_array'.");
        System.out.print("Skriv din gissning här: ");
        String gissning = tangentbord.nextLine();
        System.out.println("Resultat 'Hej': "+text_array[0].equals(gissning)+", Resultat 'på': "+text_array[1].equals(gissning)+",Resultat 'dig': "+text_array[2].equals(gissning));
        tangentbord.close();
    }
}
