import java.util.Scanner;

public class TestContractStaff
{

   public static void main(String[] args)
   {
      double minRate = 120;
      Scanner input = new Scanner(System.in);
      String value;

      Project p = new Project("Project 1", 2, 1);
      Activity a = new Activity(3,2,null);
      ContractStaff c = new ContractStaff("John", 2, minRate);
      

      System.out.println("To view rate, enter Project Name: ");
      String proName = input.nextLine();
      
      if(p.getName().equals(proName)) 
      {
         System.out.println(" ");
         System.out.println("Project Name: " + p.getName());
         System.out.println("Activity: ");
         System.out.println("Activity Duration: " + a.getDuration() + " weeks");
         System.out.println("Weekly Rate: " + c.getRates());
         } else if(p.getName() != proName) 
         {
            System.out.println(proName + " cannot be found!");
         }

         if(p.getName().equals(proName)) 
         {
            System.out.println(" ");
            System.out.println("To change rate, enter a value: ");
            double rate = input.nextDouble();
                     
            if (rate < minRate)
            {
               System.out.println("Error - Rate entered is under the set minimum");
            } else {
               c.setRates(rate);
               System.out.println("Rate has been successfully entered: " + rate);
                        
               System.out.println(" ");
               System.out.println("Project Name: " + p.getName());
               System.out.println("Activity: ");
               System.out.println("Activity Duration: " + a.getDuration() + " weeks");
               System.out.println("Weekly Rate: " + c.getRates());
               System.out.println("Total duration rate of "+ p.getStartDuration() + " weeks: " + c.getRates() * p.getStartDuration());
                        
            }
      } else if(p.getName() != proName) 
         {
            System.out.println(proName + " cannot be found!");
         }
      
      
   }
   
}
