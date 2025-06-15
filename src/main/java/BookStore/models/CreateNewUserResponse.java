package BookStore.models;

import lombok.Data;

import java.util.List;

@Data
public class CreateNewUserResponse {

    private String userID;
    private String username;
    List<String> books;


//    public String getUserID() {
//        return userID;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public List<String> getBooks() {
//        return books;
//    }
//
//    public void setUserID(String userID) {
//        this.userID = userID;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setBooks(List<String> books) {
//        this.books = books;
//    }
//
//    public CreateNewUserResponse(){}
//
//    public CreateNewUserResponse(String userID, String username, List<String> books) {
//        this.userID = userID;
//        this.username = username;
//        this.books = books;
//    }
//
//    @Override
//    public String toString() {
//        return "CreateNewUserResponse{" +
//                "userID='" + userID + '\'' +
//                ", username='" + username + '\'' +
//                ", books=" + books +
//                '}';
//    }
}
