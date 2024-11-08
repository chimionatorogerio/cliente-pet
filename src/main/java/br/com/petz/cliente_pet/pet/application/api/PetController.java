package br.com.petz.cliente_pet.pet.application.api;
import br.com.petz.cliente_pet.pet.application.service.PetService;
import br.com.petz.cliente_pet.pet.domain.Pet;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetAPI {
    private final PetService petService;
    @Override
    public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
        log.info("[inicia] PetController - postPet");
        log.info("[idCliente] {}", idCliente);
        PetResponse petCriado = petService.criaPet(idCliente, petRequest);
        log.info("[FINALIZA] PetController - postPet");
        return petCriado;
    }

    @Override
    public List<PetClienteListResponse> getPetsDoClienteComId(UUID idCliente) {
        log.info("[inicia] PetController - getPetsDoClienteComId");
        log.info("<<idCliente>> {}", idCliente);
        List<PetClienteListResponse> petsDoCliente = petService.buscaPetsDoClientePorId(idCliente);
        log.info("[FINALIZA] PetController - getPetsDoClienteComId");
        return petsDoCliente;
    }

    @Override
    public PetClienteDetalhadoResponse getPetDoClienteComId(UUID idCliente, UUID idPet) {
        log.info("[inicia] PetController - getPetDoClienteComId");
        log.info("<< idCliente >> {} - {{ idPet }} {}", idCliente, idPet);
        PetClienteDetalhadoResponse pet = petService.buscaPetDoClientePorId(idCliente, idPet);
        log.info("[FINALIZA] PetController - getPetDoClienteComId");
        return pet;
    }

    @Override
    public void deletaPetDoClienteComId(UUID idCliente, UUID idPet) {
        log.info("[inicia] PetController - deletaPetDoClienteComId");
        log.info("<< idCliente >> {} - {{ idPet }} {}", idCliente, idPet);
        petService.deletaPetDoClienteComId(idCliente, idPet);
        log.info("[FINALIZA] PetController - deletaPetDoClienteComId");
    }

    @Override
    public void patchPet(UUID idCliente, UUID idPet, PetAlteracaoRequest petAlteracaoRequest) {
        log.info("[inicia] PetController - patchPet");
        log.info("<< idCliente >> {} - {{ idPet }} {}", idCliente, idPet);
        log.info("[FINALIZA] PetController - patchPet");
    }
}
