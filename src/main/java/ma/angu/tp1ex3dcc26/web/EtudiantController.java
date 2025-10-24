package ma.angu.tp1ex3dcc26.web;

import lombok.AllArgsConstructor;
import ma.angu.tp1ex3dcc26.dtos.RequestEtudiantDto;
import ma.angu.tp1ex3dcc26.dtos.ResponseEtudiantDto;
import ma.angu.tp1ex3dcc26.entities.Etudiant;
import ma.angu.tp1ex3dcc26.services.EtudiantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/etudiants")
@AllArgsConstructor

public class EtudiantController {
    private  EtudiantService etudiantService;


    @GetMapping
   public ResponseEntity<List<ResponseEtudiantDto>>  getAllEtudiants() {
       return ResponseEntity.ok(etudiantService.getAllEtudiants());
   }
    @GetMapping("/{id}")
    public ResponseEntity<ResponseEtudiantDto>  getEtudiantById(@PathVariable("id") Long id) {


        return ResponseEntity.ok(etudiantService.getEtudiantById(id));
    }
    @PostMapping
    public ResponseEntity<ResponseEtudiantDto> createEtudiant(@RequestBody RequestEtudiantDto requestEtudiantDto) {


       return ResponseEntity.ok(etudiantService.addEtudiant(requestEtudiantDto));


    }
    @PutMapping("/{id}")
    public ResponseEntity<ResponseEtudiantDto> updateEtu(@PathVariable Long id, @RequestBody RequestEtudiantDto requestEtudiantDto) {


        return ResponseEntity.ok(etudiantService.update_etu(id,requestEtudiantDto));
    }
    @DeleteMapping("{id}")
    public ResponseEntity DeleteMapping(@PathVariable Long id) {

        etudiantService.delete_etu(id);
       return ResponseEntity.ok().build();
    }



}
