package spc.guruspring5.services.map;

import org.springframework.stereotype.Service;
import spc.guruspring5.model.Owner;
import spc.guruspring5.model.Pet;
import spc.guruspring5.services.OwnerService;
import spc.guruspring5.services.PetService;
import spc.guruspring5.services.PetTypeService;

import java.util.Set;
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService typeService, PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        if (object != null){
            if (object.getPets() != null){
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null){
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is Required");
                    }
                      if (pet.getId() == null){
                     Pet savedPet = petService.save(pet);
                     pet.setId(savedPet.getId());
                     }
                });
            }

            return super.save(object);
        } else {
            return null;
        }


    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
