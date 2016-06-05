public interface Trip {
	Route getRoute();
	Station getLastStation();
	Station getNextStation();
	TransportDevice getTransportationDevice();

	void bumpStations(); //the device has arrived, pick the next one from the station list of route
}
