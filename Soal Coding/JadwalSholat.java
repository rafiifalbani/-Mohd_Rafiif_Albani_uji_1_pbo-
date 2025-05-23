// Interface AudioReminder
interface AudioReminder {
    void playAdzan();
}

// Abstract class Prayer
abstract class Prayer {
    protected String waktu;

    public Prayer(String waktu) {
        this.waktu = waktu;
    }

    public abstract void remind();
}

// Subclass Fajr
class Fajr extends Prayer implements AudioReminder {
    public Fajr() {
        super("04:30");
    }

    @Override
    public void remind() {
        System.out.println("Waktunya sholat Subuh pada pukul " + waktu + ".");
    }

    @Override
    public void playAdzan() {
        System.out.println("Memutar adzan Subuh...");
    }
}

// Subclass Dhuhr
class Dhuhr extends Prayer implements AudioReminder {
    public Dhuhr() {
        super("12:00");
    }

    @Override
    public void remind() {
        System.out.println("Waktunya sholat Dzuhur pada pukul " + waktu + ".");
    }

    @Override
    public void playAdzan() {
        System.out.println("Memutar adzan Dzuhur...");
    }
}

// Subclass Asr
class Asr extends Prayer implements AudioReminder {
    public Asr() {
        super("15:30");
    }

    @Override
    public void remind() {
        System.out.println("Waktunya sholat Ashar pada pukul " + waktu + ".");
    }

    @Override
    public void playAdzan() {
        System.out.println("Memutar adzan Ashar...");
    }
}

// Subclass Maghrib
class Maghrib extends Prayer implements AudioReminder {
    public Maghrib() {
        super("18:00");
    }

    @Override
    public void remind() {
        System.out.println("Waktunya sholat Maghrib pada pukul " + waktu + ".");
    }

    @Override
    public void playAdzan() {
        System.out.println("Memutar adzan Maghrib...");
    }
}

// Subclass Isha
class Isha extends Prayer implements AudioReminder {
    public Isha() {
        super("19:30");
    }

    @Override
    public void remind() {
        System.out.println("Waktunya sholat Isya pada pukul " + waktu + ".");
    }

    @Override
    public void playAdzan() {
        System.out.println("Memutar adzan Isya...");
    }
}

// Kelas utama
public class JadwalSholat {
    public static void main(String[] args) {
        Prayer[] jadwal = {
            new Fajr(),
            new Dhuhr(),
            new Asr(),
            new Maghrib(),
            new Isha()
        };

        for (Prayer sholat : jadwal) {
            sholat.remind();
            if (sholat instanceof AudioReminder) {
                ((AudioReminder) sholat).playAdzan();
            }
            System.out.println();
        }
    }
}