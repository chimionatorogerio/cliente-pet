package br.com.petz.cliente_pet.pet.infra;

import br.com.petz.cliente_pet.pet.application.service.PetRepository;
import br.com.petz.cliente_pet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {
    private final PetSpringDataJPARepository petSpringJPARepository;
    @Override
    public Pet salvaPet(Pet pet) {
        log.info("[inicia] PetInfraRepository - salvaPet");
        petSpringJPARepository.save(pet);
        log.info("[FINALIZA] PetInfraRepository - salvaPet");
        return pet;
    }

    @Override
    public List<Pet> buscaPetsDoClientePorId(UUID idCliente) {
        log.info("[inicia] PetInfraRepository - buscaPetsDoClientePorId");
        log.info("[FINALIZA] PetInfraRepository - buscaPetsDoClientePorId");
        return List.of();
    }
}
