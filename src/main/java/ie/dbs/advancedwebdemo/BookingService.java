package ie.dbs.advancedwebdemo;
import org.springframework.stereotype.Service;
@Service
public class BookingService {
    public double calculateTotal(int participants, double price) {
        double total = participants * price;
        if (participants > 20) {
            total = total * 0.9;
        }
        return total;
    }
}
