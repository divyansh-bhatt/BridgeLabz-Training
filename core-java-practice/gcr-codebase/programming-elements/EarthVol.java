public class EarthVol{
    public static void main(String[] args) {

        double radKm=6378;
        double pi = Math.PI;
        double volKm=(4.0/3.0)*pi*Math.pow(radKm,3);
        double volMil=volKm*Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
                volKm + " and cubic miles is " + volMil);
    }
}
