package HW;

public class HW2 {
    public static void main(String[] args) {

        //task_1
        int a = 1000;
        int b = 33;

        System.out.print("a + b = ");
        System.out.println(a + b);
        System.out.print("a - b = ");
        System.out.println(a - b);
        System.out.print("a * b = ");
        System.out.println(a * b);
        System.out.print("целая часть от деления а на b равна ");
        System.out.println(a / b);
        System.out.print("остаток от деления а на b равен ");
        System.out.println(a % b);
        System.out.print("остаток от деления а на b равен ");
        System.out.println("a/b = ");
        System.out.println(a * 1.0 / b);

        //Проверка на четность
        System.out.println("остаток от деления а на 2 равен ");
        System.out.println(a % 2);
        System.out.println("a - четное число? ");
        System.out.println(a % 2 == 0);
        System.out.println("b - четное число? ");
        System.out.println(b % 2 == 0);

        // task_2
        int totalLoot = 500; //пиастры
        int crewSize = 25; //пираты

        int ownerShare = totalLoot / 2;
        int captainsShare = (totalLoot - ownerShare) / 2;
        int commonShare = (totalLoot - ownerShare - captainsShare) / crewSize;

        int totalDistributed = ownerShare + captainsShare + commonShare * crewSize;

        System.out.print("Рядовому пирату: ");
        System.out.println(commonShare);
        System.out.print("Капитану ");
        System.out.println(captainsShare+commonShare);
        System.out.print("Владельцу: ");
        System.out.println(ownerShare);
        System.out.print("ИТОГО ");
        System.out.println(totalDistributed);
        System.out.print("Остаток: ");
        System.out.println(totalLoot - totalDistributed);

        //Task_3
        System.out.println("Smile, you are on camera \u0830\uDE01!");
        System.out.println(Character.toChars(0x1F525));
    }
}
