public class TipeDataArray {

    public static void main(String[] args) {

        //Cara inisialisasi pertama
        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "Asrul";
        arrayString[1] = "Rauf";
        arrayString[2] = "Ode";
        System.out.println(arrayString[0] + " " + arrayString[1] + " " + arrayString[2]);

        //Cara inisialisasi kedua
        String[] arrayString2 = new String[2];
        arrayString2[0] = "Buton";
        arrayString2[1] = "31 March 1994";
        System.out.println(arrayString2[0] + " " + arrayString2[1]);

        //Cara inisialisasi ketiga
        int[] iniInt = new int[]{
                4, 5, 6, 7, 8, 10
        };
        System.out.println(iniInt[5]);

        //Cara inisialisasi keempat
        Long[] iniLongNonPrim = {
                null, 45L, 33L, 12L
        };
        System.out.println(iniLongNonPrim[0]);
        System.out.println(iniLongNonPrim[1].floatValue());

        //Array dalam array
        String[][] myNames = {
                {"Asrul", "Rauf", "Ode"},
                {"Gateng", "Sekali"},
                {"Yeiyei"}
        };
        System.out.println(myNames[2][0]);

        String[][] apiTeam = {
                {"Asrul", "Dina", "Geri", "Banu"},
                {"Adit", "Iwenk", "Akmal", "Sulis"}
        };
        for (String[] apiTeams : apiTeam) {
            System.out.println(apiTeams[0] + " " + apiTeams[1] + " " + apiTeams[2]
                    + " " + apiTeams[3]);
        }
    }
}
