import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        double summary = 0;
        double mean = 0;
        for (int i = 0; i < numbers.size(); i++){
            summary += numbers.get(i);
        }
        mean = summary/ numbers.size();
                return mean;
    }
}