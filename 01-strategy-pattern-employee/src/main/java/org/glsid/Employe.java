package org.glsid;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private IGRCalcStrategy igrCalcStrategy;

    public Employe(String cin, float salaireBrutMensuel, IGRCalcStrategy igrCalcStrategy) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
        this.igrCalcStrategy = igrCalcStrategy;
    }

    public void setIgrCalcStrategy(IGRCalcStrategy igrCalcStrategy) {
        this.igrCalcStrategy = igrCalcStrategy;
    }

    public float calculerIGR(){
        float salaireBrutAnuel = salaireBrutMensuel * 12;
        return igrCalcStrategy.calculerIGR(salaireBrutAnuel);
    }
    public float getSalaireNetMensuel(){
        float igr=calculerIGR();
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;

    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }
}
