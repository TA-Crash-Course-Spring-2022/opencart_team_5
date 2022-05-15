package datamodel;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class RegisterModel {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String passwordConfirm;

    private RegisterModel(){
    }

    public static RegisterModel.Register register(){
        return new RegisterModel().new Register();
    }

    public class Register{

        public RegisterModel.Register setFirstName(String value){
            firstName = value;
            return this;
        }

        public RegisterModel.Register setLastName(String value){
            lastName = value;
            return this;
        }

        public RegisterModel.Register setEmail(String value){
            email = value;
            return this;
        }

        public RegisterModel.Register setTelephone(String value){
            telephone = value;
            return this;
        }

        public RegisterModel.Register setPassword(String value){
            password = value;
            return this;
        }

        public RegisterModel.Register setPasswordConfirm(String value){
            passwordConfirm = value;
            return this;
        }

        public RegisterModel register(){ return RegisterModel.this;}
    }
}
