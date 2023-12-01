
public interface EmpCredential
{
  String generateEmailId(String fname, String lname, String dept);
  String generatePassword();
  void showDetails(Employee e);
}
