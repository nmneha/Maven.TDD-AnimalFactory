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

    @Test
    public void addTest() {
        String expected = "Sew";
        Cat cat = new Cat("Sew", new Date(),92);
        //When
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(92);

        Assert.assertEquals(expected, actual.getName());
    }

    @Test
    public void removeIdTest() {
       //Given
        Cat cat = new Cat("Bajool",null,1920);
        CatHouse.add(cat);
        //When
        CatHouse.remove(1920);
        Cat actual = CatHouse.getCatById(1920);
        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void removeCatTest() {
        //Given
        Cat cat = new Cat("Needle",null,20);
        CatHouse.add(cat);
        //When
        CatHouse.remove(cat);
        Cat actual = CatHouse.getCatById(20);
        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void getCatByIdTest() {
        //Given
        Cat cat = new Cat("Bajool",null,1920);
        String expected = "Bajool";
        CatHouse.add(cat);
        //When
        Cat actual = CatHouse.getCatById(1920);
        //Then
        Assert.assertEquals(expected, actual.getName());
    }

    @Test
    public void getNumberOfCatsTest() {
        //Given
        CatHouse.clear();
        Cat cat1 = new Cat("Button",null,113);
        Cat cat2 = new Cat("Bear",null,2021);
        Integer expected = 2;
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        //When;
        Integer actual = CatHouse.getNumberOfCats();
        //Then
        System.out.println(CatHouse.getNumberOfCats());
        Assert.assertEquals(expected, actual);
    }

}
