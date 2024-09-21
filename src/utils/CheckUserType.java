package utils;

public class CheckUserType {
    final private int typeUser;

    public CheckUserType(int typeUser) {
        this.typeUser = typeUser;
    }

    public boolean isValidTypeUser() {
      if (this.typeUser < 0 || this.typeUser > 1) {
        System.out.println("Type of user is invalid");
        return false;
      }

      return true;
    }
}
