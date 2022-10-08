public class Main {
    public static void main(String[] args) {
        //Задача 1
        double total =15000;
        double percentage=1.07;
        int i = 0;
        while(total<12000000){
            i++;
            total*=percentage;
            System.out.println("На "+ i +  " месяц Василий накопит "+ total +" рублей");
        }
            System.out.println("Василий накопит нужную сумму за "+ i +" месяцев");
        //Задача 2
        i = 0;
        total =15000;
        while(total<12000000){
            i++;
            total*=percentage;
            if(i%6==0) System.out.println("На "+ i +  " месяц Василий накопит "+ total +" рублей");
        }
        System.out.println("Василий накопит нужную сумму за "+ i +" месяцев");
        //Задача 3
        total =15000;
        i=1;
        for(; i<9*12; i++){
            total*=percentage;
            if(i%6==0) System.out.println("За "+ i/6 +  " полгода Василий накопит "+ total +" рублей");
        }
        //Задача 4
        int firstFriday = 3;
        for(;firstFriday<=31;firstFriday+=7){
            System.out.println("Сегодня пятница, "+firstFriday + "-е число. Необходимо подготовить отчет");
        }
    }
}