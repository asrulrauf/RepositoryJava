public class Perulangan {

    public static void main(String[] args) {

//        int[][] testInt= {
//                {2,3},
//                {5}
//        };
//        for(testInt[0][1] = 3; testInt[0][1] <= 10; testInt[0][1]++){
//            System.out.println("Test Loopong " + testInt[0][1]);
//        }

        int nilai = 1;

        while(nilai < 10){

//            System.out.println("nilai " + nilai);
            nilai++;

            if(nilai % 2 == 1){
                break;
            }
            System.out.println("nilai baru " + nilai);
        }

        for(var counter = 1 ;counter <= 10; counter++){
            System.out.println("Perulangan " + counter);
        }

        String[] arrayString = {
                "Asrul","Rauf","Ode"
        };


        for(int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }

        for (var arraySString2 : arrayString) {
            System.out.println(arraySString2);
        }

        String[][] timApi = {
                {"Asrul","Dina","Geri"},
                {"Adit","Akmal","Sulis"}
        };

        for (String[] timApis : timApi) {
                System.out.println(timApis[0] + timApis[1] + timApis[2]);
        }

        for(int i = 0; i < timApi.length; i++){
            for (int j = 0; j < timApi[i].length; j++){
                System.out.println(timApi[i][j] + "\t");
            }
            System.out.println();
        }

        int[] nilaiKu = {
                90,80,70,60
        };

        int total = 0;

        for (var nilaiTmp : nilaiKu
             ) {
            System.out.println(nilaiTmp);
            total+=nilaiTmp;
            System.out.println(total);
        }

    }
}
