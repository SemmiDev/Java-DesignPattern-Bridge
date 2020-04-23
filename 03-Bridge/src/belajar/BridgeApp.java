package belajar;

import java.util.List;
import java.util.Arrays;

public class BridgeApp {
    public static void main(String[] args) {
        List<Binatang> binatangs = Arrays.asList(
                new Anjing(),
                new Kucing(),
                new Unta(),
                new Gurita(),
                new Hiu(),
                new Paus()
        );
        binatangs.forEach(binatang -> {
            if(binatang instanceof BinatangLaut){
                BinatangLaut binatangLaut = (BinatangLaut) binatang;
                System.out.println(binatangLaut.getName() + " hidup di air");
            }else if(binatang instanceof BinatangDarat){
                BinatangDarat binatangDarat = (BinatangDarat) binatang;
                System.out.println(binatangDarat.getName() + " hidup di darat");
                System.out.println("Jumlah kaki " + binatangDarat.getName() + " : " + binatangDarat.getJumlahKaki());
                System.out.println("Jumlah telinga " + binatangDarat.getName() + " : " + binatangDarat.getJumlahTelinga());
            }
        });
    }
    
}
