import java.util.*;
 
public class DriverApp
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("please enter employee first name");
   String f=sc.next();
  System.out.println("please enter employee last name:");
  String l=sc.next();

  Employee emp=new Employee(f,l);
  EmpCredentialImps cred=new EmpCredentialImps(); 

 
  System.out.println("1. Techinical");
  System.out.println("2. Admin");
  System.out.println("3. HR");
 System.out.println("4. Legal");

  System.out.println("Please choose your department");
  int choice=sc.nextInt();

  String genEmail="";
  String genPassword="";
   switch(choice)
   {
     case 1:
                  genEmail=cred.generateEmailId(emp.getFname(),emp.getLname(),"tech");
                   break;
     case 2:
                genEmail=cred.generateEmailId(emp.getFname(),emp.getLname(),"Admin");
                 break;
     case 3:
                genEmail=cred.generateEmailId(emp.getFname(),emp.getLname(),"HR");
                 break;
     case 4: 
                genEmail=cred.generateEmailId(emp.getFname(),emp.getLname(),"Legal");
                 break;

     default: System.out.println("Please enter valid Input");
    }
     genPassword=cred.generatePassword();
     emp.setEmailid(genEmail);
     emp.setPassword(genPassword);
     cred.showDetails(emp);  
 }
}
