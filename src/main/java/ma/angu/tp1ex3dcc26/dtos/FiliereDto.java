package ma.angu.tp1ex3dcc26.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FiliereDto {
    private Long idFiliere;
    private String code;
    private String libelle;
}