package Practise_Problems;

public class MoveAllZeroATEnd {

    public static void main(String[] args) {


        int [] a={1,0,2,0,-1,0};
        int temp=0;
        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i]==0 && a[j]!=0){
                    a[i]=a[j];
                    a[j]=0;
                }

            }
        }

        for(int v:a){
            System.out.println(v);
        }
    }

}
