import pets.Pet;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static List<Pet> getPets() {
        return pets;
    }

    static List<Pet> pets = new ArrayList<>();
    private String name;

    public Client(String name) {
        this.name = name;
    }
    public void addPet(Pet pet){
        pets.add(pet);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void removePet(Pet pet){
        pets.remove(pet);
    }
}
