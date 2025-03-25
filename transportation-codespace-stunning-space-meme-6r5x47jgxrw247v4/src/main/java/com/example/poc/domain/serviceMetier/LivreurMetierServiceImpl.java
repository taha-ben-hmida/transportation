package com.example.poc.domain.serviceMetier;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.poc.domain.serviceMetier.LivreurMetierService;
import com.example.poc.domain.model.Livreur;
import com.example.poc.domain.repository.LivreurRepository;

@Service
public class LivreurMetierServiceImpl implements LivreurMetierService{

       
         private final LivreurRepository livreurRepository;


        public LivreurMetierServiceImpl(LivreurRepository livreurRepository){

            this.livreurRepository = livreurRepository;
        }


        @Override
        public List<Livreur> getAllLivreurs() {
           return livreurRepository.findAll();
        }


        @Override
        public Optional<Livreur> getLivreurById(Long id) {
            return livreurRepository.findById(id);
        }


        @Override
        public Livreur saveLivreur(Livreur livreur) {
            return livreurRepository.save(livreur);
        }


        @Override
        public void deleteLivreur(Livreur livreur) {
            
        }







        
}
