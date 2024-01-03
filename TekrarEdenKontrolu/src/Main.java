import java.util.Arrays;

public class Main {
    // Tekrar eden değer kontrolü
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Verilen liste
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 2, 10, 9, 8, 10};

        // Listede bulunan yinelenen değerleri depolamak için yeni bir dizi oluştur
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        // Her eleman için yinelenenleri kontrol et
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    // Değerin daha önce eklenip eklenmediğini kontrol et
                    if (!isFind(duplicate, list[i])) {
                        // Yineleme dizisine ekle ve indeksi artır
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        // Yinelenen ve çift sayıları ekrana yazdır
        for (int value : duplicate) {
            if ((value != 0) && (value % 2 == 0)) {
                System.out.println(value);
            }
        }
    }
}
