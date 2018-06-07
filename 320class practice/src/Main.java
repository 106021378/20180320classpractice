import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List ls = new List();
        ls.content();
        Attributes data[] = new Attributes[5];
        data[0] = new Attributes("colin", "男生", "資工系", 70, 80, 100);
        data[1] = new Attributes("pupu", "男生", "視光系", 46, 58, 66);
        data[2] = new Attributes("jack", "男生", "聽語系", 77, 88, 99);
        data[3] = new Attributes("connie", "女生", "職治系", 66, 77, 88);
        data[4] = new Attributes("betty", "女生", "護理系", 22, 33, 44);
        for (int i = 0; i < 5; i++) {
            data[i].getName();
        }
        boolean flag = true;
        while (flag) {
            Scanner sca = new Scanner(System.in);
            int n = sca.nextInt();
            switch (n) {
                case 1:
                    data[0].showinof();
                    data[1].showinof();
                    data[2].showinof();
                    data[3].showinof();
                    data[4].showinof();
                    break;
                case 2:
                    String m = sca.next();
                    switch (m) {
                        case "colin":
                            data[0].body();
                            data[0].average();
                            break;
                        case "pupu":
                            data[1].body();
                            data[1].average();
                        case "jack":
                            data[2].body();
                            data[2].average();
                        case "connie":
                            data[3].body();
                            data[3].average();
                        case "betty":
                            data[4].body();
                            data[4].average();
                            break;
                    }
                case 3:
                    System.out.println("1.國文");
                    System.out.println("2.數學");
                    System.out.println("3.英文");
                    int a = sca.nextInt();
                    int sum = 0;
                    switch (a) {
                        case 1:
                            for (int i = 0; i < 5; i++) {
                                sum += data[i].getChinese();
                            }
                            sum /= 5;
                            System.out.println(sum);
                            sum = 0;
                            break;
                        case 2:

                            for (int i = 0; i < 5; i++) {

                                sum += data[i].getMath();

                            }

                            sum /= 5;

                            System.out.println(sum);

                            sum = 0;

                            break;
                        case 3:

                            for (int i = 0; i < 5; i++) {

                                sum += data[i].getEnglish();

                            }

                            sum /= 5;

                            System.out.println(sum);

                            sum = 0;

                            break;
                    }
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}
