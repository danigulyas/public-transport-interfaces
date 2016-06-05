import java.util.List;

public interface Station {
	String getName();
	Location getLocation();
	List<TransportType> getTransportTypes();
}
