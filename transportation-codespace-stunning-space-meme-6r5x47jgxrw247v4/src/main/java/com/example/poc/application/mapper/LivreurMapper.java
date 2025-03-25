package com.example.poc.application.mapper;
 

import com.example.poc.application.dto.LivreurDTO;
import com.example.poc.domain.model.Livreur;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface LivreurMapper {

    LivreurMapper INSTANCE = Mappers.getMapper(LivreurMapper.class);

    Livreur toLivreur(LivreurDTO livreurDTO);

    LivreurDTO toLivreurDTO(Livreur livreur);
}
