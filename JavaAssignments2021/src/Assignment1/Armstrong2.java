package Assignment1;


// to find the armstrong number from 100 to 1000


public class Armstrong2 {
    public static void main(String[] args) 
     {
        int number, rem, sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i = 100; i <= 1000; i++)
        {
            number= i;
            while(number > 0)
            {
                rem = number % 10;
                sum = sum + (rem *rem * rem);
                number = number/ 10;
            }
            if(sum == i)
            {
                System.out.print(i+"\n ");
            }
            sum = 0;
        }
    }
}
