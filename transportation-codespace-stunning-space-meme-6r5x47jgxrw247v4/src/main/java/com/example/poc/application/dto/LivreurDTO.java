package com.example.poc.application.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

import com.example.poc.domain.model.LivreurRole;
import com.example.poc.domain.model.LivreurStatus;

@Getter
@Setter
@NoArgsConstructor
public class LivreurDTO {
    private long id;
    private String nom;
    private String prenom;
    private String cin;
    private String address; 
    private String mdp;
    private String email;
    private String numTel;
    private LivreurRole role;
    private LivreurStatus status;
    private long vehiculeId;
    private List<LivraisonDTO> livraison;
    private long adminId; 

    public LivreurDTO(long id, String nom, String prenom, String cin, String address, String mdp,
            String email, String numTel, long vehiculeId,LivreurRole role, LivreurStatus status,List<LivraisonDTO> livraison, long adminId) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.address = address; 
        this.mdp = mdp;
        this.email = email;
        this.numTel = numTel;
        this.vehiculeId = vehiculeId;
        this.livraison = livraison;
        this.adminId = adminId; 
        this.status = status;
        this.role = role;
    }
}
