package com.lqt.security.auth.domain;

import lombok.Data;
 import lombok.NoArgsConstructor;

 import java.util.List;

 @Data
 @NoArgsConstructor
 public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private Integer status;
    private String clientId;
    private List<Long> roles;

     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

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

     public Integer getStatus() {
         return status;
     }

     public void setStatus(Integer status) {
         this.status = status;
     }

     public String getClientId() {
         return clientId;
     }

     public void setClientId(String clientId) {
         this.clientId = clientId;
     }

     public List<Long> getRoles() {
         return roles;
     }

     public void setRoles(List<Long> roles) {
         this.roles = roles;
     }
 }
