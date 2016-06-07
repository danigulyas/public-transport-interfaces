package danigulyas.vehicle;

import danigulyas.route.Route;
import danigulyas.station.Station;

public interface Vehicle {
	String getLicensePlate();
	Route<Station> getRoute();
	Station getNextStation();
	Station getPreviousStation();
}
