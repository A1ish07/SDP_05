public class CarStrategy implements RouteStrategy {

    private static final double DETOUR = 1.3;
    private static final double SPEED = 50;

    @Override
    public String buildRoute(double km) {
        double road = km * DETOUR;
        long minutes = Math.round(road / SPEED * 60);
        return String.format("Car: %.1f km, %d min", road, minutes);
    }
}