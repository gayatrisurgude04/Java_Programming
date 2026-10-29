import java.util.Scanner;

class Digit
{
    public void DisplayDigit(int iNo)
    {
        
        int iDigit = 0;

        while(iNo != 0)
        {
        iDigit = iNo % 10; 
        iNo = iNo / 10;               
        System.out.println(iDigit); 
        }
       
    }
}

class Day3_5
{
    public static void main(String A[]) 
    {
        Digit digit = new Digit();

        digit.DisplayDigit(9752);
    }
}