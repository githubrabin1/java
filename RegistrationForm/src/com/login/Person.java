package com.login;


public class Person {

   private String name;
 
   private String course;
   private String email;
   private String password;
   
   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }
   
   public String getCourse() {
       return course;
   }

   public void setCourse(String course) {
       this.course= course;
   }


   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }
   public String getPassword() {
       return password;
   }

   public void setPassword(String password) {
       this.password = password;
   }
}