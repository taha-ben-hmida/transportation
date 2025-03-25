package com.example.poc.application.mapper;

import com.example.poc.application.dto.LivraisonDTO;
import com.example.poc.application.dto.LivreurDTO;
import com.example.poc.domain.model.Admin;
import com.example.poc.domain.model.Livraison;
import com.example.poc.domain.model.Livreur;
import com.example.poc.domain.model.LivreurRole;
import com.example.poc.domain.model.LivreurStatus;
import com.example.poc.domain.model.Vehicule;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-25T12:27:10+0000",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.14 (Ubuntu)"
)
@Component
public class LivreurMapperImpl implements LivreurMapper {

    @Override
    public Livreur toLivreur(LivreurDTO livreurDTO) {
        if ( livreurDTO == null ) {
            return null;
        }

        String nom = null;
        String prenom = null;
        String cin = null;
        String address = null;
        String mdp = null;
        String email = null;
        String numTel = null;
        LivreurRole role = null;
        LivreurStatus status = null;
        Vehicule vehicule = null;
        Admin admin = null;
        List<Livraison> livraison = null;

        Livreur livreur = new Livreur( nom, prenom, cin, address, mdp, email, numTel, role, status, vehicule, admin, livraison );

        return livreur;
    }

    @Override
    public LivreurDTO toLivreurDTO(Livreur livreur) {
        if ( livreur == null ) {
            return null;
        }

        long id = 0L;
        String nom = null;
        String prenom = null;
        String cin = null;
        String address = null;
        String mdp = null;
        String email = null;
        String numTel = null;
        long vehiculeId = 0L;
        LivreurRole role = null;
        LivreurStatus status = null;
        List<LivraisonDTO> livraison = null;
        long adminId = 0L;

        LivreurDTO livreurDTO = new LivreurDTO( id, nom, prenom, cin, address, mdp, email, numTel, vehiculeId, role, status, livraison, adminId );

        return livreurDTO;
    }
}
