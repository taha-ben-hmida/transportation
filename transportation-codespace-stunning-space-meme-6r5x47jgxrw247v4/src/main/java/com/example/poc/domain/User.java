package com.example.poc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.example.poc.domain.UserRole;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Getter
@Setter
@ToString(exclude = "livreur") // Évite les boucles infinies dans les logs

public  class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     
     @Column(unique = true,nullable = false)
     private String  firstName;

     @Column(unique = true,nullable = false)
     private String  lastName;
     
     @Column(unique=true ,nullable = false)
     private String username;

     /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }


     /**
      * @param username the username to set
      */
     public void setUsername(String username) {
         this.username = username;
     }

     @JsonIgnore
     @Column(nullable = false)
     private String password;
     
     @Column(unique = true, nullable = false)
     private String email;

     @Column(nullable = false)
     private boolean active = true ;


     @Column(name = "num_tel")
     private String numTel;

     @Column(name = "CIN")
     private String cin;

     @Column(name = "Adress")
     private String address;

     @Enumerated(EnumType.STRING)
     @Column(nullable = false)
     private UserRole role;


     public User(String firstName, String lastName, String password,String username, String email, boolean active,
     String numTel, String cin, String address, UserRole role) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
            this.email = email;
            this.active = active;
            this.numTel = numTel;
            this.cin = cin;
            this.address = address;
            this.role = role;
            this.username = username;

        }

    @OneToMany(mappedBy = "livreur", cascade = CascadeType.ALL)
    private List<Livraison> livraisons;


    public void setPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.password = encoder.encode(password); // Hash du mot de passe avant de le stocker
    }


    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }


    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }


    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * @return the numTel
     */
    public String getNumTel() {
        return numTel;
    }


    /**
     * @param numTel the numTel to set
     */
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }


    /**
     * @return the cin
     */
    public String getCin() {
        return cin;
    }


    /**
     * @param cin the cin to set
     */
    public void setCin(String cin) {
        this.cin = cin;
    }


    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }


    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * @return the role
     */
    public UserRole getRole() {
        return role;
    }


    /**
     * @param role the role to set
     */
    public void setRole(UserRole role) {
        this.role = role;
    }


    /**
     * @return the livraisons
     */
    public List<Livraison> getLivraisons() {
        return livraisons;
    }


    /**
     * @param livraisons the livraisons to set
     */
    public void setLivraisons(List<Livraison> livraisons) {
        this.livraisons = livraisons;
    }

    


    
}
