public class Generics_Demo{
    public static void main(String[] args) {
        
        String [] arr = {"Ankit","Ankita","Kaju","Amisha","Raju"};
          
          Display(arr);

    }

    public static <Kaju> void Display(Kaju[] arr){

        for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]+" ");
        }
    }
}