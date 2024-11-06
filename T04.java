// 12S24021 - Ika Maria Manurung
// 12S24034 - Immanuel Alexander Tambunan
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        int[] jumlahBuku = new int[3];

        jumlahBuku[0] = 0;
        jumlahBuku[1] = 0;
        jumlahBuku[2] = 0;
        double[] harga = new double[3];

        harga[0] = 0;
        harga[1] = 0;
        harga[2] = 0;
        double[] totalHarga = new double[3];

        totalHarga[0] = 0;
        totalHarga[1] = 0;
        totalHarga[2] = 0;
        double totalAkhir1;
        int i;
        int jumlahBuku0;
        int jumlahBuku1;
        int jumlahBuku2;

        i = 0;
        jumlahBuku0 = 0;
        jumlahBuku1 = 0;
        jumlahBuku2 = 0;
        String buku0;
        String buku1;
        String buku2;

        buku0 = "Buku";
        buku1 = "Buku";
        buku2 = "Buku";
        int nol, satu, dua;

        nol = 0;
        satu = 1;
        dua = 2;
        do {
            iSBN[i] = input.nextLine();
            if (iSBN[i].equals("---")) {
                i = 3;
            } else {
                if (iSBN[i].equals(iSBN[0])) {
                    if (nol == 0) {
                        buku0 = iSBN[i];
                    }
                    if (iSBN[0].equals(buku0)) {
                        i = 0;
                        harga[i] = Double.parseDouble(input.nextLine());
                        jumlahBuku[i] = Integer.parseInt(input.nextLine());
                        jumlahBuku0 = jumlahBuku0 + jumlahBuku[i];
                        nol = 3;
                        i = i + 1;
                    } else {
                        if (satu == 1) {
                            buku1 = iSBN[i];
                        }
                        if (iSBN[0].equals(buku1)) {
                            i = 1;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlahBuku[i] = Integer.parseInt(input.nextLine());
                            jumlahBuku1 = jumlahBuku1 + jumlahBuku[i];
                            nol = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlahBuku[i] = Integer.parseInt(input.nextLine());
                            jumlahBuku2 = jumlahBuku2 + jumlahBuku[i];
                            nol = 3;
                            i = 0;
                        }
                    }
                } else {
                    if (iSBN[i].equals(iSBN[1])) {
                        if (satu == 1) {
                            buku1 = iSBN[i];
                        }
                        if (iSBN[1].equals(buku0)) {
                            i = 1;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlahBuku[i] = Integer.parseInt(input.nextLine());
                            jumlahBuku1 = jumlahBuku1 + jumlahBuku[i];
                            satu = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlahBuku[i] = Integer.parseInt(input.nextLine());
                            jumlahBuku2 = jumlahBuku2 + jumlahBuku[i];
                            satu = 3;
                            i = 0;
                        }
                    } else {
                        if (iSBN[i].equals(iSBN[2])) {
                            if (dua == 2) {
                                buku2 = iSBN[i];
                            }
                            if (iSBN[2].equals(buku2)) {
                                i = 2;
                                harga[i] = Double.parseDouble(input.nextLine());
                                jumlahBuku[i] = Integer.parseInt(input.nextLine());
                                jumlahBuku1 = jumlahBuku1 + jumlahBuku[i];
                                dua = 3;
                                i = 0;
                            }
                        }
                    }
                }
            }
        } while (i < 3);
        if (jumlahBuku0 >= 20) {
            harga[0] = harga[0] - harga[0] * 12 / 100;
        } else {
            if (jumlahBuku0 >= 10) {
                harga[0] = harga[0] - harga[0] * 5 / 100;
            } else {
                if (jumlahBuku0 >= 5) {
                    harga[0] = harga[0] - harga[0] * 2 / 100;
                }
            }
        }
        totalHarga[0] = harga[0] * jumlahBuku0;
        if (jumlahBuku1 >= 20) {
            harga[1] = harga[1] - harga[1] * 12 / 100;
        } else {
            if (jumlahBuku1 >= 10) {
                harga[1] = harga[1] - harga[1] * 5 / 100;
            } else {
                if (jumlahBuku1 >= 5) {
                    harga[1] = harga[1] - harga[1] * 2 / 100;
                }
            }
        }
        totalHarga[1] = harga[1] * jumlahBuku1;
        if (jumlahBuku2 >= 20) {
            harga[2] = harga[2] - harga[2] * 12 / 100;
        } else {
            if (jumlahBuku2 >= 10) {
                harga[2] = harga[2] - harga[2] * 5 / 100;
            } else {
                if (jumlahBuku2 >= 5) {
                    harga[2] = harga[2] - harga[2] * 2 / 100;
                }
            }
        }
        totalHarga[2] = harga[2] * jumlahBuku2;
        totalAkhir1 = totalHarga[0] + totalHarga[1] + totalHarga[2];
        System.out.println(toFixed(totalAkhir1,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
