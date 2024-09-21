package utils;

public class CheckUserCode {
  final private String codeOfEmployee;

    public CheckUserCode(String codeOfEmployee) {
        this.codeOfEmployee = codeOfEmployee;
    }

    public boolean isValidCodeOfEmployee() {
        if(!this.codeOfEmployee.matches("(?!000)(\\d{3})") || this.codeOfEmployee.length() != 3) {
          System.out.println("Code of employee is valid " + this.codeOfEmployee);
          return false;
        }

        return true;
    }
}
