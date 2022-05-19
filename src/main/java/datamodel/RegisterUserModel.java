package datamodel;
import datamodel.RegisterModel;
import  org.apache.commons.lang3.RandomStringUtils;

public class RegisterUserModel {

    private RegisterUserModel(){
    }

    public static RegisterModel getValidRegisterUser(){
        String password = RandomStringUtils.randomAlphabetic(13);
        return RegisterModel.register()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .setLastName(RandomStringUtils.randomAlphabetic(9))
                .setEmail(RandomStringUtils.randomAlphabetic(6)+"@gmail.com")
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .setPassword(password)
                .setPasswordConfirm(password)
                .register();
    }
}