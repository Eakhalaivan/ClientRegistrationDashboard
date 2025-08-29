package com.example.MoneyTransfer.System.Project.clientRepository;

import com.example.MoneyTransfer.System.Project.clientDetails.Clientdetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDetailsRepository extends JpaRepository<Clientdetails,Long> {
}
