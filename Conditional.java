import java.util.*;
public class Conditional 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        /*int age;
        System.out.println("enter age");
        age=sc.nextInt(); */
        // if(age>=18)
        // {
        //     System.out.println("Eligible to vote");  //if block
        // }
        // else
        // {
        //     System.out.println("Not eligible");
        // }
        /*  if(age>=18)
        {
            System.out.println("Eligible to vote");  //if block
        }
        else if(age<18 && age>0)
        {
            System.out.println("Not eligible");
        }
        else
        {
            System.out.println("Invalid");
        } */

            //nested if
            
      /*       if (age>=18)
            {
                System.out.println("Indian Citizenship:True/False");
                boolean citizen=sc.nextBoolean();
                if(citizen)
                {
                    System.out.println("Eligible ");
                }
                else
                {
                    System.out.println("Not eligible");
                }
            }
            else
            {
                if(age>0){
                System.out.println("Age less than 18");
                }
                else
                {
                    System.out.println("invalid");
                }
            }
             */
            System.out.println("Enter day number 1-7");
            int day=sc.nextInt();
            switch (day) 
            {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid number");
                    

                
            }
            if (day=1)
            {
                System.out.println("Monday");
            }else if(day=2)
            {
                System.out.println("Tuesday");
            }else if(day=3)
            {
                System.out.println("Wednesday");
            }

            //Voting code using switch
       /*  String result=(age>=18)?"Yes":"No";
        switch(result)
        {
            case "Yes":
                System.out.println("Eligible");
                break;
            case "No":
                System.out.println("not eligible");
                break;
            default:
                System.out.println("Invalid");
        } */

// /* /*         */ //Combining conditions
// /*         */ int age=25;
// /*         */ boolean citizen=true;
// /*         */ if(age>=18 && citizen)
// /*         */ {
// /*         */     System.out.println("Eligible");
// /*         */ }else
// /*         */ {
// /*         */     System.out.println("not eligible");
//                  }

    }
    
}
