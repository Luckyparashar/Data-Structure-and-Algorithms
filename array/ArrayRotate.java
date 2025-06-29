



public class ArrayRotate {

    public static void main(String[] args) {
        int[] arr={15,17,11,13,20};

int k=3;
secondReverse(k, arr);

    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }

    static void secondReverse(int n,int arr[]){

while(n>0){
int temp=arr[arr.length-1];
for(int i=arr.length-1;i>0;i--){
    arr[i]=arr[i-1];
}
arr[0]=temp;
n--;
// System.out.println(Arrays.toString(arr));
    }
}
}