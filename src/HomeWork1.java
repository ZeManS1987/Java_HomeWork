import java.sql.SQLOutput;
import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args){
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

        String str1 = "234";
        String str2 = "some_text";
        int qwerty = Integer.parseInt(str1);
        int ytrewq = qwerty + str2.length();
        System.out.println("Ответ задания 1" + " - " + ytrewq);

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        int c = (int) Math.pow((a + b), 2);
        System.out.println("Ответ задания 2" + " - " + c);

        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.

        int popados = 0;
        if(hasFuel  == false && hasElectricsProblem == false && hasMotorProblem  == false && hasTransmissionProblem == false && hasWheelsProblem == false) {
            System.out.println("Да быть такого не может! Сейчас что-нибудь найдем");
             Random random = new Random();
             hasFuel = random.nextBoolean();
            hasElectricsProblem = random.nextBoolean();
            hasMotorProblem =random.nextBoolean();
            hasTransmissionProblem = random.nextBoolean();
            hasWheelsProblem = random.nextBoolean();
        }

            if (hasElectricsProblem) {
                popados += 5000;
            }
            if (hasMotorProblem) {
                popados += 10000;
            }
            if (hasTransmissionProblem) {
                popados +=  4000;
            }
            if (hasWheelsProblem) {
                popados +=  2000;
            }
            if ((hasTransmissionProblem && hasMotorProblem) || (hasTransmissionProblem && hasElectricsProblem)) {
                popados -=popados / 5;
            }
            else if ((hasTransmissionProblem && hasWheelsProblem) || (hasElectricsProblem && hasMotorProblem) || (hasElectricsProblem && hasWheelsProblem)
                    || (hasMotorProblem && hasWheelsProblem)) {
                popados -=popados / 10;
            }
            else if ((hasFuel  == true && hasElectricsProblem == false && hasMotorProblem  == false && hasTransmissionProblem == false && hasWheelsProblem == false)){
                popados += 1000;
            }

        System.out.println("Ответ задания 3" + " - " + popados);


    }
}
