import org.example.DiceScore;
import org.example.Ide;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class DiceScoreTest {
    private DiceScore diceScore;
    private Ide de = Mockito.mock(Ide.class);

    //lorsque les 2 dés sont identiques, on récupère bien valeur du dé * 2 + 10
    @Test
    public void WhenBothDicesAreEquals_ThenDiceScoreReturn_DiceValueMultipliedByTwoPlusTen() {

        //Arrange
        diceScore = new DiceScore(de);
        int diceValue = 5;
        Mockito.when(de.getRoll()).thenReturn(diceValue, diceValue);

        //Act
        int score = diceScore.getScore();

        //Assert
        Assert.assertEquals(diceValue * 2 + 10, score);
    }

    //dans le cas ou les 2 dés sont identiques et valent 6 on récupère 30
    @Test
    public void WhenBothDicesEquals_6_ThenDiceScore_30() {

        //Arrange
        diceScore = new DiceScore(de);
        int diceValue = 6;
        Mockito.when(de.getRoll()).thenReturn(diceValue, diceValue);

        //Act
        int score = diceScore.getScore();

        //Assert
        Assert.assertEquals(30, score);
    }

    //dans le cas où les dés sont quelconques, on récupère la valeur du plus haut des 2
    @Test
    public void WhenBothDicesAreDifferent_ThenDiceScoreEqualsHigherValue() {

        //Arrange
        diceScore = new DiceScore(de);
        int diceValue1 = 3;
        int diceValue2 = 6;
        Mockito.when(de.getRoll()).thenReturn(diceValue1, diceValue2);

        //Act
        int score = diceScore.getScore();

        //Assert
        Assert.assertEquals(Math.max(diceValue1,diceValue2), score);
    }
}
