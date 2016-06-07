package danigulyas.route;

import danigulyas.station.Station;

import java.util.List;

public interface Route<T extends Station> {
	List<T> getStations();
}
