import java.util.Arrays;
import java.util.Scanner;

public class inputValues {
    public String[] getPerson() {
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("Input SecondName, Name, Patronymic, dateBirth, numberPhone, gender(f|m)");
            String data = sc1.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6) System.out.println("Errors entry data");
        }
    }
}
