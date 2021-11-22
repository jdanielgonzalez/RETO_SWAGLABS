package co.com.sofka.util.error_message;

public enum ErrorMessage {
    ERRORMESSAGE1("Epic sadface: Username and password do not match any user in this service"),
    ERRORMESSAGE2("Epic sadface: Sorry, this user has been locked out."),
    ERRORMESSAGE3("Epic sadface: Username is required"),
    ERRORMESSAGE4("Epic sadface: Password is required");


    private final String value;

    public String getValue() {
        return value;
    }

    ErrorMessage(String value) {
        this.value = value;
    }
}
