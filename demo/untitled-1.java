package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    @Size(max = 50)
    @Column(unique = true)
    private String username;
    
    @NotBlank
    @Size(max = 100)
    private String password;
    
    @NotBlank
    @Size(max = 50)
    private String realName;
    
    @Email
    @Size(max = 100)
    @Column(unique = true)
    private String email;
    
    @Size(max = 20)
    private String phone;
    
    @Enumerated(EnumType.STRING)
    private UserRole role;
    
    private String studentId; // 学号（仅学生）
    private String courierCode; // 快递员编号（仅快递员）
    
    private boolean enabled = true;
    
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    
    @OneToMany(mappedBy = "user")
    private List<ExpressOrder> orders;
    
    public enum UserRole {
        STUDENT, COURIER, ADMIN
    }
    
    // 构造函数
    public User() {}
    
    public User(String username, String password, String realName, String email, UserRole role) {
        this.username = username;
        this.password = password;
        this.realName = realName;
        this.email = email;
        this.role = role;
        this.createTime = LocalDateTime.now();
        this.updateTime = LocalDateTime.now();
    }
    
    // Getter和Setter方法
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getRealName() { return realName; }
    public void setRealName(String realName) { this.realName = realName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    
    public UserRole getRole() { return role; }
    public void setRole(UserRole role) { this.role = role; }
    
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    
    public String getCourierCode() { return courierCode; }
    public void setCourierCode(String courierCode) { this.courierCode = courierCode; }
    
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    
    public LocalDateTime getCreateTime() { return createTime; }
    public void setCreateTime(LocalDateTime createTime) { this.createTime = createTime; }
    
    public LocalDateTime getUpdateTime() { return updateTime; }
    public void setUpdateTime(LocalDateTime updateTime) { this.updateTime = updateTime; }
    
    public List<ExpressOrder> getOrders() { return orders; }
    public void setOrders(List<ExpressOrder> orders) { this.orders = orders; }
}