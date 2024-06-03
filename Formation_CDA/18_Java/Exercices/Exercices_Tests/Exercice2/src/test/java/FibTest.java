import org.example.Fib;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FibTest {

    private Fib fib;

    //Lors du déclenchement de la fonction GetFibSeries() avec un Range de 1
    //Le résultat correspond à une liste qui contient {0}
    @Test
    public void WhenRange_1_Then_0() {
        //Arrange
        int range = 1;
        fib = new Fib(range);

        //Act
        List<Integer> result = fib.getFibSeries();

        //Assert
        for (Integer i : result) {
            Assert.assertEquals(Integer.valueOf(0), i);
        }
    }

    //Le résultat n’est pas vide
    @Test
    public void WhenRange_1_Then_IsNotEmpty() {
        //Arrange
        int range = 1;
        fib = new Fib(range);

        //Act
        List<Integer> result = fib.getFibSeries();

        //Assert
        Assert.assertFalse(result.isEmpty());
    }

    //-------------------------------------------------------------------------------

    // Lors du déclenchement de la fonction GetFibSeries() avec un Range de 6

    //Le résultat contient le chiffre 3
    @Test
    public void WhenRange_6_Then_Contains_3() {
        //Arrange
        int range = 6;
        fib = new Fib(range);

        //Act
        List<Integer> result = fib.getFibSeries();

        //Assert
        Assert.assertTrue(result.contains(3));
    }

    //Le résultat contient 6 éléments
    @Test
    public void WhenRange_6_Then_Contains_6_Elements() {
        //Arrange
        int range = 6;
        fib = new Fib(range);

        //Act
        List<Integer> result = fib.getFibSeries();

        //Assert
        Assert.assertEquals(6,result.size());
    }

    //Le résultat n’a pas le chiffre 4 en son sein
    @Test
    public void WhenRange_6_Then_DoNotContains_4() {
        //Arrange
        int range = 6;
        fib = new Fib(range);

        //Act
        List<Integer> result = fib.getFibSeries();

        //Assert
        Assert.assertFalse(result.contains(4));
    }

    //Le résultat correspond à une liste qui contient {0, 1, 1, 2, 3, 5}
    @Test
    public void WhenRange_6_Then_Contains_0_1_1_2_3_5() {
        //Arrange
        int range = 6;
        fib = new Fib(range);

        //Act
        List<Integer> result = fib.getFibSeries();
        Integer[] expected = {0, 1, 1, 2, 3, 5};
        Integer[] resultArray = result.toArray(new Integer[0]);

        //Assert
        Assert.assertArrayEquals(expected, resultArray);
    }

    //Le résultat est trié de façon ascendante
    @Test
    public void WhenRange_6_Then_Sorted_Ascending() {
        //Arrange
        int range = 6;
        fib = new Fib(range);

        //Act
        List<Integer> result = fib.getFibSeries();

        //Assert
        for (int i = 0; i < result.size() - 1; i++) {
            Assert.assertTrue(result.get(i) <= result.get(i + 1));
        }
    }


}
