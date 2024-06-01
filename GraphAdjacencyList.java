import java.util.LinkedList;

public class GraphAdjacencyList {
    private int jumlahSimpul;
    private LinkedList<Integer>[] daftarSimpul;

    public GraphAdjacencyList(int jumlahSimpul) {
        this.jumlahSimpul = jumlahSimpul;
        daftarSimpul = new LinkedList[jumlahSimpul];
        for (int i = 0; i < jumlahSimpul; i++) {
            daftarSimpul[i] = new LinkedList<>();
        }
    }

    public void tambahkanSisi(int sumber, int tujuan) {
        daftarSimpul[sumber].add(tujuan);
    }

    private String labelSimpul(int indeks) {
        String[] alfabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        return alfabet[indeks];
    }

    public void tampilkanGraf() {
        for (int i = 0; i < jumlahSimpul; i++) {
            if (!daftarSimpul[i].isEmpty()) {
                System.out.print("Simpul " + labelSimpul(i) + " terhubung ke: ");
                for (int j : daftarSimpul[i]) {
                    System.out.print(labelSimpul(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        GraphAdjacencyList graf = new GraphAdjacencyList(10);

        graf.tambahkanSisi(0, 1);
        graf.tambahkanSisi(0, 3);
        graf.tambahkanSisi(0, 4);
        graf.tambahkanSisi(3, 6);
        graf.tambahkanSisi(6, 7);
        graf.tambahkanSisi(7, 8);
        graf.tambahkanSisi(8, 5);
        graf.tambahkanSisi(5, 2);
        graf.tambahkanSisi(2, 1);
        graf.tambahkanSisi(1, 4);
        graf.tambahkanSisi(4, 7);
        graf.tambahkanSisi(4, 5);
        graf.tambahkanSisi(5, 7);

        graf.tampilkanGraf();
    }
}
