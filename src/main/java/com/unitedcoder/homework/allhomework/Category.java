package com.unitedcoder.homework.allhomework;

public class Category {
    private String name;
    private String status;
    private String visible;
    private String parentCategory;

    public Category() {
    }

    public Category(String name, String status, String visible,
                    String parentCategory) {
        this.name = name;
        this.status = status;
        this.visible = visible;
        this.parentCategory = parentCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory;
    }

    public static class Customer {

        private String title;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String cellPhone;
        private String password;
        private String confirmPassword;

        public Customer() {
        }

        public Customer(String title, String firstName, String lsatName,
                        String email, String phone, String cellPhone,
                        String password, String confirmPassword) {
            this.title = title;
            this.firstName = firstName;
            this.lastName = lsatName;
            this.email = email;
            this.phone = phone;
            this.cellPhone = cellPhone;
            this.password = password;
            this.confirmPassword = confirmPassword;
        }

        public Customer(String firstName, String lsatName, String email, String phone) {
            this.firstName = firstName;
            this.lastName = lsatName;
            this.email = email;
            this.phone = phone;
        }

        public String getTitle() {
            return title;
        }

        public String customerInfo(){return title+" "+firstName+" "+lastName+" "+email+" "+phone+" "+
        ""+cellPhone+" "+password+" "+confirmPassword;}

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getCellPhone() {
            return cellPhone;
        }

        public void setCellPhone(String cellPhone) {
            this.cellPhone = cellPhone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getConfirmPassword() {
            return confirmPassword;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }

        public static void main(String[] args) {
            Customer customer=new Customer("Sattar","emin","mehemet@gamil.com","5527151795");
            System.out.println(customer.customerInfo());
            Customer customer1=new Customer("mr","sattar","emin","sattarr14@gmail.com","5527151795","225022505",
                    "sattar520Ss","sattar520Ss");
            System.out.println(customer1.customerInfo());

            Customer customer2=new Customer();
            customer2.setCellPhone("555154545");
            customer2.setEmail("satata@gamil.com");
            System.out.println(customer2.customerInfo());
        }

    }
}
