import java.security.Timestamp;
import java.util.List;

public interface Route {
	List<Station> getStations();
	Timestamp getTimeToComplete();
}
