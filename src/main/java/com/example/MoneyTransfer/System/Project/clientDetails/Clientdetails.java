package com.example.MoneyTransfer.System.Project.clientDetails;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;
@Data
@Entity
public class Clientdetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String  userNname;
    private long mobileNumber;


}
