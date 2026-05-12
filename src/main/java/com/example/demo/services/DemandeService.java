package com.example.demo.services;

import org.springframework.stereotype.*;

import com.example.demo.repositories.DemandeRepository;
import com.example.demo.repositories.DemandeStatutRepository;


@Service
public class DemandeService {
    
    @Autowired 
    private DemandeRepository deamndeRepository;

    @Autowired 
    private DemandeStatutRepository demandeStatutRepository;

    @Autowired 
    private StatutRepository statutRepository;
    
}
