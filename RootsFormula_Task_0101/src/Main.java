import java.util.*;

public class Main 
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        // הגדר את המשתנים אשר התבקשו במשימה
        int a, b, c;
        // קלוט מהמשתמש את המשתנים של המשוואת הטרינום
        System.out.println("Enter a: ");
        a = scanner.nextInt();

        System.out.println("Enter b: ");
        b = scanner.nextInt();

        System.out.println("Enter c: ");
        c = scanner.nextInt();

        // נגדיר שני משתנים לחישוב כל אחד מהאיקסים באמצעות נוסחת שורשים
        double x_one = (double)(-b + Math.sqrt(b*b -4 * a * c)) / (double)(2 * a);
        double x_two = (double)(-b - Math.sqrt(b*b -4 * a * c)) / (double)(2 * a);

    
        // נשתמש בתנאי כדי לבדוק עם התשובות הם טובות או לא
        if(Double.isNaN(x_one) && Double.isNaN(x_two)) 
        {
            // במקרה הזה המשתמש הזין מספרים לא נכונים לכן נמסור לו שהמספרים שהוא הזין הם שגויים
            System.out.println("The numbers you entered are incorrect and cannot be calculated with, please enter again.");
        }
        else 
        {
            // במקרה הזה שהמספרים כן עובדים נמסור למשתמש את התשובות
            System.out.println("The first x is: " + x_one);
            System.out.println("The second x is: " + x_two);
        }
    }
}
