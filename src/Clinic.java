import pets.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clinic {
    static List<Client> clients = new ArrayList<>();
    private Client client;
    private int size;

    public Clinic(int size) {
        this.size = size;
    }

    public void addClient(Client client, Pet ... pets){
        if (clients.size() < size) {
            for (Pet p : pets) {
                client.addPet(p);
            }
            clients.add(client);
        }
        else System.out.println("Clinic is full");
    }
    public void removeClient(Client client){
        clients.remove(client);
    }

    public void removePet(Client client, Pet pet){
        client.removePet(pet);
    }
}
