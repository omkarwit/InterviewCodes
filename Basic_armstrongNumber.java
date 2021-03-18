
public class Basic_armstrongNumber {

	public static void main(String args[]) {
		//A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
		
		int num = 370, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            System.out.println("Temp:"+temp);
            number =number/ 10;
            System.out.println("Number: "+number);
            total = total + temp*temp*temp;
            
        }
        System.out.println("Final Number:"+num);
        System.out.println("Total: "+total);
        
        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
