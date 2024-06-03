import org.example.GradingCalculator;
import org.junit.Assert;
import org.junit.Test;

public class GetGradeTest {
    private GradingCalculator gradingCalculator;

    @Test
    public void WhenScore_95_And_AttendancePercentage_90_Then_A (){
        //Arrange
        int score = 95;
        int attendancePercentage = 90;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);

        //Act
        char result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals('A', result);
    }

    @Test
    public void WhenScore_85_And_AttendancePercentage_90_Then_B (){
        //Arrange
        int score = 85;
        int attendancePercentage = 90;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);

        //Act
        char result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals('B', result);
    }

    @Test
    public void WhenScore_65_And_AttendancePercentage_90_Then_C (){
        //Arrange
        int score = 65;
        int attendancePercentage = 90;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);

        //Act
        char result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals('C', result);
    }

    @Test
    public void WhenScore_95_And_AttendancePercentage_65_Then_B (){
        //Arrange
        int score = 95;
        int attendancePercentage = 65;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);

        //Act
        char result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals('B', result);
    }

    @Test
    public void WhenScore_95_And_AttendancePercentage_55_Then_F (){
        //Arrange
        int score = 95;
        int attendancePercentage = 55;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);

        //Act
        char result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals('F', result);
    }

    @Test
    public void WhenScore_65_And_AttendancePercentage_55_Then_F (){
        //Arrange
        int score = 65;
        int attendancePercentage = 55;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);

        //Act
        char result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals('F', result);
    }

    @Test
    public void WhenScore_50_And_AttendancePercentage_90_Then_F (){
        //Arrange
        int score = 50;
        int attendancePercentage = 90;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);

        //Act
        char result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals('F', result);
    }
}
