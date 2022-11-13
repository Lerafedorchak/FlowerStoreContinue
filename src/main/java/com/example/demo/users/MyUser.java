//package com.example.demo.users;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.apache.logging.log4j.message.AsynchronouslyFormattable;
//
//import java.beans.Transient;
//import java.time.LocalDate;
//import java.time.Period;
//
//@Entity
//@Table
//@NoArgsConstructor
//@Getter
//@Setter
//
//public class MyUser {
//    private int id;
//    @Column(unique = true)
//    private String email;
//    private LocalDate dob;
//    @Transient
//    private int age;
//
//    public int getAge(){
//        return Period.between((dob, LocalDate.now()).getYears());
//    }
//
//
//}
