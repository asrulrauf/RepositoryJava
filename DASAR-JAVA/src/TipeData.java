public class TipeData {

    public static void main(String[] args) {

        System.out.println("=======Tipe Data Primitif======");
        //Tipe Data Integer Number
        byte thisByte = 100;
        short thisShort = 10000;
        int thisInteger = 1500000;
        long thisLong = 300000000;
        long thisLong2 = 300000000L;
        System.out.println("Ini Byte " + thisByte + ", " +
                "Ini Short " + thisShort + ", " + "Ini Integer " + thisInteger + ", " +
                "Ini Long " + thisLong + ", " + "Ini long tipe 2" + thisLong2);

        //Tipe data Floating Point Number
        float thisFloat = 105.20F;
        double thisDouble = 200.45;
        System.out.println("Ini float " + thisFloat + ", " + "Ini Double " + thisDouble);

        //Literals
        int desimalInt = 45;
        int hexInt = 0xFFFF;
        int binInt = 0b0101011;
        System.out.println("Ini desimal " + desimalInt + ", " + "Ini hexa "
                + hexInt + ", " + "binery " + binInt);

        //Underscore
        long balance = 1_000_000;
        int amount = 600_000_000;
        System.out.println("Balance = " + balance + "Amount = " + amount);

        //Konversi Tipe Data
        short valueIn = 20000;
        int valueOut = valueIn; //Widening Casting
        System.out.println(valueOut);

        float dataIn = 10.10F;
        double dataOut = dataIn + 666000.30F; //Widening Casting
        System.out.println(dataOut);

        int dataIn2 = 4000;
        short dataOut2 = (short) dataIn2; //Narrowing Casting
        System.out.println(dataOut2);

        //Tipe Data Character
        char charA = 'A';
        char charB = 'S';
        char charC = 'R';
        char charD = 'U';
        char charE = 'L';
        System.out.println(charA + "" + charB + "" + charC + "" + charD + "" + charE);

        //Tipe Data String
        String firstName = "Asrul";
        String lastName = "Rauf";
        final String fullName = firstName + " " + lastName; //Valuenya tidak bisa diubah
        System.out.println("My name is " + fullName);
    }
}
