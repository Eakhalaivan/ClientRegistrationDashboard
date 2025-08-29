package com.example.MoneyTransfer.System.Project.clientRepository;

import com.example.MoneyTransfer.System.Project.clientDetails.Clientdetails;
import com.example.MoneyTransfer.System.Project.clientDetails.Registerdetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Clientrepository extends JpaRepository<Registerdetails, Long> {

}
