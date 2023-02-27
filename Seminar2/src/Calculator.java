import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returneaza rezultatul calculat.
     * @throws IOException Arunca exceptie daca datele introduse nu au formatul corect.
     */
    public double calculateX5PlusY7() throws IOException {
        double x= 0, y = 0, result = 0.0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try {
                System.out.println("Tastati valoarea pentru X:");
                x = Double.parseDouble(reader.readLine());
                System.out.println("Tastati valoarea pentru Y:");
                y = Double.parseDouble(reader.readLine());
                break;
            } catch(NumberFormatException e){
                System.out.println("Va rugam introduceti un numar! ");
            }
        }

        result = calculatePower(x,5) + calculatePower(y,7);
        return result;
    }

    public double calculatePower(double number,int power){
        for (int i = 1; i < power; i++) {
            number *= number;
        }
        return number;
    }
}