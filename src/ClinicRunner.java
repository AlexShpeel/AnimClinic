import pets.Cat;
import pets.Dog;

public class ClinicRunner {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(10);

        clinic.addClient(new Client("John"), new Dog("Sharick"), new Dog("Balu"));
        clinic.addClient(new Client("Vasija"), new Cat("Murzhick"));
    }
}
