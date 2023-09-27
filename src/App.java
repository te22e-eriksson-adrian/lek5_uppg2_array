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
        tangentbord.close();
    }
}
