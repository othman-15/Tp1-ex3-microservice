package ma.angu.tp1ex3dcc26.mapper;

import ma.angu.tp1ex3dcc26.dtos.RequestEtudiantDto;
import ma.angu.tp1ex3dcc26.dtos.ResponseEtudiantDto;
import ma.angu.tp1ex3dcc26.entities.Etudiant;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EtudiantMapper {


    public Etudiant Dto_to_entity(RequestEtudiantDto requestEtudiantDto) {
        Etudiant etudiant=new Etudiant();
        BeanUtils.copyProperties(requestEtudiantDto, etudiant);

    return etudiant;

    }
    public ResponseEtudiantDto entity_to_Dto(Etudiant etudiant) {
        ResponseEtudiantDto responseEtudiantDto=new ResponseEtudiantDto();
        BeanUtils.copyProperties(etudiant, responseEtudiantDto);
        return responseEtudiantDto;

    }

}
