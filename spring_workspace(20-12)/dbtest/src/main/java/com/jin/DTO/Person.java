package com.jin.DTO;

//사용자 관리 테이블 
public class Person {

 // 식별번호 
 private Integer id;

 // 성 
 private String firstname;

 // 이름 
 private String lastname;

 public Integer getId() {
     return id;
 }

 public void setId(Integer id) {
     this.id = id;
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

 // Person 모델 복사
 public void CopyData(Person param)
 {
     this.id = param.getId();
     this.firstname = param.getFirstname();
     this.lastname = param.getLastname();
 }
}