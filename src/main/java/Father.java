import java.util.Random;

public class Father {

      final String dbURL = "jdbc:sqlite:test.db";

    //все что есть в данном классе ниже этой строки написано по фану и отвечает за самоуничтожение
    public static void father() throws InterruptedException {
        System.out.println("Зачем ты нажал?");
        Thread.sleep(3000);
        for(int i = 20; i > 0; i--){
            Thread.sleep(70*i);
            System.out.println("4");
            i--;
            Thread.sleep(70*i);
            System.out.println("8");
            i--;
            Thread.sleep(70*i);
            System.out.println("15");
            i--;
            Thread.sleep(70*i);
            System.out.println("16");
            i--;
            Thread.sleep(70*i);
            System.out.println("23");
            i--;
            Thread.sleep(70*i);
            System.out.println("42");
            i--;
        }
        boolean b = true;
        boolean e = true;
        boolean c = true;
        for(int i = 30; i > 0; i--){
            Random ran1 = new Random(System.currentTimeMillis());
            int s = ran1.nextInt(84);
            Thread.sleep(70);
            System.out.println("4");
            Thread.sleep(70);
            System.out.println("8");
            Thread.sleep(70);
            System.out.println("15");
            Thread.sleep(70);
            System.out.println("16");
            Thread.sleep(70);
            System.out.println("23");
            Thread.sleep(70);
            System.out.println("42");

            if(s==34){System.out.println("зачислен перевод 2000"); }
            if(s==0){System.out.println("перевод отклонен");}
            if(s==1){System.out.println("введите корректную сумму");}
            if(s==2){System.out.println("ошибка балланса");}
            if(s==3){System.out.println("привет, я Алиса");}
            if(s==4){System.out.println("кто тебе дал право?!");}
            if(s==5){System.out.println("On this island, survival is not a game");}
            if(s==6 || s==51 || s==52){System.out.println("нажми на чертову кнопку");}
            if(s==7){System.out.println("Беги, Артем!");}
            if(s==8){System.out.println("мы попадем в рай, а они все сдохнут");}
            if(s==9){System.out.println("Тот, у кого хватит храбрости и терпения всю жизнь вглядываться во мрак, первым увидит в нем проблеск света");}
            if(s==10){System.out.println("Каждый пожинает то, что посеял, Артем.");}
            if(s==12){System.out.println("Недостаточно средств");}
            if(s==13){System.out.println("Счастье для всех, даром, и пусть никто не уйдет обиженный!");}
            if(s==14){System.out.println("Блокировка карты админом");}
            if(s==15){System.out.println("Карта заблокирована");}
            if(s==16){System.out.println("дачный кооператив озеро");}
            if(s==17){System.out.println("выдано 500 р");}
            if(s==18){System.out.println("платеж не принят");}
            if(s==19){System.out.println("WARNING");}
            if(s==20){System.out.println("платеж отклонен по баллансу");}
            if(s==21){System.out.println("Пластмассовый мир победил");}
            if(s==22){System.out.println("введите карту для разблокировки");}
            if(s==23){System.out.println("введите pin, для отмены ввести единицу\")");}
            if(s==24){System.out.println("введите номер карты формата хххх-хххх-хххх-хххх");}
            if(s==25){System.out.println("ошибка получения балланса получателя");}
            if(s==26){System.out.println("карта не найдена");}
            if((s==27 || s==77 || s==78 || s==75 || s==73 || s==68)&&b){System.out.println("осталось 3 попытки");
            Thread.sleep(3000);
            System.out.println("изменить твою жизнь");
            Thread.sleep(1000);
            b = false;
            }

            if(s==28){System.out.println("Поехали!");}
            if(s==29){System.out.println("Чтобы понять рекурсию, нужно понять рекурсию");}
            if(s==30 && e== true){System.out.println("поступление на счет суммы 1 000 000 000");
                Thread.sleep(2000);
            System.out.println("теперь ты доволен?");
                Thread.sleep(1000);
                e = false;}

            if(s==31){System.out.println("Она утонула");}
            if(s==32){System.out.println("Это не наши военные, они уволились месяц назад");}
            if(s==35|| s==36 || s==37 ){System.out.println("Пиздец");
                Thread.sleep(100);
                System.out.println("Пиздец");
                Thread.sleep(100);
                System.out.println("Пиздец");
                Thread.sleep(100);
                System.out.println("Пиздец");
                Thread.sleep(100);
                System.out.println("Пиздец");
                Thread.sleep(100);
                System.out.println("Пиздец");
                Thread.sleep(100);
                System.out.println("Пиздец");}

            if(s==33 && c){System.out.println("день");
                Thread.sleep(1000);
            System.out.println("ночь");
                Thread.sleep(1000);
            System.out.println("день");
                Thread.sleep(1000);
            System.out.println("ночь");
                Thread.sleep(1000);
            System.out.println("мы идем по африке");
                Thread.sleep(1000);
                c = false;}
            if(s==38){System.out.println(" Творцы нам тут на хуй не нужны");}
            if(s==39){System.out.println("Когда не думаешь, многое становится ясно.");}
            if(s==40){System.out.println("балланс -100 000");}
        }

        Thread.sleep(70);
        System.out.println("4");
        Thread.sleep(70);
        System.out.println("8");
        Thread.sleep(70);
        System.out.println("15");
        Thread.sleep(70);
        System.out.println("16");
        Thread.sleep(70);
        System.out.println("23");
        Thread.sleep(70);
        System.out.println("42");
        System.out.println("безумству храбрых поем мы песню");
        Thread.sleep(1500);

        Father.Recursion();
    }
    public static void Recursion(){
         Father.Recursion();
    }
}
