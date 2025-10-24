package ma.angu.tp1ex3dcc26.repository;

import ma.angu.tp1ex3dcc26.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
