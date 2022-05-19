package repository;
import datamodel.LoginModel;

public class LoginModelRepository {
    private LoginModelRepository() {
    }

    public static LoginModel getLoginUser() {
        return LoginModel.builder()
                .email("testa@gmail.com")
                .password("12345678")
                .build();
    }
}
