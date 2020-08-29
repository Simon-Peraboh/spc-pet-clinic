package spc.guruspring5.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spc.guruspring5.model.Owner;
import spc.guruspring5.model.Vet;
import spc.guruspring5.services.OwnerService;
import spc.guruspring5.services.VetService;
import spc.guruspring5.services.map.OwnerServiceMap;
import spc.guruspring5.services.map.VetServiceMap;

/**
 * spc 27/08/20
 */
@Component
public class DataLoader implements CommandLineRunner  {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }


    //the bootstrap class ultimate goal was to manage data by itself but will be refactored to spring data management
    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Temi");
        owner1.setLastName("Lawrence");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Tumi");
        owner2.setLastName("Adewale");

        ownerService.save(owner2);

        System.out.println("Loaded Owners......");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Mary");
        vet1.setLastName("Bila");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Nisperb");
        vet2.setLastName("Ngisflourish");

        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }
}
