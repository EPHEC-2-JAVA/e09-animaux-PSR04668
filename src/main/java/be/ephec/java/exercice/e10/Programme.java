package be.ephec.java.exercice.e10;

public class Programme {
    public static void main(String[] args) {
        DataReportVisualizer drv1 = new DRVFricEnVrac();
        DataReportVisualizer drv = new DRVBanquierPepere();
        String result = drv.formatData();
        String resultFricEnVrac = drv1.formatData();

        System.out.println("SUIVANT");
        System.out.println(resultFricEnVrac);
        System.out.println(result);
    }
}
