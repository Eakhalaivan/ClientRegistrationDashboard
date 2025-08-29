package com.example.MoneyTransfer.System.Project.clientService;

import com.example.MoneyTransfer.System.Project.clientDetails.Clientdetails;
import com.example.MoneyTransfer.System.Project.clientDetails.Registerdetails;
import com.example.MoneyTransfer.System.Project.clientRepository.Clientrepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class Clientservice {
    @Autowired
    Clientrepository clientRepository;


    public List<Registerdetails> getClientDetails() {
        return clientRepository.findAll();
    }



        public void registerClient(String userName, Long mobileNumber, String emailId) {
            Registerdetails details = new Registerdetails();
            details.setUserName(userName);
            details.setMobileNumber(mobileNumber);
            details.setEmailId(emailId);
            clientRepository.save(details);
        }

    public void getDeleteAll() {
        clientRepository.deleteAll();
    }
}




