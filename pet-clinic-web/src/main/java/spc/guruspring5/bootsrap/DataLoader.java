package spc.guruspring5.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spc.guruspring5.model.*;
import spc.guruspring5.services.OwnerService;
import spc.guruspring5.services.PetTypeService;
import spc.guruspring5.services.SpecialtyService;
import spc.guruspring5.services.VetService;

import java.time.LocalDate;

/**
 * spc 27/08/20
 */
@Component
public class DataLoader implements CommandLineRunner  {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;

        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }


    //the bootstrap class ultimate goal was to manage data by itself but will be refactored to spring data management
    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if ( count == 0){
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty saveRadiolgy = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty saveSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty saveDentistry = specialtyService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Temi");
        owner1.setLastName("Lawrence");
        owner1.setAddress("Congress Road");
        owner1.setCity("Mowe");
        owner1.setTelephone("12345678");

        Pet spcsPet = new Pet();
        spcsPet.setPetType(saveDogPetType);
        spcsPet.setOwner(owner1);
        spcsPet.setBirthDate(LocalDate.now());
        spcsPet.setName("Tiger");
        owner1.getPets().add(spcsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Tumi");
        owner2.setLastName("Adewale");
        owner2.setAddress("Congress Road");
        owner2.setCity("Mowe");
        owner2.setTelephone("12345678");

        Pet mcginsCat = new Pet();
        mcginsCat.setPetType(saveCatPetType);
        mcginsCat.setOwner(owner2);
        mcginsCat.setBirthDate(LocalDate.now());
        mcginsCat.setName("Beauty");
        owner2.getPets().add(mcginsCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners......");


        Vet vet1 = new Vet();
        vet1.setFirstName("Mary");
        vet1.setLastName("Bila");
        vet1.getSpecialties().add(saveRadiolgy);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Nisperb");
        vet2.setLastName("Ngisflourish");
        vet2.getSpecialties().add(saveSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }
}
