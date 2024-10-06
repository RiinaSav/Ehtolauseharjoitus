      // 1. Tutki onko luku1 yhtä suuri kuin luku2.
      //   2. Tutki onko luku1 suurempi kuin luku2.
      //   3. Tutki onko luku1 suurempi tai yhtä suuri kuin luku2.
      //   4. Tutki onko luku1 eri suuri kuin luku2.
      public class App {
        public static void main(String[] args) throws Exception {
       

        // 1.1
        // int luku1 = 100;
        // int luku2 = 10;

        //  if (luku1 == luku2) {
        //     System.out.println("luku1 on yhtä suuri kuin luku2");
        //  }
        //  else
        //  {
        //     System.out.println("luku1 ei ole yhtä suuri kuin luku2");
        // }

        // 1.2
    //     if (luku1 > luku2) {
    //         System.out.println("luku1 on suurempi kuin luku2");
    //     }
    //     else
    //     {
    //         System.out.println("luku1 ei ole suurempi kuin luku2");
    // }

    //   1.3

//     if (luku1 >= luku2){
//         System.out.println("luku1 on suurempi tai yhtä suuri kuin luku2");
//     }
//     else
//     {
//         System.out.println("luku1 on pienempi kuin luku2");
//      }
// }
//       }

    //   1.4

        // int luku1 = 10;
        // int luku2 = 35;
        // int luku3 = 26;

    // if (luku1 != luku2){
    //     System.out.println("luku1 on eri suuri kuin luku2");
    // }
    // else
    // {
    //     System.out.println("Luku1 on yhtä suuri kuin luku2");

    // }
    //  }
    //   }


// 2.1 Tutki onko luku1 ja luku2 yhtä suuria TAI luku2 ja luku3 yhtä suuria.

// if (luku1 == luku2 || luku2 == luku3) {
// System.out.println("Luku1 on yhtä suuri kuin luku2 tai luku2 on yhtä suuri kuin luku3");
// }

// 2.2 Tutki onko luku1 suurempi kuin luku2 JA luku1 yhtä suuri kuin luku3.

    // if (luku1 > luku2 && luku1 == luku3) {
    //     System.out.println("Luku1 on suurempi kuin luku2 ja luku1 on yhtä suuri kuin luku3");
    // }

// 2.3 Tutki onko luku1 ja luku2 ja luku3 yhtä suuria.

// if (luku1 == luku2 && luku2 == luku3); {

// System.out.println("kaikki samoja");

// }
// }
// }

// 2.4 Tutki onko luku1 suurempi kuin luku2. Jos ei ole, tutki onko luku2 suurempi kuin luku3.

// if (luku1 > luku2) {
//     System.out.println("on");
// }   
// else { 
//     System.out.println("ddd");
// }
// }
// }

// if (luku1 > luku2) {
//     System.out.println("on");
// }   
// else if (luku2 > luku3) { 
//     System.out.println("luku 2 > luku3");
// }
// }
// }

    // int luku1 = 26;
    // int luku2 = 10;
    // int luku3 = 26;
    
//2.5 Tutki onko luku1 ja luku2 yhtä suuria. Jos ei ole, tutki, onko luku1 ja luku 3 yhtä suuria.

// if (luku1 == luku2) {
//     System.out.println("jees"); 
// }
//     else if (luku1 == luku3) {
//         System.out.println("onhan ne");
//  }
//     }
// }

// 3. Tee kolme muuttujaa -nimi1, nimi2 ja nimi3
String nimi1 = "Matti";
String nimi2 = "Teppo";
String nimi3 = "Matti";

// 3.1 Tutki onko nimi1 ja nimi2 samoja

// if (nimi1.equals("aa")) {
//     System.out.println("1 ja 2 samoja");
// }

// //3.2 Tutki onko nimi1 ja nimi2 erisuuria

// if (!nimi1.equals("qq")) {
//     System.out.println("1 ja 2 ei ole samoja");
// }

// 3.3 Tutki onko nimi1 ja nimi2 samoja. Jos ei ole, tutki onko nimi1 ja nimi3 samoja

if (nimi1.equals("Teppo")) {
    System.out.println("nimi1 ja nimi2 ovat samoja.");
// } else {
//     System.out.println("nimi1 ja nimi2 eivät ole samoja.");

    }
    else if (nimi1.equals("Matti")) 
    {
         System.out.println("nimi1 ja nimi3 ovat samoja");
    }
    else
    {
        System.out.println("nimi1 ja nimi3 eivät ole samoja.");
    }
        }
    }