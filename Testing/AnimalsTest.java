import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest
{

    //Name Testing

    @Test //1
    void getNameDog()
    {
        Animals dog = new Animals("Dog", "6");
        assert(dog.getName().equals("Dog"));
    }

    @Test //2
    void getNameEmpty()
    {
        Animals empty = new Animals("", "0");
        assert(empty.getName().equals(""));
    }

    @Test //3
    void getName1stCapPassFalse()
    {
        Animals cat = new Animals("cat", "6");
        assertFalse(cat.getName().matches("^[A-Z].*"));
    }

    @Test //4
    void getName1stCapPassTrue()
    {
        Animals cat = new Animals("Cat", "6");
        assertTrue(cat.getName().matches("^[A-Z].*"));
    }

    @Test //5
    void getFirstLetterIsOTrue()
    {
        Animals dog = new Animals("Oreo", "10");
        assertTrue(dog.getName().matches("^O.*"));
    }

    @Test //6
    void getLastLetterIsITrue()
    {
        Animals dog = new Animals("Mochi", "10");
        assertTrue(dog.getName().matches(".*i$"));
    }

    @Test //7
    void getLastLetterIsIFalse()
    {
        Animals dog = new Animals("Oreo", "10");
        assertFalse(dog.getName().matches(".*i$"));
    }

    @Test //8
    void getNameHasTwoOs()
    {
        Animals koala = new Animals("Koobi", "8");
        assertTrue(koala.getName().matches(".*o.*o.*"));
    }

    @Test //9
    void getNameNoNumbers()
    {
        Animals lion = new Animals("Simba", "7");
        assertFalse(lion.getName().matches(".*\\d.*"));
    }

    @Test //10
    void getNameAtLeastOneVowel()
    {
        Animals elephant = new Animals("Dumbo", "9");
        assertTrue(elephant.getName().matches(".*[aeiouAEIOU].*"));
    }

    @Test //11
    void getNameExactlyThreeConsonants()
    {
        Animals penguin = new Animals("Tuna", "5");
        assertFalse(penguin.getName().matches("[^aeiouAEIOU]{3}"));
    }

    @Test //12
    void getNameCapitalOrLowercase()
    {
        Animals panda = new Animals("Panda", "6");
        assertTrue(panda.getName().matches("^[a-zA-Z]*$"));
    }
    @Test //13
    void getNameSpecialCharacter()
    {
        Animals parrot = new Animals("Poly", "6");
        assertFalse(parrot.getName().matches("^[!@#$%^&*(),.?\":{}|<>]*$"));
    }

    @Test //14
    void getNameNoWhitespace()
    {
        Animals bear = new Animals("Grizzly Bear", "11");
        assertTrue(bear.getName().matches(".*\\s.*"));
    }

    @Test //15
    void getNameStartsWithCapitalVowel()
    {
        Animals iguana = new Animals("iggy", "5");
        assertFalse(iguana.getName().matches("^[AEIOU].*"));
    }

    @Test //16
    void getNameThreeLettersOrFewer()
    {
        Animals bat = new Animals("B", "2");
        assertTrue(bat.getName().matches("^.{1,3}$"));
    }

    @Test //17
    void getNameEndsWithDigit()
    {
        Animals fox = new Animals("Foxy", "4");
        assertFalse(fox.getName().matches(".*\\d$"));
    }

    @Test //18
    void getNameUpperCaseAfterFirstLetter()
    {
        Animals giraffe = new Animals("GIraffe", "7");
        assertTrue(giraffe.getName().matches("^.{1}[A-Z][a-z]*$"));
    }

    @Test //19
    void getNameExclamationMark()
    {
        Animals zebra = new Animals("Stripes", "6");
        assertFalse(zebra.getName().matches(".*\\!.*"));
    }

    @Test //20
    void getNameNonAlphabeticCharacters()
    {
        Animals shark = new Animals("Sh@rk", "5");
        assertTrue(shark.getName().matches(".*[^a-zA-Z].*"));
    }

    //Number Testing

    @Test //1
    void getAge5True()
    {
        Animals dog = new Animals("Dog", "5");
        assertTrue(dog.getAge().equals("5"));
    }

    @Test //2
    void getAge5False()
    {
        Animals dog = new Animals("Dog", "6");
        assertFalse(dog.getAge().equals("5"));
    }

    @Test //3
    void getFirstNumberIs1True()
    {
        Animals dog = new Animals("Dog", "10");
        assertTrue(dog.getAge().matches("^1\\d"));
    }

    @Test //4
    void getFirstNumberIs1False()
    {
        Animals dog = new Animals("Dog", "6");
        assertFalse(dog.getAge().matches("^1\\d"));
    }

    @Test //5
    void getAgeSingleDigit()
    {
        Animals cat = new Animals("Cat", "3");
        assertTrue(cat.getAge().matches("^\\d$"));
    }

    @Test //6
    void getAgeTwoDigits()
    {
        Animals bird = new Animals("Bird", "4");
        assertFalse(bird.getAge().matches("^\\d{2}$"));
    }

    @Test //7
    void getAgeThreeDigits()
    {
        Animals fish = new Animals("Fish", "105");
        assertTrue(fish.getAge().matches("^\\d{3}$"));
    }

    @Test //8
    void getAgeGreaterThan10()
    {
        Animals horse = new Animals("Horse", "9");
        assertFalse(horse.getAge().matches("^\\d{2,}$"));
    }

    @Test //9
    void getAgeEqual6()
    {
        Animals rabbit = new Animals("Rabbit", "6");
        assertTrue(rabbit.getAge().equals("6"));
    }

    @Test //10
    void getAgeNotEqual20()
    {
        Animals turtle = new Animals("Turtle", "18");
        assertFalse(turtle.getAge().equals("20"));
    }

    @Test //11
    void getAgeStartsWith2()
    {
        Animals lion = new Animals("Lion", "25");
        assertTrue(lion.getAge().matches("^2\\d"));
    }

    @Test //12
    void getAgeDoesNotEndWith5()
    {
        Animals elephant = new Animals("Elephant", "43");
        assertFalse(elephant.getAge().matches(".*5$"));
    }
}