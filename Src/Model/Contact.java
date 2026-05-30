public class Contact
{

    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    private String secondLastName = "";
    private String email = "";
    private String company = "";
    private String message = "";

    public Contact(String firstName, String middleName, String lastName, String secondLastName, String email, String company, String message)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.email = email;
        this.company = company;
        this.message = message;
    }


    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public String getMiddleName()
    {
        return this.middleName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setSecondLastName(String secondLastName)
    {
        this.secondLastName = secondLastName;
    }

    public String getSecondLastName()
    {
        return secondLastName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getCompany()
    {
        return company;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }
}