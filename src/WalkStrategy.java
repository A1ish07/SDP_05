public class WalkStrategy implements RouteStrategy {

    private static final double DETOUR = 1.1;
    private static final double SPEED = 5;

    @Override
    public String buildRoute(double km) {
        double path = km * DETOUR;
        long minutes = Math.round(path / SPEED * 60);
        return String.format("Walk: %.1f km, %d min", path, minutes);
    }
}