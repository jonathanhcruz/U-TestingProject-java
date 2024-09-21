package utils;

public class CheckUserName {
    final private String name;

    public CheckUserName(String name) {
        this.name = name;
    }

    public boolean isValidName() {
        if( this.name.length() == 0 || this.name.matches(".*[$@$!%*?&#^~()_+].*") || this.name.length() > 30 ) {
          System.out.println("Name is invalid " + this.name);
          return false;
        }

        System.out.println("Name is valid " + this.name);
        return true;
    }
}
