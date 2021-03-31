public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        //Tipe data bukan primitif Integer
        Integer data1 = null; //Boleh null value
        data1 = 20;
        System.out.println(data1);

        //Konversi tipe data primitif ke tipe data bukan primitif
        double doubleIn = 430.00;
        Double doubleOut = doubleIn;
        System.out.println(doubleOut);

        //Konversi tipe data bukan primitif ke tipe data primitif
        int doubleOutNew = doubleOut.intValue();
        System.out.println(doubleOutNew);
        System.out.println(((float) doubleOutNew));
    }
}
