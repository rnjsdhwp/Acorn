package com.jin.DTO;

//����� ���� ���̺� 
public class Person {

 // �ĺ���ȣ 
 private Integer id;

 // �� 
 private String firstname;

 // �̸� 
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

 // Person �� ����
 public void CopyData(Person param)
 {
     this.id = param.getId();
     this.firstname = param.getFirstname();
     this.lastname = param.getLastname();
 }
}