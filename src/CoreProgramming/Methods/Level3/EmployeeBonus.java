package CoreProgramming.Methods.Level3;

class EmployeeBonus{

    public static int[][] generate(){
        int[][] a=new int[10][2];
        for(int i=0;i<10;i++){
            a[i][0]=(int)(Math.random()*90000)+10000;
            a[i][1]=(int)(Math.random()*10)+1;
        }
        return a;
    }

    public static double[][] calculate(int[][] a){
        double[][] r=new double[10][2];
        for(int i=0;i<10;i++){
            double bonus;
            if(a[i][1]>5){bonus=a[i][0]*0.05;}
            else{bonus=a[i][0]*0.02;}
            r[i][0]=a[i][0]+bonus;
            r[i][1]=bonus;
        }
        return r;
    }

    public static void main(String[] args){
        int[][] a=generate();
        double[][] r=calculate(a);
        for(int i=0;i<10;i++){
            System.out.println(a[i][0]+" "+a[i][1]+" "+r[i][0]+" "+r[i][1]);
        }
    }
}
