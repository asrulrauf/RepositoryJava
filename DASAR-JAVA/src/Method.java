public class Method {

    public static void main(String[] args) {
        sayHelloWord();
        names("asrul", "rauf");
        names("Dina", "Geri");

        System.out.println(hitung(300,100,"+"));
        System.out.println(hitung(300,100,"-"));
        System.out.println(hitung(300,100,"*"));
        System.out.println(hitung(300,100,"/"));

        int[] values = {
                80, 90, 70, 65
        };
        hasilStudi("asrul", values);

        hasilStudi2("asrul", 90,70,80,75);

        room();
        room("Brother Office", "Informatika 13");

        System.out.println(faktorial(5));
        System.out.println(1*2*3*4*5);
        System.out.println(faktorialRekursif(5));

        region( "Yogyakarta");



    }

    //Method Void tanpa return
    static void sayHelloWord(){
        System.out.println("Hello World");
    }

    //Method Parameter
    static void names(String firstname, String lastname){
        System.out.println("firsname " + firstname + " lastname " + lastname);
        System.out.println("firsname " + firstname);
        System.out.println("lastname " + lastname);
    }

    //Method dengan return
    static int hitung(int value1, int value2, String operasi){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            default:
                return 0;
        }
    }

    //Tanpa Variable Argument
    static void hasilStudi(String name, int[] values){

        int total = 0;
        for (var value : values) {
            total+= value;
        }

        int nilaiAkhir = total / values.length;
        if(nilaiAkhir >= 75){
            System.out.println("Selamat " + name + " ada lulus");
        }else{
            System.out.println("Maaf " + name + " anda gagal");
        }
    }

    //Dengan Variable Argument
    static void hasilStudi2(String name, int... values){

        int total = 0;
        for (var value : values) {
            total+= value;
        }

        int nilaiAkhir = total / values.length;
        if(nilaiAkhir >= 75){
            System.out.println("Selamat " + name + " ada lulus");
        }else{
            System.out.println("Maaf " + name + " anda gagal");
        }
    }

    //Method Overloading
    static void room(){
        System.out.println("Alumni informatika");
    }

    static void room(String room1, String room2){
        System.out.println(room1 + " " + room2);
    }

    //tanpa fakctorial rekursif
    static int faktorial(int value){
        int total = 1;
        for(var counter = 1; counter <= value; counter++){
            total *= counter;
        }
        return total;
    }

    static int faktorialRekursif(int value){
        int result = 1;
        if(value == 1){
            return 1;
        }else{
            return value * faktorialRekursif(value -1);
        }
    }

    static void region(String nmRegion){

        if(nmRegion == "Buton"){
            System.out.println("Ini Buton");
        }else{
            System.out.println("Bukan Buton");
        }
    }


}
