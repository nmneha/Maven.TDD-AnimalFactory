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
        Cat cat = new Cat("Sew",new Date(),92);
        //When
        catHouse.add(cat);
        Cat actual = catHouse.getCatById(92);

        Assert.assertEquals(expected, actual.getName());
    }

    @Test
    public void removeIdTest() {
       //Given
        Cat cat = new Cat("Bajool",null,1920);
        Integer expected = null;
        catHouse.add(cat);
        //When
        catHouse.remove(1920);
        Cat actual = catHouse.getCatById(1920);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest() {
        //Given
        Cat cat = new Cat("Needle",null,20);
        Integer expected = null;
        catHouse.add(cat);
        //When
        catHouse.remove(cat);
        Cat actual = catHouse.getCatById(20);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest() {
        //Given
        Cat cat = new Cat("Bajool",null,1920);
        String expected = "Bajool";
        catHouse.add(cat);
        //When
        Cat actual = catHouse.getCatById(1920);
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
        catHouse.add(cat1);
        catHouse.add(cat2);
        //When;
        Integer actual = catHouse.getNumberOfCats();
        //Then
        System.out.println(catHouse.getNumberOfCats());
        Assert.assertEquals(expected, actual);
    }

}
