// Abstract class yang menjadi dasar semua kendaraan
abstract class Vehicle {
    // Abstract method - harus diimplementasikan oleh subclass
    public abstract void startEngine();
}

// Interface untuk kendaraan listrik
interface Electric {
    void chargeBattery();
}

// Class Car mewarisi Vehicle dan mengimplementasikan Electric
class Car extends Vehicle implements Electric {
    @Override
    public void startEngine() {
        System.out.println("Mobil menyala dengan tombol start.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Mobil sedang mengisi baterai.");
    }
}

// Class Motorcycle mewarisi Vehicle, tapi bukan kendaraan listrik
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motor dinyalakan dengan kick starter.");
    }
}

// Kelas utama untuk demonstrasi
public class Kendaraan {
    public static void main(String[] args) {
        // Polymorphism: objek bertipe Vehicle bisa diisi dengan subclass-nya
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();

        // Memanggil metode startEngine sesuai tipe objek sebenarnya
        v1.startEngine();  // Output: Mobil menyala dengan tombol start.
        v2.startEngine();  // Output: Motor dinyalakan dengan kick starter.

        // Pengecekan dan pemanggilan metode interface
        if (v1 instanceof Electric) {
            Electric eCar = (Electric) v1;
            eCar.chargeBattery();  // Output: Mobil sedang mengisi baterai.
        }
    }
}