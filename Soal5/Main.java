package tiketBioskop;


import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(
            new Tiket("T001", "Surga dan Neraka", "Reguler", 45000, 2)
        );
        daftarTiket.add(
            new Tiket("T002", "Badut Gendong", "VIP", 75000, 5)
        );

        for (Tiket tiket : daftarTiket) {
            System.out.println("=== Data Pesanan Tiket ===");
            tiket.tampilData();
            System.out.println();
        }
    }
}

