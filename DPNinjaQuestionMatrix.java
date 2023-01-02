public class take3 {

    public static void main(String[] args) {

        int[][] a = {
                { 1, 2, 5 },
                { 3, 1, 1 },
                { 3, 3, 3 }
        };


        System.out.println(funct(a.length-1,3,a));
    }
    public static int funct(int day, int last,int[][] a){
        if(day==0){

            int maxi=0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    maxi=Math.max(maxi, a[0][i]);
                }
            }

            return maxi;
        }

        int maxi=0;

        for(int i=0;i<3;i++){
            if(i!=last){
                int point=a[day][i] + funct(day-1, i, a);
                maxi=Math.max(maxi, point);
            }
        }

        return maxi;
    }


}
