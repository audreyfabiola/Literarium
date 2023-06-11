package Literarium;

/**
 *
 * @author Clarissa Audrey Fabiola
 */
public class CustomerManagement implements BookStore{
    private String id, name, custPassword, custGender;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getcustPassword() {
        return custPassword;
    }

    public void setcustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    public String getcustGender() {
        return custGender;
    }

    public void setcustGender(String custGender) {
        this.custGender = custGender;
    }
}
