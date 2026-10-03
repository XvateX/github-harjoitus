public class App {
    public static void main(String[] args) throws Exception {
        int ika = 20;   

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
   if (ika >= 18 && ika < 65) {   

        System.out.println("Olet aikuinen");   
   }
   else if (ika >= 65) {
        System.out.println("Olet eläkeläinen");
   }
   else{   

        System.out.println("Olet aikuinen");   

   } 

    }
}
