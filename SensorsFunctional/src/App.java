public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        var sensors = new Sensor[] {
            new Sensor(37, 55),
            new Sensor(28, 55),
            new Sensor(44, 55),
            new Sensor(25, 55),
            new Sensor(24, 55),
        };

        Thermometer[] therms = new Thermometer[]{
            new Thermometer(37),
            new Thermometer(28),
            new Thermometer(44),
            new Thermometer(25),
            new Thermometer(24)
        };

        var refrigerators = new RefrigeratorSensor[] {
            new RefrigeratorSensor(28),
            new RefrigeratorSensor(44),
            new RefrigeratorSensor(25),
            new RefrigeratorSensor(24),
        };

        // double sum = 0;

        // for (Sensor sensor : sensors) {
        //     sum += sensor.getExternalTemp();
        // }

        // System.out.println("La temperatura esterna media dei sensori: " + averageExternalTemp(sensors, new SensorExternalTempGetter()) + " gradi!");

        // System.out.println("La temperatura esterna media dei termometri: " + averageExternalTemp(therms, new ThermometerExternalTempGetter()) + " gradi!");

        // PropertyGetter sensorPGetter = (Object obj) -> ((Sensor) obj).getExternalTemp();

        // PropertyGetter thermometerPGetter = (Object obj) -> ((Thermometer) obj).getExternalTemp();

        // System.out.println("La temperatura esterna media dei sensori: " + averageExternalTemp(sensors, sensorPGetter) + " gradi!");

        // System.out.println("La temperatura esterna media dei termometri: " + averageExternalTemp(therms,thermometerPGetter) + " gradi!");

        System.out.println("La temperatura esterna media dei sensori: " + averageExternalTemp(sensors, (Object obj) -> ((Sensor) obj).getExternalTemp()) + " gradi!");

        System.out.println("La temperatura esterna media dei termometri: " + averageExternalTemp(therms,(Object obj) -> ((Thermometer) obj).getExternalTemp()) + " gradi!");

        System.out.println("La temperatura esterna media dei refigerator: " + averageExternalTemp(refrigerators,(Object obj) -> ((RefrigeratorSensor) obj).getExternalTemp()) + " gradi!");
    }

    // public static double averageExternalTem(Sensor[] sensors){
    //     double sum = 0;

    //     for (Sensor sensor : sensors) {
    //         sum += sensor.getExternalTemp();
    //     }

    //     return sum/sensors.length;
    // }

    // public static double averageExternalTemp(Sensor[] sensors, PropertyGetter pGetter){
    //     double sum = 0;

    //     for (Sensor sensor : sensors) {
    //         sum += pGetter.getDoubleProperty(sensor);
    //     }

    //     return sum/sensors.length;
    // }

    public static <T> double averageExternalTemp(T[] tempsRevealed, PropertyGetter pGetter){
        double sum = 0;

        for (T s : tempsRevealed) {
            sum += pGetter.getDoubleProperty(s);
        }

        return sum/tempsRevealed.length;
    }
}
