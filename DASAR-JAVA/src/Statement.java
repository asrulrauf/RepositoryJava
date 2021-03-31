public class Statement {

    public static void main(String[] args) {

        String nilaiA = "Istimewa";
        String nilaiB = "Baik";
        String nilaiC = "Cukup";
        String nilaiD = "Kurang";

        int nilaiAkhir = 70;
        int totalAbsen = 7;

        //If Statement
        if(nilaiAkhir > 85 && totalAbsen > 8){
            System.out.println("Nilai anda " + nilaiA);
        }else if(nilaiAkhir == 85 && totalAbsen == 8){
            System.out.println("Nilai anda " + nilaiB);
        }else if(nilaiAkhir < 85 && nilaiAkhir > 70 && totalAbsen < 8 && totalAbsen > 6){
            System.out.println("Nilai anda " + nilaiC);
        } else{
            System.out.println("Nilai anda " + nilaiD);
        }


        //Switch Statement
        switch (nilaiAkhir){
            case 90:
                System.out.println("Istimewa");
                break;
            case 85:
                System.out.println("Baik");
                break;
            case 70:
                System.out.println("Cukup");
                break;
            case 60:
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Mungkin anda tidak ikut ujian");

        }

        //Switch lamda
        switch (nilaiAkhir){
            case 90 -> System.out.println("Istimewa");
            case 85 -> System.out.println("Baik");
            case 70 -> System.out.println("Cukup");
            case 60 -> System.out.println("Kurang");
            default -> System.out.println("Mungkin anda tidak ikut ujian");
        }


        //Switch lamda yiled
        nilaiAkhir = 90;
        String ucapan;
        switch (nilaiAkhir){
            case 90 -> ucapan = "Istimewa";
            case 85 -> ucapan = "Baik";
            case 70 -> ucapan = "Cukup";
            case 60 -> ucapan = "Kurang";
            default -> ucapan = "Mungkin anda tidak ikut ujian";
        }
        System.out.println(ucapan);

        //Switch lamda yiled versi 2
        nilaiAkhir = 70;
        ucapan = switch (nilaiAkhir){
            case 90:
                yield "Istimewa";
            case 85:
                yield "Baik";
            case 70:
                yield "Cukup";
            case 60:
                yield "Kurang";
            default:
                yield "Mungkin anda tidak ikut ujian";
        };
        System.out.println(ucapan);

        //Tanpa ternary operator pada if statament
        nilaiAkhir = 90;
        if(nilaiAkhir <= 80){
            ucapan = "Anda gagal";
        }else{
            ucapan = "Anda lulus";
        }
        System.out.println(ucapan);

        //Dengan ternary operator
        nilaiAkhir = 65;
        String ucapan1 = nilaiAkhir <= 90 ? "anda gagal" : "anda lulus";
        System.out.println(ucapan1);
    }
}
