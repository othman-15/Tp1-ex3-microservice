package ma.angu.tp1ex3dcc26.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestEtudiantDto {

    private String nom;
    private String prenom;
    private String cne;
    private Long filiereId;

}
