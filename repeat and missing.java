
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> a=new ArrayList<>();
        int[] c=new int[arr.length+1];
        for(int i:arr){
            c[i]+=1;
        }
        for(int i=1;i<=arr.length;i++){
            if(c[i]>1){
                a.add(i);
            }
        }
        for(int i=1;i<=arr.length;i++){
            if(c[i]==0){
                a.add(i);
            }
        }
        return a;
        
    }
}