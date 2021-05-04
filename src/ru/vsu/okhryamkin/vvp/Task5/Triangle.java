package ru.vsu.okhryamkin.vvp.Task5;

public class Triangle {

    public void drawTriangle(int width, int h) {
        char ch = 'a';
        int repeatCh = 1;   // сколько раз надо повторять каждый символ
        int printedCh = 0;  // сколько напечатали текущий символ
        for (int r = 0; r < h; r++) {
            for (int c = 0; c < h - r; c++) {
                if (printedCh == repeatCh) {  // если текущий символ повторили необходимое кол-во раз
                    if (ch == 'b') {            // если до этого повторяли символ 'с'
                        ch = 'a';    // следующий символ - 'a'
                        repeatCh++;  // увеличиваем кол-во повторений каждого символа
                    } else {
                        ch++;
                    }
                    printedCh = 0;   // сбрасывам кол-во напечатанных символов (след. символ пока ниразу не напечатан)
                }
                System.out.print(ch);
                printedCh++;
            }
            System.out.println();
        }
    };

}
