package belajar;

public abstract class BinatangLaut implements Binatang{
    @Override
    public boolean hidupDiAir() {
        return true;
    }

    @Override
    public boolean hidupDiDarat() {
        return false;
    }
}
