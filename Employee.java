 class Employee
{
  private String fName;
  private String lName;
  private String emailid;
  private String password;

  Employee(String fName,String lName)
  {
    this.fName=fName;
    this.lName=lName;
  }
  public void setFname(String fName)
  {
   this.fName=fName;
  }
  public String getFname()
  {
   return fName;
  }

  public void setLname(String lName)
  {
   this.lName=lName;
  }
 public  String getLname()
  {
   return lName;
  }

  
  public void setEmailid(String emailid)
  {
   this.emailid=emailid;
  } 
  public String getEmailid()
  {
   return emailid;
  }


 public void setPassword(String password)
  {
   this.password=password;
  } 
  public String getPassword()
  {
   return password;
  }
}
