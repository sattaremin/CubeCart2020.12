package com.unitedcoder.jsonfile;

public class User {
    private String username;
    private String password;
    private String role;
    private Boolean active;

    public User() {
    }

    public String UserInfo(){return username+" "+password+" "+role+" "+active;}

    public User(String username, String password, String role, Boolean active) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.active = active;
    }

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Boolean getActive() {
        return active;
    }

    public static void main(String[] args) {
        User user=new User("mehmetSalihEmin14","sattar520Ss","Tester",true);
        System.out.println(user.UserInfo());
        System.out.println(user.getActive());
        User user1=new User("sattaremin","Tester");
        System.out.println(user1.UserInfo());

    }
}
