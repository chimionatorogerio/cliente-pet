package br.com.petz.cliente_pet.pet.application.service;

import br.com.petz.cliente_pet.pet.application.api.PetClienteListResponse;
import br.com.petz.cliente_pet.pet.application.api.PetRequest;
import br.com.petz.cliente_pet.pet.application.api.PetResponse;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);

    List<PetClienteListResponse> buscaPetsDoClientePorId(UUID idCliente);
}
