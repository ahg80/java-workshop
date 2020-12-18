public class Main {
static void  result(int n){
    for(int num=0;num<= n;num++){
        if(num%3==0&&num!=0)
            System.out.print("java ");
        else
            System.out.print(num +" ");
    }
}


    public static void main(String[] args) {

    result(50);
    }
}
