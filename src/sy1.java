import java.util.*;

public class sy1 {

    Random random = new Random();
    String[] s1 = new String[10];
    int[] op1 = new int[50];
    int[] operator = new int[50];
    ArrayList<Integer>[] opeaList = new ArrayList[50];
    ArrayList<Integer>[] shu = new ArrayList[50];
    HashSet<String> Arithmetic = new HashSet<>();

    void mulitiply(int n) {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < n; j++) {

                opeaList[i].add(random.nextInt(2));
            }


        }

    }

    void mulitiplyshuanshi(int n) {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < n + 1; j++) {
                shu[i].add(random.nextInt(100) + 1);
            }
        }
    }


    void Print() throws ClassCastException {
        for (int i = 0; i < 50; i++) {

            String s = opeaList[i].toString();
            s1 = s.split(",");
            int m = s.length();
            Integer[] d = (Integer[]) shu[i].toArray();
            int result = d[0];
            for (int j = 0; j < m; j++) {
                if (Objects.equals(s1[j], "0")) {
                    result -= d[j + 1];
                } else {
                    result += +d[j + 1];
                }
            }
            String jieguo = d[0] + "&";

            for (int j = 0; j < m; j++) {
                s1[j].replace("1", "+");
                s1[j].replace("0", "-");
                jieguo += s1[j] + "&" + d[j + 1] + "&";
            }
            Arithmetic.add(jieguo + result);

        }
    }

    void PrintMulAns() {
        for (String s : Arithmetic) {
            System.out.println("s");
        }
    }

    void Mix() {

        for (int i = 0; i < 50; i++) operator[i] = random.nextInt(2);
        for (int i = 0; i < 50; i++) {
            op1[i] = random.nextInt(100) + 1;
            String s = this.init(op1[i], operator[i]);
            Arithmetic.add(s);
        }
    }

    void Add() {
        for (int i = 0; i < 50; i++) operator[i] = 1;
        for (int i = 0; i < 50; i++) {
            op1[i] = random.nextInt(100) + 1;
            String s = this.init(op1[i], operator[i]);
            Arithmetic.add(s);
        }
    }

    void Sub() {
        for (int i = 0; i < 50; i++) operator[i] = 0;
        for (int i = 0; i < 50; i++) {
            op1[i] = random.nextInt(100) + 1;
            String s = this.init(op1[i], operator[i]);
            Arithmetic.add(s);
        }
    }


    String init(int p1, int operator) {
        int ans, op2;
        String operator1;
        if (operator == 0) {
            p1 = random.nextInt(100) + 1;
            ans = random.nextInt(p1) + 1;
            op2 = p1 - ans;
        } else {
            p1 = random.nextInt(100) + 1;
            ans = random.nextInt(100 - p1) + p1 + 1;
            op2 = ans - p1;
        }
        if (Arithmetic.contains(p1 + "&" + operator + "&" + op2 + "&" + ans)) {
            init(p1, operator);
        }
        if (operator == 0) {
            operator1 = "-";
        } else {
            operator1 = "+";
        }
        return p1 + "&" + operator1 + "&" + op2 + "&" + ans;
    }

    void print() {
        int count = 1;
        for (String s : Arithmetic) {
            s1 = s.split("&");
            System.out.print(s1[0] + s1[1] + s1[2] + "=   ");
            if (count % 5 == 0) System.out.print("\n");
            count++;
        }
    }

    void printAns() {
        int count = 1;
        for (String s : Arithmetic) {
            s1 = s.split("&");
            System.out.print(s1[3] + "   ");
            if (count % 5 == 0) System.out.print("\n");
            count++;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("\n--------------------------------------------------------");
            sy1 sy = new sy1();
            sy.mulitiply(2);
            sy.mulitiplyshuanshi(2);
            sy.Print();
            System.out.println("\n--------------------------------------------------------");
            sy.PrintMulAns();
        }

    }

}
