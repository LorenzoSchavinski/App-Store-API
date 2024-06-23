package com.pucrs.api.repositories.repositoriesImplementation;

import com.pucrs.api.models.Client;
import com.pucrs.api.models.repositories.IClientRepository;
import com.pucrs.api.repositories.ClientRepository;

public class ClientRepositoryImpl implements IClientRepository {
    private ClientRepository clientRep;


    public ClientRepositoryImpl(ClientRepository clientRep){
        this.clientRep = clientRep;


    }

    @Override
    public List<Subscription> todos() {
        return clientRep.findAll();
    }
   
   
    @Override
    public Subscription acharPorId(Integer id) {
        return clientRep.findById(id).orElse(null);
    }


    @Override
    public Client cadastrar(Client c){
        return clientRep.save(c);
    }




}