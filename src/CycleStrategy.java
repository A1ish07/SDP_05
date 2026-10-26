public class CycleStrategy implements RouteStrategy {

    private static final double DETOUR = 1.2;
    private static final double SPEED = 15;

    @Override
    public String buildRoute(double km) {
        double lane = km * DETOUR;
        long minutes = Math.round(lane / SPEED * 60);
        return String.format("Cycle: %.1f km, %d min", lane, minutes);
    }
}