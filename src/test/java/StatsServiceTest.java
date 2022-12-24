import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.amount(sales);

        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void shouldAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.average(sales);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.numberMax(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.numberMin(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.salesMin(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.salesMax(sales);

        Assertions.assertEquals(expected, actual);
    }
}


