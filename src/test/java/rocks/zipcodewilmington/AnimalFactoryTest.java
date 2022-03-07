package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        Integer expected = 1;
        Date birthdate = new Date(2019, 8, 31);
        Dog dog = AnimalFactory.createDog("Sora", birthdate);
        DogHouse.add(dog);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCatTest() {
        Integer expected = 1;
        Date birthdate = new Date(2018, 7, 8);
        Cat cat = AnimalFactory.createCat("Linus", birthdate);
        CatHouse.add(cat);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}
