package com.example.MoneyTransfer.System.Project.clientDetails;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="clientdetails")
@Data
public class Registerdetails {
    @Id

   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String  userName;
    private long mobileNumber;
    private  String emailId;

}
