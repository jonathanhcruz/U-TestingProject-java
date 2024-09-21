package utils;

public class CheckUserTimeOnCompany {
    final private int timeOnCompany;

    public CheckUserTimeOnCompany(int timeOnCompany) {
        this.timeOnCompany = timeOnCompany;
    }

    public boolean isValidTimeOnCompany() {
      if (this.timeOnCompany < 1 || this.timeOnCompany > 600) {
        System.out.println("Time on company is invalid");
        return false;
      }

      return true;
    }
}
