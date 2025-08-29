package com.example.MoneyTransfer.System.Project.clientController;

import com.example.MoneyTransfer.System.Project.clientDetails.Clientdetails;
import com.example.MoneyTransfer.System.Project.clientDetails.Registerdetails;
import com.example.MoneyTransfer.System.Project.clientService.Clientservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class Clientcontroller {
    @Autowired
    Clientservice clientservice;
    @GetMapping("/details")
    public List<Registerdetails> getClientDetails(){
        return  clientservice.getClientDetails();
    }
    @PostMapping("/register")
    public String getRegister(
            @RequestParam("userName") String userName,
            @RequestParam("mobileNumber") Long mobileNumber,
            @RequestParam("emailId") String emailId) {

        clientservice.registerClient(userName, mobileNumber, emailId);
        return "Your registration was successful, " + userName;
    }

    @DeleteMapping("/delete")
    public String getDeleteAll(){
        clientservice.getDeleteAll();
        return "delete sucessfully";
    }

}
