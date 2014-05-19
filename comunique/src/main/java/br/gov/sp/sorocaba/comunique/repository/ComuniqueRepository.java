package br.gov.sp.sorocaba.comunique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.sorocaba.comunique.dominio.Comunique;

@Repository
public interface ComuniqueRepository extends JpaRepository<Comunique, Integer> {

}
