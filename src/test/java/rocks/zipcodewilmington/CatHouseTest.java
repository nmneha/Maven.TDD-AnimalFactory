package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    CatHouse catHouse = new CatHouse();

    @Test
    public void addTest() {
        String expected = "Sew";
        Cat cat = new Cat("Sew",new Date(),1920);
        //When
        catHouse.add(cat);
        Cat actual = catHouse.getCatById(1920);

        Assert.assertEquals(expected, actual.getName());
    }

    @Test
    public void removeTest() {
        Cat cat = new Cat(null,null,1920);
        Integer expected = null;
        catHouse.add(cat);
        catHouse.remove(1920);
        Cat actual = catHouse.getCatById(1920);

        Assert.assertEquals(expected, actual);
    }

}
