void main(){
    int arr[]={10,6,4,3,2,9};
    int n=arr.length;
    for(int i=0; i<n-1; i++){
        int smallest = i;
        for(int j=i+1; j<n; j++){
            if(arr[j]<arr[smallest]){
                smallest=j;
            }
        }
        int temp = arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
    for(int str : arr){
        System.out.print(str+" ");
    }
}
