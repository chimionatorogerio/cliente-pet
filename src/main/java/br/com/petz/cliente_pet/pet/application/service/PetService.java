package br.com.petz.cliente_pet.pet.application.service;

import br.com.petz.cliente_pet.pet.application.api.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
    List<PetClienteListResponse> buscaPetsDoClientePorId(UUID idCliente);
    PetClienteDetalhadoResponse buscaPetDoClientePorId(UUID idCliente, UUID idPet);
    void deletaPetDoClienteComId(UUID idCliente, UUID idPet);

    void patchPet(UUID idCliente, UUID idPet, PetAlteracaoRequest petAlteracaoRequest);
}
