import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test

    public void shouldCalculateAmountSales (){
        StatsService service = new StatsService();
        int [] arrSale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = service.salesAmount(arrSale);
        Assertions.assertEquals(expected , actual);
    }

    @Test
    public void shouldCalculateAverageAmount (){
        StatsService service = new StatsService();
        int [] arrSale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double expected = 15;
        double actual = service.averageSalesAmount(arrSale);
        Assertions.assertEquals(expected , actual);
    }

    @Test
    public void shouldMonthWithMaxSale (){
        StatsService service = new StatsService();
        int [] arrSale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int actual = service.maxSales(arrSale);
        Assertions.assertEquals(expected , actual);
    }

    @Test
    public void shouldMonthWithMinSale (){
        StatsService service = new StatsService();
        int [] arrSale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = service.minSales(arrSale);
        Assertions.assertEquals(expected , actual);
    }

    @Test
    public void shouldMonthsBellowAverage (){
        StatsService service = new StatsService();
        int [] arrSale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.bellowAverageSales(arrSale);
        Assertions.assertEquals(expected , actual);
    }

    @Test
    public void shouldMonthsUpperAverage (){
        StatsService service = new StatsService();
        int [] arrSale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.upperAverageSales(arrSale);
        Assertions.assertEquals(expected , actual);
    }
}
