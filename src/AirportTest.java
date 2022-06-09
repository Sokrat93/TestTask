import model.Plane;
import service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        Plane p1 = service.create();
        Plane p2 = service.create();
        Plane p3 = service.create();
        Plane [] planes = {p1,p2,p3};
    }
}
