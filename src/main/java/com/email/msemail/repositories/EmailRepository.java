package com.email.msemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.email.msemail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
    
}
