import utils.CheckUserCode;
import utils.CheckUserName;
import utils.CheckUserTimeOnCompany;
import utils.CheckUserType;

public class CreateUser {
    final private String codeOfEmployee;
    final private String name;
    final private int typeUser;
    final private int timeOnCompany;

    public CreateUser(String codeOfEmployee, String name, int typeUser, int timeOnCompany) {
        this.codeOfEmployee = codeOfEmployee;
        this.name = name;
        this.typeUser = typeUser;
        this.timeOnCompany = timeOnCompany;
    }

    String getCodeOfEmployee() {
        return this.codeOfEmployee;
    }

    private boolean isValidCodeOfEmployee() {
        return new CheckUserCode(this.codeOfEmployee).isValidCodeOfEmployee();
    }

    private boolean isValidName() {
        return new CheckUserName(this.name).isValidName();
    }

    private boolean isValidTypeUser() {
        return new CheckUserType(this.typeUser).isValidTypeUser();
    }

    private boolean isValidTimeOnCompany() {
        return new CheckUserTimeOnCompany(this.timeOnCompany).isValidTimeOnCompany();
    }

    public boolean isValidUser() {
        return isValidCodeOfEmployee() && isValidName() && isValidTypeUser() && isValidTimeOnCompany();
    }
}
