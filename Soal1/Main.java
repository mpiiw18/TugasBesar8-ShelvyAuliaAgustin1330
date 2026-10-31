public class Main {
public void main (String[] args) {
    Buku buku1 = new Buku("B001", "Pulang", "Ashabul Kahfi", 50000);
    Buku buku2 = new Buku("B002", "Laut Bercerita", "Anwar Kamil", 60000);
    Buku buku3 = new Buku("B003", "Milea", "Joko Anwar", 55000);

    buku1.tampilkanInfo();
    buku2.tampilkanInfo();
    buku3.tampilkanInfo();
}
}