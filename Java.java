import java.util.Scanner;
public class Java {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int pil;
        
        do {
            mainmenu();
            pil = sc.nextInt();

            switch(pil) {
                case 0 :                    
                    belum_menikah();
                    break;
                case 1 :
                    menikah_bersama();
                    break;
                case 2 :
                    menikah_terpisah();
                    break;
                case 3 :
                    kepala_keluarga();
                    break;     
                // default :
                //     System.out.println("Harap pilih menu 0 - 4 !");                    
            }
        } while ( pil != 4 );

    }

    public static void mainmenu() {
        System.out.println("\n=-=-=-=-=- Menghitung Pajak Perseorangan -=-=-=-=-=\n");
        System.out.println("0. Belum Menikah");
        System.out.println("1. Menikah Bersama");
        System.out.println("2. Menikah Terpisah");
        System.out.println("3. Kepala Keluarga");
        System.out.println("4. Keluar Program");
        System.out.print("Pilih Menu [0...4] : ");
    }

    public static void belum_menikah() {
        float pdpt_tahunan, total = 0;;
        String pil;

        do {
            System.out.print("\nMasukkan Pendapatan Tahunan ( x Rp.10.000 ) :\t");
            pdpt_tahunan = sc.nextInt();
            if ( pdpt_tahunan <= 8350 ) {
                total           = (float)(pdpt_tahunan * 0.1);
            } else if ( pdpt_tahunan <= 33950 ) {
                pdpt_tahunan    -= 8350;
                total           = (float)((pdpt_tahunan * 0.15) + (8350 * 0.1));                
            } else if ( pdpt_tahunan <= 82250 ) {
                pdpt_tahunan    -= 33950;
                total           = (float)((pdpt_tahunan * 0.25) + (33950 * 0.15) + (8350 * 0.1));                
            } else if ( pdpt_tahunan <= 171550 ) {
                pdpt_tahunan    -= 82250;
                total           = (float)((pdpt_tahunan * 0.28) + (82250 * 0.25) + (33950 * 0.15) + (8350 * 0.1));                
            } else if ( pdpt_tahunan <= 372950 ) {
                pdpt_tahunan    -= 171550;
                total           = (float)((pdpt_tahunan * 0.33) + (171550 * 0.28) + (82250 * 0.25) + (33950 * 0.15) + (8350 * 0.1));                
            } else {
                pdpt_tahunan    -= 372950;
                total           = (float)((pdpt_tahunan * 0.35) + (372950 * 0.33) + (171550 * 0.28) + (82250 * 0.25) + (33950 * 0.15) + (8350 * 0.1));                
            }
            
            System.out.println("Pajak sebesar " + total + " (x Rp. 10.000)");
            System.out.print("Apakah anda ingin memasukkan pendapatan kembali ? (y/t) ");
            pil = sc.next();
        } while( pil.equals("y") || pil.equals("Y"));
    }

    public static void menikah_bersama() {
        float pdpt_tahunan, total = 0;
        String pil;

        do {
            System.out.print("\nMasukkan Pendapatan Tahunan ( x Rp.10.000 ) :\t");
            pdpt_tahunan = sc.nextInt();
            if ( pdpt_tahunan <= 16700 ) {
                total           = (float)(pdpt_tahunan * 0.1);
            } else if ( pdpt_tahunan <= 67900 ) {
                pdpt_tahunan    -= 16700;
                total           = (float)((pdpt_tahunan * 0.15) + (16700 * 0.1));                
            } else if ( pdpt_tahunan <= 137050 ) {
                pdpt_tahunan    -= 67900;
                total           = (float)((pdpt_tahunan * 0.25) + (67900 * 0.15) + (16700 * 0.1));                
            } else if ( pdpt_tahunan <= 208850 ) {
                pdpt_tahunan    -= 137050;
                total           = (float)((pdpt_tahunan * 0.28) + (137050 * 0.25) + (67900 * 0.15) + (16700 * 0.1));                
            } else if ( pdpt_tahunan <= 372950 ) {
                pdpt_tahunan    -= 208850;
                total           = (float)((pdpt_tahunan * 0.33) + (208850 * 0.28) + (137050 * 0.25) + (67900 * 0.15) + (16700 * 0.1));                
            } else {
                pdpt_tahunan    -= 372950;
                total           = (float)((pdpt_tahunan * 0.35) + (372950 * 0.33) + (208850 * 0.28) + (137050 * 0.25) + (67900 * 0.15) + (16700 * 0.1));                
            }

            System.out.print("Apakah anda ingin memasukkan pendapatan kembali ? (y/t) ");
            pil = sc.next();
        } while( pil.equals("y") || pil.equals("Y"));
    }

    public static void menikah_terpisah() {
        float pdpt_tahunan, total = 0;;
        String pil;

        do {
            System.out.print("\nMasukkan Pendapatan Tahunan ( x Rp.10.000 ) :\t");
            pdpt_tahunan = sc.nextInt();
            if ( pdpt_tahunan <= 8350 ) {
                total           = (float)(pdpt_tahunan * 0.1);
            } else if ( pdpt_tahunan <= 33950 ) {
                pdpt_tahunan    -= 8350;
                total           = (float)((pdpt_tahunan * 0.15) + (8350 * 0.1));                
            } else if ( pdpt_tahunan <= 68525 ) {
                pdpt_tahunan    -= 33950;
                total           = (float)((pdpt_tahunan * 0.25) + (33950 * 0.15) + (8350 * 0.1));                
            } else if ( pdpt_tahunan <= 104425 ) {
                pdpt_tahunan    -= 68525;
                total           = (float)((pdpt_tahunan * 0.28) + (68525 * 0.25) + (33950 * 0.15) + (8350 * 0.1));                
            } else if ( pdpt_tahunan <= 186475 ) {
                pdpt_tahunan    -= 104425;
                total           = (float)((pdpt_tahunan * 0.33) + (104425 * 0.28) + (68525 * 0.25) + (33950 * 0.15) + (8350 * 0.1));                
            } else {
                pdpt_tahunan    -= 186475;
                total           = (float)((pdpt_tahunan * 0.35) + (186475 * 0.33) + (104425 * 0.28) + (68525 * 0.25) + (33950 * 0.15) + (8350 * 0.1));                
            }
            
            System.out.println("Pajak sebesar " + total + " (x Rp. 10.000)");
            System.out.print("Apakah anda ingin memasukkan pendapatan kembali ? (y/t) ");
            pil = sc.next();
        } while( pil.equals("y") || pil.equals("Y"));
    }

    public static void kepala_keluarga() {
        float pdpt_tahunan, total = 0;;
        String pil;

        do {
            System.out.print("\nMasukkan Pendapatan Tahunan ( x Rp.10.000 ) :\t");
            pdpt_tahunan = sc.nextInt();
            if ( pdpt_tahunan <= 13950 ) {
                total           = (float)(pdpt_tahunan * 0.1);
            } else if ( pdpt_tahunan <= 45500 ) {
                pdpt_tahunan    -= 13950;
                total           = (float)((pdpt_tahunan * 0.15) + (13950 * 0.1));                
            } else if ( pdpt_tahunan <= 117450 ) {
                pdpt_tahunan    -= 45500;
                total           = (float)((pdpt_tahunan * 0.25) + (45500 * 0.15) + (13950 * 0.1));                
            } else if ( pdpt_tahunan <= 190200 ) {
                pdpt_tahunan    -= 117450;
                total           = (float)((pdpt_tahunan * 0.28) + (117450 * 0.25) + (45500 * 0.15) + (13950 * 0.1));                
            } else if ( pdpt_tahunan <= 372950 ) {
                pdpt_tahunan    -= 190200;
                total           = (float)((pdpt_tahunan * 0.33) + (190200 * 0.28) + (117450 * 0.25) + (45500 * 0.15) + (13950 * 0.1));                
            } else {
                pdpt_tahunan    -= 372950;
                total           = (float)((pdpt_tahunan * 0.35) + (372950 * 0.33) + (190200 * 0.28) + (117450 * 0.25) + (45500 * 0.15) + (13950 * 0.1));                
            }
            
            System.out.println("Pajak sebesar " + total + " (x Rp. 10.000)");
            System.out.print("Apakah anda ingin memasukkan pendapatan kembali ? (y/t) ");
            pil = sc.next();
        } while( pil.equals("y") || pil.equals("Y"));
    }

}