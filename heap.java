import java.util.*;
public class heap{
    public void heapify(ArrayList<Integer> hT,int num){
        int size=hT.size();
        var largest=num;
        int l=2*num+1;
        int r=2*num+2;

        if(l<size&&hT.get(l)>hT.get(largest))   largest=l;
        if(r<size&&hT.get(r)>hT.get(largest))   largest=r;

        if(largest!=num){
            int temp=hT.get(num);
            hT.set(num,hT.get(largest));
            hT.set(largest,temp);

        heapify(hT, largest);

        }
    }
    public void insert(ArrayList<Integer> hT,int newNum){
        int size=hT.size();

        if(size==0){
            hT.add(newNum);
        }
        else{
            hT.add(newNum);
            for(int i=size/2-1;i>=0;i--)    heapify(hT, i);
        }
    }
    public void delete(ArrayList<Integer> hT,int num){
        int size=hT.size();
        int i;
        for(i=0;i<size;i++){
            if(num==hT.get(i))  break;
        }

        int temp=hT.get(i);
        hT.set(i, hT.get(size-1));
        hT.set(size-1,temp);

        hT.remove(size-1);
        for(int j=size/2-1;j>=0;j--)    heapify(hT, j);
        
    }
    public void printArray(ArrayList<Integer> array,int size){
        for (Integer i : array) {
            System.out.print(i+" ");
        } 
        //for(Integer i=0;i<size;i++)     System.out.println(array.get(i)+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<Integer>();
        int size=array.size();
        heap h= new heap();

        h.insert(array,2);
        h.insert(array,3);
        h.insert(array,6);
        h.insert(array,7);
        h.insert(array,1);
        h.insert(array,10);
        h.insert(array,5);


        h.printArray(array, size);

    }
}
