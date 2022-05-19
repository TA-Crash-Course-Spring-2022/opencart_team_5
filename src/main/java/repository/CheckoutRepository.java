package repository;

import datamodel.CheckoutModel;
import org.apache.commons.lang3.RandomStringUtils;

public class CheckoutRepository {

    private CheckoutRepository() {
    }

    public static CheckoutModel loginedUser() {
        return CheckoutModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(5))
                .setLastName(RandomStringUtils.randomAlphabetic(6))
                .setCompany(RandomStringUtils.randomAlphabetic(8))
                .setAddress1(RandomStringUtils.randomAlphabetic(8) + RandomStringUtils.randomNumeric(2))
                .setCity(RandomStringUtils.randomAlphabetic(8))
                .setPostalCode(RandomStringUtils.randomNumeric(6))
                .build();
    }
}
