class SpaceAge {

	private static final double EARTH_ORBITAL_PERIOD_SECONDS = 31557600;
	private static final double MERCURY_ORBITAL_PERIOD = 0.2408467;
	private static final double VENUS_ORBITAL_PERIOD = 0.61519726;
	private static final double MARS_ORBITAL_PERIOD = 1.8808158;
	private static final double JUPITER_ORBITAL_PERIOD = 11.862615;
	private static final double SATURN_ORBITAL_PERIOD = 29.447498;
	private static final double URANUS_ORBITAL_PERIOD = 84.016846;
	private static final double NEPTUNE_ORBITAL_PERIOD = 164.79132;
	
	private double seconds;
	
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds(double orbitalPeriod) {
        return seconds / (orbitalPeriod * EARTH_ORBITAL_PERIOD_SECONDS);
    }

    double onEarth() {
        return getSeconds(1);
    }

    double onMercury() {
        return getSeconds(MERCURY_ORBITAL_PERIOD);
    }

    double onVenus() {
    	return getSeconds(VENUS_ORBITAL_PERIOD);
    }

    double onMars() {
    	return getSeconds(MARS_ORBITAL_PERIOD);
    }

    double onJupiter() {
    	return getSeconds(JUPITER_ORBITAL_PERIOD);
    }

    double onSaturn() {
    	return getSeconds(SATURN_ORBITAL_PERIOD);
    }

    double onUranus() {
    	return getSeconds(URANUS_ORBITAL_PERIOD);
    }

    double onNeptune() {
    	return getSeconds(NEPTUNE_ORBITAL_PERIOD);
    }

}
