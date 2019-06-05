    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia1;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Acer
 */
public class Zajecia1 {

  
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
       
        /*System.out.println("Podaj liczbe: ");
        int l = in.nextInt();
        
        System.out.println("Liczba" + l);
        Random r = new Random();
        int los = r.nextInt(9)+1;
        // [1,10] (max - min) + min
        // [1,9] (max + min + 1) + min
        System.out.println("losowa" + los);
        Wykład 18.02.19
        System.out.printf("abcd: %d %d %10.2f \n", liczba,liczbadruga,liczba trzecia");
        
        liczby są ułamkami, chary ASCII, przypisanie od prawej do lewej
        int a = 5;
        a = a<<2;
        101 = 5
        
        10100 = 20
        
        a = a>>2
        
        1
        
        max(a>b)? a : b; -> musi mieć wartość jak w c#
        %% || - sprawdza tak czy siak leniwie
        & - sprawdza bitowe
        | - też sprawdza bitowo
        */
        
       
       /*1 Napisać program, który generuje całkowite liczby pseudolosowe z zakresu (-50; 100] tak długo, aż
        zostanie wylosowana liczba 0. W wyniku wykonania programu (bez wykorzystania tablic), powinny na
        konsoli zostać wyświetlone:
        a) największa i najmniejsza z wylosowanych liczb oraz średnia liczb parzystych dodatnich.
        b) ciąg liczb Fibonacciego o wartościach mniejszych niż iloczyn wartości bezwzględnych drugiej co
        do wielkości i najmniejszej
       liczby wylosowanej w pierwszym kroku. */
       
       Random rand = new Random();
       int lb;
       int max = -50;
       int min = 100;
       int sum = 0;
       int count = 0;
       int maxsec = -50;
       
       do
       {
           lb = rand.nextInt(150)-49;
           //System.out.println("lb: " + lb);
           max = Math.max(max,lb);
           min = Math.min(min,lb);
           
           if(lb > maxsec && lb < max)
           {
               maxsec = lb;
           }
           
           if (lb % 2 == 0 && lb > 0)
           {
               sum += lb;
               count++;
           }
       } while (lb != 0);
       
       
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("avg: " + (float)sum / count);
        float fibmax = Math.abs(maxsec) * Math.abs(min);
        
        System.out.println(fibmax);
                
        int i = 1;
        
        do
        {                
            System.out.println(Fib(i));
            i++;
            
        } while (fibmax > Fib(i));
        
        /*
        2. Napisać program, który generuje liczby pseudolosowe z zakresu [-10,0; 10,0] dopóty, dopóki nie zostanie
        wylosowana liczba 0,0. Co ważne – liczby powinny być zmiennopozycyjne z dokładnością do pierwszego
        miejsca po przecinku (tylko i wyłącznie). W wyniku wykonania programu (bez wykorzystania tablic),
        powinna zostać wyświetlona suma co drugiej z wylosowanych liczb (zaczynając od pierwszej) oraz średnia
        arytmetyczna liczb dodatnich, podzielnych przez trzy.
        Dodatkowo, jeszcze raz powinno zostać wylosowanych (całkowite, zakres [-10, 10]) tyle samo liczb, ile
        wylosowano w pierwszej pętli, a w wyniku powinno zostać wyświetlone, ile z tych liczb było większych od
        największej liczby wylosowanej w pierwszej pętli oraz różnica pomiędzy średnią arytmetyczną liczb
        wylosowanych w pierwszej pętli, a średnią arytmetyczną liczb wylosowanych w drugiej pętli, że
        wskazaniem, która pętla miała wyższą średnią. */
        
        float nr;
        int nrint;
        int z = 0;
        float sumTaskTwo = 0;
        float sumAvgTaskTwo = 0;
        int countTaskTwo = 0;
        float sumAvgTaskTwoSec = 0;
        int countTaskTwoSec = 0;
        float nrmax = -10;
        int howManyBigger = 0;
        
        
        do
        {
        nr = rand.nextInt(200)-100;
        nr /= 10;
        z++;
        
        if( z % 2 == 0)
        { 
            sumTaskTwo += nr;           
        }
        
        
        if (nr % 3 == 0 && nr > 3)
        {
            sumAvgTaskTwo += nr;
            countTaskTwo++;
        }
        } while (nr != 0);
        
        for (int j = 0; j <= z; j++)
        {
            nrint = rand.nextInt(20)-10;
            if( nrint > nrmax)
            {
               howManyBigger++;
            }
            
        
        if (nrint % 3 == 0 && nrint > 0)
        {
            sumAvgTaskTwoSec += nrint;
            countTaskTwoSec++;
        }
            
        }
     
        double avgTaskTwo = ((float)sumAvgTaskTwo/(float)countTaskTwo); 
        float avgTaskTwoSec = (float)sumAvgTaskTwoSec/countTaskTwoSec;
        
        System.out.println("Suma Pierwszej pętli:" + sumTaskTwo);
        System.out.println("suma " + sumAvgTaskTwo);
        System.out.println("ile do sumy " + countTaskTwo);
        System.out.println("Ilość liczb większych w drugiej pętli:" + howManyBigger);
        System.out.println("Srednia liczb podzielnych przez trzy:" +  avgTaskTwo);
        System.out.println("Srednia liczb podzielnych przez trzy w drugiej pętli:" +  avgTaskTwoSec);
        System.out.println("Roznica tych dwoch srednich" + (avgTaskTwo - avgTaskTwoSec));
      
        
        if (avgTaskTwo > avgTaskTwoSec)
        {
            System.out.println("Pierwsza byla wieksza" + avgTaskTwo);
        } else
        {
            System.out.println("Druga byla wieksza" + avgTaskTwoSec);
        }
        
        System.out.println(IsDividableByThree(9));
        
        /*4. Napisać program, który wczytuje dwie liczby naturalne oznaczające numer roku i wyświetlający łączną
        liczbę dni od 1 stycznia pierwszego podanego roku do 31 grudnia drugiego podanego roku. Należy
        uwzględnić lata przestępne. Rok jest przestępny jeżeli jest podzielny przez 4, ale nie jest podzielny przez
        100, lub jest podzielny przez 400. Lata przestępne mają 366 dni, natomiast pozostałe 365.
        Przykładowo jeżeli użytkownik poda 2000 i 2007, wynikiem powinno być 2922
        (bo 366 + 3 * 365 + 366 + 3 * 365).
        Inny przykład, jeżeli użytkownik poda 1945 i 1945, to wynikiem powinno być 365. */
        System.out.println("Podaj pierwszy rok:");
        int firstYear = in.nextInt();
        System.out.println("Podaj drugi rok:");
        int secondYear = in.nextInt();
        int sumTaskThree = 0;
        for(int s = firstYear; s <= secondYear; s++)
        {
            if((s % 4 == 0 && s % 100 != 0 ) || s % 400 == 0)
            {
                sumTaskThree +=366;
            } else sumTaskThree +=365;
        }
        
        System.out.println("suma dni: " + sumTaskThree);
    }
    
    public static int Fib(int x)
    {
        if( x == 1 || x == 2)
            return 1;
        else
           return Fib(x-1) + Fib(x-2);
    }
    
    public static boolean IsDividableByThree(int x)
    {     /*
        3. Napisać funkcję sprawdzającą podzielność podanej jako parametr liczby (całkowitej dodatniej long) przez
        3 metodą sumowania cyfr. Jeżeli po pierwszym zsumowaniu cyfr liczby wartość sumy jest większa niż 9,
        sumowanie należy przeprowadzić powtórnie, itd. Gdy końcowa suma cyfr jest mniejsza od 10, to funkcja
        kończy obliczenia i zwraca true (suma jest cyfrą 0, 3, 6, 9) lub false (suma jest jedną z pozostałych cyfr).
        Przykład:
        liczba: 123454, kolejne sumy: 19-10-1, wynik: false
        liczba: 123453, kolejne sumy: 18-9, wynik: true
        */
        int sum = 0;
        while (x > 0)
        {      
            int b = x % 10;
            sum += b;
            x = x / 10;
        }
        if (sum <= 9)
        {
            if (sum % 3 == 0)
            {
                return true;
            } else return false;
        }  else
        {
        IsDividableByThree(sum);
        return true;
            
        }
    }
    
    
}
