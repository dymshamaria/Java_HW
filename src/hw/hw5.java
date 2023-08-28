package hw;

public class hw5 {
    public static void main(String[] args) {

        //1
//        String s = "Перестановочный алгоритм быстрого действия";
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'о') {
//                System.out.print('o');
//            }
//        }

        //2
//        String s = "Перевыборы выбранного президента";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'е') {
//                count++;
//            }
//        }
//        System.out.println(count);


        //3
//        String s = "Посмотрите как Рите нравится ритм";
//        for (int i = 0; i < s.length() - 3; i++) {
//            if (s.substring(i, i + 3).equalsIgnoreCase("рит")) {
//                System.out.println(i);
//            }
//        }

        //or

//        s = s.toLowerCase();
//
//        int index = s.indexOf("рит");
//        while (index != -1) {
//            System.out.println(index);
//            index = s.indexOf("рит", index + 1);
//        }

        //4
        int count = 0;
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("e")) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
