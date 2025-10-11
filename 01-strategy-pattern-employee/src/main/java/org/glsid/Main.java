package org.glsid;

public class Main {
    public static void main(String[] args) {
        IGRCalcStrategy algerieStrategy = new AlgerieIGRCalcStrategyImpl();
        IGRCalcStrategy marocStrategy = new MarocIGRCalcStrategyImpl();

        Employe employeAlgerie1 = new Employe("ALG1", 5000, algerieStrategy);

        Employe employeMaroc1 = new Employe("MAR1", 3000, marocStrategy);
        Employe employeMaroc2 = new Employe("MAR2", 4000, marocStrategy);
        Employe employeMaroc3 = new Employe("MAR3", 12000, marocStrategy);

        System.out.println("=== EMPLOYES ALGERIE ===");
        afficherInfosEmploye(employeAlgerie1);
        employeAlgerie1.setIgrCalcStrategy(marocStrategy);
        System.out.println("Employe " + employeAlgerie1.getCin() + " avec strategie Maroc:");
        afficherInfosEmploye(employeAlgerie1);

        System.out.println("\n=== EMPLOYES MAROC ===");
        afficherInfosEmploye(employeMaroc1);
        employeMaroc1.setIgrCalcStrategy(algerieStrategy);
        System.out.println("Employe " + employeMaroc1.getCin() + " avec strategie Algerie:");
        afficherInfosEmploye(employeMaroc1);
        afficherInfosEmploye(employeMaroc2);
        afficherInfosEmploye(employeMaroc3);
    }

    private static void afficherInfosEmploye(Employe employe) {
        System.out.println("CIN: " + employe.getCin());
        System.out.println("Salaire Brut Mensuel: " + employe.getSalaireBrutMensuel() + " DH");
        System.out.println("IGR Annuel: " + employe.calculerIGR() + " DH");
        System.out.println("Salaire Net Mensuel: " + employe.getSalaireNetMensuel() + " DH");
        System.out.println("------------------------");
    }
}