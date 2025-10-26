package ma.angu.tp1ex3dcc26.services;

import lombok.AllArgsConstructor;
import ma.angu.tp1ex3dcc26.client.FiliereClient;
import ma.angu.tp1ex3dcc26.dtos.FiliereDto;
import ma.angu.tp1ex3dcc26.dtos.RequestEtudiantDto;
import ma.angu.tp1ex3dcc26.dtos.ResponseEtudiantDto;
import ma.angu.tp1ex3dcc26.entities.Etudiant;
import ma.angu.tp1ex3dcc26.mapper.EtudiantMapper;
import ma.angu.tp1ex3dcc26.repository.EtudiantRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {
    private EtudiantRepository etudiantRepository;
    private EtudiantMapper etudiantMapper;
    private  FiliereClient filiereClient;

    @Override
    public ResponseEtudiantDto addEtudiant(RequestEtudiantDto requestEtudiantDto) {
        Etudiant etudiant1 = etudiantMapper.Dto_to_entity(requestEtudiantDto);
        Etudiant saved = etudiantRepository.save(etudiant1);


        return etudiantMapper.entity_to_Dto(saved);
    }

    @Override
    public ResponseEtudiantDto getEtudiantById(Long id) {

        return etudiantMapper.entity_to_Dto(etudiantRepository.findById(id).orElseThrow());
    }

    @Override
    public List<ResponseEtudiantDto> getAllEtudiants() {
        List<Etudiant> allEtu = etudiantRepository.findAll();
        List<ResponseEtudiantDto> all_etu = new ArrayList<>();
        for (Etudiant e : allEtu) {
            all_etu.add(etudiantMapper.entity_to_Dto(e));

        }


        return all_etu ;
    }

    @Override
    public ResponseEtudiantDto update_etu(Long id,RequestEtudiantDto requestEtudiantDto) {

        Etudiant new_etudiant= etudiantMapper.Dto_to_entity(requestEtudiantDto);
        Etudiant etudiant1 = etudiantRepository.findById(id).orElseThrow();

        if(new_etudiant.getNom()!=null)  etudiant1.setNom(new_etudiant.getNom());
        if(new_etudiant.getPrenom()!=null) etudiant1.setPrenom(new_etudiant.getPrenom());
        if(new_etudiant.getCne()!=null) etudiant1.setCne(new_etudiant.getCne());
        if(new_etudiant.getFiliereId()!=null)etudiant1.setFiliereId(new_etudiant.getFiliereId());



        Etudiant saved_etu = etudiantRepository.save(etudiant1);


        return etudiantMapper.entity_to_Dto(saved_etu);
    }

    @Override
    public void delete_etu(Long id) {

         etudiantRepository.deleteById(id);;
    }

    @Override
    public ResponseEtudiantDto getEtudiantWithFiliere(Long id) {
        Etudiant etudiant = etudiantRepository.findById(id).orElseThrow();


        ResponseEtudiantDto response = etudiantMapper.entity_to_Dto(etudiant);


        FiliereDto filiere = filiereClient.getFiliereById(etudiant.getFiliereId());
        if (filiere != null) {
            response.setFiliere(filiere);
        }else {
        filiere=null;}


        return response;
    }
}
