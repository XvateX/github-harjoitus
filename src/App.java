public class App {
    public static void main(String[] args) throws Exception {
        int ika = 4;   

// Tulostusehdot   

    if (ika >= 0 && ika < 18) {   

        System.out.println("Olet alaikäinen"); 
    }  
    if (ika >= 15 && ika <= 17) {
        System.out.println("Saat ajaa mopoa");
    } 
    if (ika >= 16 && ika <= 17) {
        System.out.println("Saat ajaa kevaria");
    }
    if (ika == 18) {
        System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa");
    }
    if (ika == 20 || ika == 30 || ika ==40 || ika == 50 || ika == 60) {
        System.out.println("Onneksi olkoon! Olet täyttänyt " + ika + " vuotta");
    }
    if (ika == 100) {
        System.out.println("Onneksi olkoon!");
        System.out.println("Olet saavuttanut kunnioitettavan iän, 100 vuotta!");
        System.out.println("Toivotamme sinulle pitkää ikää ja hyvää terveyttä tuleville vuosille.");
    }
    if (ika >= 58 && ika <= 64) {
        System.out.println("Olet täyttänyt " + ika + " vuotta ja voit jäädä varhaiseläkkeelle");
    }
    if (ika >= 39 && ika <= 51) {
        System.out.println("Parasta keski-ikää!");
    }
    if (ika >= 65) {
        System.out.println("Hyviä eläkepäiviä!");
    }
    if (ika >= 18) {
        System.out.println("Olet aikuinen");
    }

   

    }
}
