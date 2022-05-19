package datamodel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckoutModel {

    private String firstName;
    private String lastName;
    private String company;
    private String telephone;
    private String email;
    private String address1;
    private String address2;
    private String city;
    private String postalCode;

    private CheckoutModel() {
    }

    public static CheckoutModel.Builder builder() {
        return new CheckoutModel().new Builder();
    }

    public class Builder {

        public CheckoutModel.Builder setFirstName(String value) {
            firstName = value;
            return this;
        }
        public CheckoutModel.Builder setLastName(String value) {
            lastName = value;
            return this;
        }
        public CheckoutModel.Builder setEmail(String value) {
            email = value;
            return this;
        }
        public CheckoutModel.Builder setTelephone(String value) {
            telephone = value;
            return this;
        }
        public CheckoutModel.Builder setCompany(String value) {
            company = value;
            return this;
        }
        public CheckoutModel.Builder setAddress1(String value) {
            address1 = value;
            return this;
        }
        public CheckoutModel.Builder setAddress2(String value) {
            address2 = value;
            return this;
        }
        public CheckoutModel.Builder setCity(String value) {
            city = value;
            return this;
        }
        public CheckoutModel.Builder setPostalCode(String value) {
            postalCode = value;
            return this;
        }
        public CheckoutModel build() {
            return CheckoutModel.this;
        }
    }
}
