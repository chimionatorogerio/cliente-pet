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
        log.info("[finaliza] PetController - postPet");
        return petCriado;
    }

    @Override
    public List<PetClienteListResponse> getPetsDoClienteComId(UUID idCliente) {
        log.info("[inicia] PetController - getPetsDoClienteComId");
        log.info("<<idCliente>> {}", idCliente);
        log.info("[FINALIZA] PetController - getPetsDoClienteComId");
        return List.of();
    }
}
