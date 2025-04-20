package com.api.models;

public class SignUpRequest {

   private String username;
   private String password;
   private String email;
   private String firstname;

    public SignUpRequest(String username, String password, String email, String firstname, String lastname, String mobileNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobileNumber = mobileNumber;
    }

    private String lastname;
   private String mobileNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "SignUpRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }


    public static class Builder {

        private String username;
        private String password;
        private String email;
        private String firstname;
        private String lastname;
        private String mobileNumber;

        public Builder username (String username){
            this.username=username;
            return this;
        }public Builder password (String password){
            this.username=password;
            return this;
        }public Builder email (String email){
            this.username=email;
            return this;
        }public Builder firstname (String firstname){
            this.username=firstname;
            return this;
        }public Builder lastname (String lastname){
            this.username=username;
            return this;
        }public Builder mobileNumber (String mobileNumber){
            this.username=username;
            return this;
        }

        public SignUpRequest build(){

            SignUpRequest signUpRequest = new SignUpRequest(username,password,email,firstname,lastname,mobileNumber);
            return signUpRequest;
        }


    }
}
