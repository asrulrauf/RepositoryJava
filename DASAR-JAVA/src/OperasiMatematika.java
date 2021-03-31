public class OperasiMatematika {

    public static void main(String[] args) {

        int a = 45; // Expression/Statement
        float b = 3.0F; //assignment statement

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Operasi augmented assigments

        Integer c = 100;
        Integer d = 100;
        Integer f = c + d;

        System.out.println(f += 4); //204
        System.out.println(f -= 4); //200
        System.out.println(f *= 4); //800
        System.out.println(f /= 4); //200
        System.out.println(f %= 4); //0

        //Operator unary
        Integer aa = 10;
        System.out.println(aa++); //method invocation increments statement
        System.out.println(aa--);
        System.out.println(-aa);
        System.out.println(aa);
        System.out.println(!true);

        //Operasi perbandingan

        double dd = 34.00;
        float ff = 34.00F;

        System.out.println(dd < ff);
        System.out.println(dd > ff);
        System.out.println(dd == ff);
        System.out.println(dd >= ff);
        System.out.println(dd <= ff);
        System.out.println((dd+=1) >= ff);
        System.out.println((dd+=1) != ff);

        //Operasi Boolean

        var totalNilai = 210;
        var absensi = 17;

        if(totalNilai >= 200 && absensi >= 14){
            System.out.println("Lulus");
        } else {
            System.out.println("Gagal");
        }

    }
}
