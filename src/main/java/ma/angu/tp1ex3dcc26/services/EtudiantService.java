package ma.angu.tp1ex3dcc26.services;

import ma.angu.tp1ex3dcc26.dtos.RequestEtudiantDto;
import ma.angu.tp1ex3dcc26.dtos.ResponseEtudiantDto;
import ma.angu.tp1ex3dcc26.entities.Etudiant;

import java.util.List;


public interface EtudiantService {
        public ResponseEtudiantDto addEtudiant(RequestEtudiantDto requestEtudiantDto);
        public ResponseEtudiantDto getEtudiantById(Long id);
        public List<ResponseEtudiantDto>  getAllEtudiants();
        public ResponseEtudiantDto update_etu(Long id,RequestEtudiantDto requestEtudiantDto);
        public void delete_etu(Long id);
        public ResponseEtudiantDto getEtudiantWithFiliere(Long id);


}
