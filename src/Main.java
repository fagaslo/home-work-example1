public class Main {
    public static void main(String[] args) {
        //задача 1
        byte photoCamera =1;
        short people =10;
        int chairs =999;
        long fish =3500L;
        float Sausage = 2.5F;
        double water=8.848582;
       System.out.println(photoCamera+people+chairs+fish+Sausage+water);

        //задание 2

        double boxerWeight1= 78.2;
        double boxerWeight2= 82.7;
        double totalWeight = boxerWeight1+boxerWeight2;
        double weightDifference = boxerWeight2-boxerWeight1;
        System.out.println("вес 2 Бойцов " +totalWeight);
        System.out.println("Разница в весе "+weightDifference );

        // задание 3
        //количество продуктов
        byte bananas =5;
        short milk = 200;
        byte iceCream = 2;
        byte agg = 4;
        // масса продуктов
        byte weightOneBanana=80;
        byte oneMilk=105;
        byte iceCreamPackaging= 100;
        byte oneAgg =70;
        //общая масса продуктов
        int weightBanana = bananas * weightOneBanana;
        short weightMilk = (short) (milk*oneMilk);
        short weightIceCream = (short) (iceCream*iceCreamPackaging);
        short weightAgg = (short) (agg*oneAgg);
        int weight = weightAgg+weightMilk+weightIceCream+weightBanana+weightMilk;
        int grInKg=1000;
        System.out.println("Общая масса " +weight/grInKg );

        // задание 4
        byte excessWeight = 7;
        int kgInGr = 1000;
        short gr1 = 250;
        short gr2 = 500;
        int excessWeightGr=excessWeight*kgInGr;
        int day1=excessWeightGr/gr1;
        int day2= excessWeightGr/gr2;
        byte day=2;
        int allDay= day2+day1;
        int SrDay= allDay/day;
        System.out.println(day1+ " дней понадобится для похудения при 250гр");
        System.out.println(day2+" дней понадобится для похудения при 500гр");
        System.out.println(SrDay+ " Среднее количество дней для похудения");

       //задание 5
        int Masha = 67760;
        int Denis = 83690;
        int Kristina=76230;
        float procent = 0.1f;
        //сумма процента

        float MashaProcent= Masha*procent;
        float DenisProcent= Denis*procent;
        float KristinaProcent= Kristina*procent;
        //сумма процента +зп
        float zpMasha= MashaProcent+Masha;
        float ZpDenis= DenisProcent+Denis;
        float ZpKristina= Kristina+KristinaProcent;
        short year12=12;
        float yearMasha= (zpMasha*year12)-(Masha*year12);
        float yearDenis=(ZpDenis*year12)-(Denis*year12);
        float yearKristina=(ZpKristina*year12)-(Kristina*year12);
        System.out.println ("Маша теперь получает " + zpMasha+ "рублей.Годовой доход вырос на "+ yearMasha +"рублей");
        System.out.println ("Денис теперь получает " + ZpDenis + "рублей.Годовой доход вырос на " + yearDenis+ "рублей");
        System.out.println ("Кристина теперь получает "+ ZpKristina + "рублей.Годовой доход вырос на " + yearKristina +"рублей");




    }
}