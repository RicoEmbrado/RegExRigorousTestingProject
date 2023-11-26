import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest
{

    //Name Testing

    @Test //1
    void getNameDog()
    {
        Animals dog = new Animals("Dog", "6", "N/A");
        assert(dog.getName().equals("Dog"));
    }

    @Test //2
    void getNameEmpty()
    {
        Animals empty = new Animals("", "0", "");
        assert(empty.getName().equals(""));
    }

    @Test //3
    void getName1stCapPassFalse()
    {
        Animals cat = new Animals("cat", "6", "N/A");
        assertFalse(cat.getName().matches("^[A-Z].*"));
    }

    @Test //4
    void getName1stCapPassTrue()
    {
        Animals cat = new Animals("Cat", "6", "N/A");
        assertTrue(cat.getName().matches("^[A-Z].*"));
    }

    @Test //5
    void getFirstLetterIsOTrue()
    {
        Animals dog = new Animals("Oreo", "10", "N/A");
        assertTrue(dog.getName().matches("^O.*"));
    }

    @Test //6
    void getLastLetterIsITrue()
    {
        Animals dog = new Animals("Mochi", "10", "N/A");
        assertTrue(dog.getName().matches(".*i$"));
    }

    @Test //7
    void getLastLetterIsIFalse()
    {
        Animals dog = new Animals("Oreo", "10", "N/A");
        assertFalse(dog.getName().matches(".*i$"));
    }

    @Test //8
    void getNameHasTwoOs()
    {
        Animals koala = new Animals("Koobi", "8", "N/A");
        assertTrue(koala.getName().matches(".*o.*o.*"));
    }

    @Test //9
    void getNameNoNumbers()
    {
        Animals lion = new Animals("Simba", "7", "N/A");
        assertFalse(lion.getName().matches(".*\\d.*"));
    }

    @Test //10
    void getNameAtLeastOneVowel()
    {
        Animals elephant = new Animals("Dumbo", "9", "N/A");
        assertTrue(elephant.getName().matches(".*[aeiouAEIOU].*"));
    }

    @Test //11
    void getNameExactlyThreeConsonants()
    {
        Animals penguin = new Animals("Tuna", "5", "N/A");
        assertFalse(penguin.getName().matches("[^aeiouAEIOU]{3}"));
    }

    @Test //12
    void getNameCapitalOrLowercase()
    {
        Animals panda = new Animals("Panda", "6", "N/A");
        assertTrue(panda.getName().matches("^[a-zA-Z]*$"));
    }
    @Test //13
    void getNameSpecialCharacter()
    {
        Animals parrot = new Animals("Poly", "6", "N/A");
        assertFalse(parrot.getName().matches("^[!@#$%^&*(),.?\":{}|<>]*$"));
    }

    @Test //14
    void getNameNoWhitespace()
    {
        Animals bear = new Animals("Grizzly Bear", "11", "N/A");
        assertTrue(bear.getName().matches(".*\\s.*"));
    }

    @Test //15
    void getNameStartsWithCapitalVowel()
    {
        Animals iguana = new Animals("iggy", "5", "N/A");
        assertFalse(iguana.getName().matches("^[AEIOU].*"));
    }

    @Test //16
    void getNameThreeLettersOrFewer()
    {
        Animals bat = new Animals("B", "2", "N/A");
        assertTrue(bat.getName().matches("^.{1,3}$"));
    }

    @Test //17
    void getNameEndsWithDigit()
    {
        Animals fox = new Animals("Foxy", "4", "N/A");
        assertFalse(fox.getName().matches(".*\\d$"));
    }

    @Test //18
    void getNameUpperCaseAfterFirstLetter()
    {
        Animals giraffe = new Animals("GIraffe", "7", "N/A");
        assertTrue(giraffe.getName().matches("^.{1}[A-Z][a-z]*$"));
    }

    @Test //19
    void getNameExclamationMark()
    {
        Animals zebra = new Animals("Stripes", "6", "N/A");
        assertFalse(zebra.getName().matches(".*\\!.*"));
    }

    @Test //20
    void getNameNonAlphabeticCharacters()
    {
        Animals shark = new Animals("Sh@rk", "5", "N/A");
        assertTrue(shark.getName().matches(".*[^a-zA-Z].*"));
    }

    //Age Testing

    @Test //1
    void getAge5True()
    {
        Animals dog = new Animals("Dog", "5", "N/A");
        assertTrue(dog.getAge().equals("5"));
    }

    @Test //2
    void getAge5False()
    {
        Animals dog = new Animals("Dog", "6", "N/A");
        assertFalse(dog.getAge().equals("5"));
    }

    @Test //3
    void getFirstNumberIs1True()
    {
        Animals dog = new Animals("Dog", "10", "N/A");
        assertTrue(dog.getAge().matches("^1\\d"));
    }

    @Test //4
    void getFirstNumberIs1False()
    {
        Animals dog = new Animals("Dog", "6", "N/A");
        assertFalse(dog.getAge().matches("^1\\d"));
    }

    @Test //5
    void getAgeSingleDigit()
    {
        Animals cat = new Animals("Cat", "3", "N/A");
        assertTrue(cat.getAge().matches("^\\d$"));
    }

    @Test //6
    void getAgeTwoDigits()
    {
        Animals bird = new Animals("Bird", "4", "N/A");
        assertFalse(bird.getAge().matches("^\\d{2}$"));
    }

    @Test //7
    void getAgeThreeDigits()
    {
        Animals fish = new Animals("Fish", "105", "N/A");
        assertTrue(fish.getAge().matches("^\\d{3}$"));
    }

    @Test //8
    void getAgeGreaterThan10()
    {
        Animals horse = new Animals("Horse", "9", "N/A");
        assertFalse(horse.getAge().matches("^\\d{2,}$"));
    }

    @Test //9
    void getAgeEqual6()
    {
        Animals rabbit = new Animals("Rabbit", "6", "N/A");
        assertTrue(rabbit.getAge().equals("6"));
    }

    @Test //10
    void getAgeNotEqual20()
    {
        Animals turtle = new Animals("Turtle", "18", "N/A");
        assertFalse(turtle.getAge().equals("20"));
    }

    @Test //11
    void getAgeStartsWith2()
    {
        Animals lion = new Animals("Lion", "25", "N/A");
        assertTrue(lion.getAge().matches("^2\\d"));
    }

    @Test //12
    void getAgeDoesNotEndWith5()
    {
        Animals elephant = new Animals("Elephant", "43", "N/A");
        assertFalse(elephant.getAge().matches(".*5$"));
    }

    @Test //13
    void getAgeEvenNumber()
    {
        Animals monkey = new Animals("Monkey", "14", "N/A");
        assertTrue(monkey.getAge().matches("^\\d*[02468]$"));
    }

    @Test //14
    void getAgeOddNumber()
    {
        Animals giraffe = new Animals("Giraffe", "33", "N/A");
        assertTrue(giraffe.getAge().matches("^\\d*[13579]$"));
    }

    @Test //15
    void getAgeNotTripleDigit()
    {
        Animals zebra = new Animals("Zebra", "8", "N/A");
        assertFalse(zebra.getAge().matches("^\\d{3}$"));
    }

    @Test //16
    void getAgeContainsDigit()
    {
        Animals kangaroo = new Animals("Kangaroo", "27", "N/A");
        assertTrue(kangaroo.getAge().matches(".*\\d.*"));
    }

    @Test //17
    void getAgeEmpty()
    {
        Animals empty = new Animals("", "0", "");
        assert(empty.getAge().equals("0"));
    }

    @Test //18
    void getAgeContainsDigitNotEqual5()
    {
        Animals koala = new Animals("Koala", "36", "N/A");
        assertTrue(koala.getAge().matches(".*[0-46-9].*"));
    }

    @Test //19
    void getAgeContainsRepeatedDigit()
    {
        Animals elephant = new Animals("Elephant", "123", "N/A");
        assertFalse(elephant.getAge().matches(".*(\\d)\\1.*"));
    }

    @Test //20
    void getAgeContainsConsecutiveDigits()
    {
        Animals lion = new Animals("Lion", "345", "N/A");
        assertTrue(lion.getAge().matches(".*\\d{2,}.*"));
    }

    //Username Testing

    @Test //1
    void getUsernameContainsLetterAndNumber()
    {
        Animals lion = new Animals("Lion", "3", "LionBoy123");
        assertTrue(lion.getUsername().matches(".*[a-zA-Z].*\\d.*"));
    }

    @Test //2
    void getUsernameStartsWithLetter()
    {
        Animals lion = new Animals("Tiger", "4", "TigerKing456");
        assertTrue(lion.getUsername().matches("^[a-zA-Z].*"));
    }

    @Test //3
    void getUsernameEndsWithNumber()
    {
        Animals elephant = new Animals("Elephant", "5", "BigEars789");
        assertTrue(elephant.getUsername().matches(".*\\d$"));
    }

    @Test //4
    void getUsernameContainsSpecialCharacter()
    {
        Animals giraffe = new Animals("Giraffe", "7", "Giraffe@42");
        assertTrue(giraffe.getUsername().matches(".*[^a-zA-Z0-9].*"));
    }

    @Test //5
    void getUsernameAtLeastOneUppercaseLetter()
    {
        Animals monkey = new Animals("Monkey", "8", "Monkey123");
        assertTrue(monkey.getUsername().matches(".*[A-Z].*"));
    }

    @Test //6
    void getUsernameAtLeastOneLowercaseLetter()
    {
        Animals panda = new Animals("Panda", "9", "PANDa456");
        assertTrue(panda.getUsername().matches(".*[a-z].*"));
    }

    @Test //7
    void getUsernameWhitespace()
    {
        Animals koala = new Animals("Koala", "10", "Koala Bear67");
        assertTrue(koala.getUsername().matches(".*\\s.*"));
    }

    @Test //8
    void getUsernameAtLeastOneDigit()
    {
        Animals kangaroo = new Animals("Kangaroo", "11", "JoeyRoo");
        assertFalse(kangaroo.getUsername().matches(".*\\d.*"));
    }

    @Test //9
    void getUsernameNoConsecutiveNumbers()
    {
        Animals dolphin = new Animals("Dolphin", "12", "Flipper1234");
        assertTrue(dolphin.getUsername().matches(".*\\d{2,}.*"));
    }

    @Test //10
    void getUsernameStartsWithNumber()
    {
        Animals turtle = new Animals("Turtle", "13", "567Turtle");
        assertTrue(turtle.getUsername().matches("^\\d.*"));
    }

    @Test //11
    void getUsernameConsecutiveLetters()
    {
        Animals penguin = new Animals("Penguin", "14", "Peng123uin");
        assertTrue(penguin.getUsername().matches(".*[a-zA-Z]{2,}.*"));
    }

    @Test //12
    void getUsernameLengthBetween6and10()
    {
        Animals snake = new Animals("Snake", "16", "Snake99");
        assertTrue(snake.getUsername().matches("^.{6,10}$"));
    }

    @Test //13
    void getUsernameRepeatingSequence()
    {
        Animals fox = new Animals("Fox", "19", "FoxFox123");
        assertTrue(fox.getUsername().matches(".*(.{2,}).*\\1.*"));
    }

    @Test //14
    void getUsernameLeadingZero()
    {
        Animals horse = new Animals("horse", "20", "007Horse");
        assertTrue(horse.getUsername().matches("^0\\d.*"));
    }

    @Test //15
    void getUsernameDigitNotAtBeginningOrEnd()
    {
        Animals parrot = new Animals("Parrot", "22", "Colorful123Feathers");
        assertTrue(parrot.getUsername().matches(".*[^\\d]\\d+[^\\d].*"));
    }

    @Test //16
    void getUsernameTwoDifferentUppercaseLetters()
    {
        Animals cheetah = new Animals("Cheetah", "23", "SpeedyCAT123");
        assertTrue(cheetah.getUsername().matches(".*([A-Z]).*.*([A-Z]).*"));
    }

    @Test //17
    void getUsernameLowercaseLetterFollowedByDigit()
    {
        Animals monkey = new Animals("Monkey", "24", "HappyMonkey7");
        assertTrue(monkey.getUsername().matches(".*[a-z].*\\d.*"));
    }

    @Test //18
    void getUsernameContainsDigitFollowedBySpecialCharacter()
    {
        Animals penguin = new Animals("Penguin", "26", "Penguin42!");
        assertTrue(penguin.getUsername().matches(".*\\d.*[^a-zA-Z0-9].*"));
    }

    @Test //19
    void getUsernameUppercaseFollowedByLowercase()
    {
        Animals bear = new Animals("Bear", "27", "GrizzlyBear99");
        assertTrue(bear.getUsername().matches(".*[A-Z].*[a-z].*"));
    }

    @Test //20
    void getUsernameContainsTwoConsecutiveDigits()
    {
        Animals elephant = new Animals("Elephant", "29", "BigEars5678");
        assertTrue(elephant.getUsername().matches(".*\\d{2}.*"));
    }
}