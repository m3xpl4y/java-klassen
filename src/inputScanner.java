import java.util.Scanner;

public class inputScanner {

    protected Scanner intScan =new Scanner(System.in);
    protected Scanner doubleScan = new Scanner(System.in);
    protected Scanner strScan = new Scanner(System.in);

    public inputScanner() {
    }
    public String str(String word)
    {
        word = strScan.nextLine();
        return word;
    }
    public int numb(int a)
    {
        a = intScan.nextInt();
        return a;
    }
    public double doubleNumber(double a)
    {
        a = doubleScan.nextDouble();
        return a;
    }
   
}
