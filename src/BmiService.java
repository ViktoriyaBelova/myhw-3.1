public class BmiService {

    public int calculate(double heightMeters, int weightKilos) {
       int bodyMassIndex = (int) (weightKilos / (heightMeters * heightMeters));
       return bodyMassIndex;
    }
}
