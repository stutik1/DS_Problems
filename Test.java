public class Test {
    //s1 and s2 string
    //s1=abcdmbcadm
    //s2=bcm
    //s1=abcdmbcadmmcb
    //minimum length of substring of s1 contains s2
    //s1 => O(n^2)
    //O(n^2)
    //O(n)
    //s2 ->h2 with freq ->key char value frq
    //abcdmbcadm
    //|
    //s,e
    //while(e<s1.size()){
    //if(h2.contains(s1.charAt(e))){
    // updateFeq h2 a-1
    //
    //
    //
    // }
    //end++;
    // if(h2.size()==0){
    // updateMin()
    // updateStart()
    // }
    //updateStart(){
    // while(!h2_ori.contains(s1.charAt(s))){
     //   start++;
    //   h2.put(chr,frq);
    // }
    //







    //arr[]={-1,4,3,4,4,0,0}
    //arr[]={-1,3,3,4,4,0,0}
    //end=N-1
    //cur=N-1
    public static void main(String[] arg){
        getNonNegative();
    }
    static void getNonNegative(){

        int[] a={-1,4,0,4,4,0,0,8,9};

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
        System.out.println(" ");
        int cur=a.length-1;
        int end=a.length-1;

        while(cur>=0 && end>=0){
         if(a[cur]==0){
             swap(a,cur,end);
             end--;
        }else{
             cur--;
         }
        }
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+", ");
        }
    }
    static void swap(int [] a ,int cur,int end){
     int temp=a[cur];
     a[cur]=a[end];
     a[end]=temp;
    }
}
