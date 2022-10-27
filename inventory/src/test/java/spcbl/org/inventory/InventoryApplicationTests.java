package spcbl.org.inventory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import spcbl.org.inventory.entity.DeviceCategoryEntity;
import spcbl.org.inventory.model.DeviceCategory;
import spcbl.org.inventory.repository.DeviceCategoryRepo;

import java.util.Optional;

@DataJpaTest
class InventoryApplicationTests {
    DeviceCategoryRepo categoryRepo;

    public InventoryApplicationTests(DeviceCategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Test
    void contextLoads() {


/*        //given
       Optional<DeviceCategory> deviceCategory;
       DeviceCategoryEntity deviceCategoryEntity = categoryRepo.findById(Long.valueOf(1)).get();

        //then
         deviceCategory = categoryRepo.findById(Long.valueOf(1));*/

    }

}
