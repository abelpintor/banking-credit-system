package onboarding_project.project.domain.repository;

import java.util.List;

import onboarding_project.project.domain.model.Client;

public interface ClientRepository {
    

    public void saveClient(Client client);

    public Client getClientById(Long id);

    public void deleteClient(Client client);

    public void updateClient(Client client);

    public void deleteClientById(Long clientId);



    public Client findClientByUserId(Long userId);

    public Client findClientById(Long clientId);

    public List<Client> findClientByFirstName(String firstName); // list because there could be multiple clients with the same first name

    public List<Client> findClientByLastName(String lastName); // list because there could be multiple clients with the same last name
    
    public List<Client> findClientByFirstNameAndLastName(String firstName, String lastName); // list because there could be multiple clients with the same first and last name



    public void updateClientCreditScore(Long clientId, Long newCreditScore);



}
