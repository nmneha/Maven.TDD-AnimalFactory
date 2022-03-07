package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    DogHouse dogHouse = new DogHouse();

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest() {
        String expected = "Chuckle";
        Dog dog = new Dog("Chuckle",new Date(),45);
        //When
        dogHouse.add(dog);
        Dog actual = dogHouse.getDogById(45);

        Assert.assertEquals(expected, actual.getName());
    }

    @Test
    public void removeIdTest() {
        //Given
        Dog dog = new Dog("Storm",null,15);
        Integer expected = null;
        dogHouse.add(dog);
        //When
        dogHouse.remove(15);
        Dog actual = dogHouse.getDogById(15);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest() {
        //Given
        Dog dog = new Dog("Thomas",null,33);
        Integer expected = null;
        dogHouse.add(dog);
        //When
        dogHouse.remove(dog);
        Dog actual = dogHouse.getDogById(33);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest() {
        //Given
        Dog dog = new Dog("Steven",null,67);
        String expected = "Steven";
        dogHouse.add(dog);
        //When
        Dog actual = dogHouse.getDogById(67);
        //Then
        Assert.assertEquals(expected, actual.getName());
    }

    @Test
    public void getNumberOfDogsTest() {
        //Given
        DogHouse.clear();
        Dog dog = new Dog("Jorge",null,1920);
        Dog dog2 = new Dog("Pinwheel",null,2021);
        Integer expected = 2;
        dogHouse.add(dog);
        dogHouse.add(dog2);
        //When;
        Integer actual = dogHouse.getNumberOfDogs();
        //Then
        System.out.println(dogHouse.getNumberOfDogs());
        Assert.assertEquals(expected, actual);
    }

}
