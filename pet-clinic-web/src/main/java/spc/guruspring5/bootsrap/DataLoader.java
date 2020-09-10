package spc.guruspring5.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spc.guruspring5.model.Owner;
import spc.guruspring5.model.PetType;
import spc.guruspring5.model.Vet;
import spc.guruspring5.services.OwnerService;
import spc.guruspring5.services.PetTypeService;
import spc.guruspring5.services.VetService;

/**
 * spc 27/08/20
 */
@Component
public class DataLoader implements CommandLineRunner  {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;

        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    //the bootstrap class ultimate goal was to manage data by itself but will be refactored to spring data management
    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Temi");
        owner1.setLastName("Lawrence");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Tumi");
        owner2.setLastName("Adewale");

        ownerService.save(owner2);

        System.out.println("Loaded Owners......");


        Vet vet1 = new Vet();
        vet1.setFirstName("Mary");
        vet1.setLastName("Bila");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Nisperb");
        vet2.setLastName("Ngisflourish");

        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }
}
