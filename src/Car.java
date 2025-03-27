
class Car {
    private String marka, model, rang;
    private int yil;
    private double narx;
    private boolean sotilgan;

    public Car(String marka, String model, String rang, int yil, double narx) {
        this.marka = marka;
        this.model = model;
        this.rang = rang;
        this.yil = yil;
        this.narx = narx;
        this.sotilgan = false;
    }

    public String getModel() {
        return model;
    }
    public String getRang() {
        return rang;
    }
    public double getNarx() {
        return narx;
    }
    public boolean isSotilgan() {
        return sotilgan;
    }
    public void setSotilgan(boolean sotildi) {
        this.sotilgan = sotildi;
    }

    @Override
    public String toString() {
        return marka + " " + model + " (" + yil + ") - " + rang + ", Narx: $" + narx + (sotilgan ? " (Sotilgan)" : "");
    }
}
