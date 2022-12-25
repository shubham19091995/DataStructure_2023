import java.util.Arrays;

public class maxHeap {

    static int size=0;

    public static void main(String[] args) {
        int[] maxHeapInputData= {5,3,17,10,84,19,6,22,9};
        int[] heap= new int[maxHeapInputData.length];


        for(int values:maxHeapInputData){
            insert(values,heap);
        }
        System.out.println(Arrays.toString(maxHeapInputData));
        System.out.println(Arrays.toString(heap));
    }

    private static void insert(int element, int[] heap) {
        
        heap[size]=element;
        int current=size;
        while(heap[current]<heap[parent(current)]){   // this greater and smaller sign denotes that heap is max and min ( If current is smaller then its min heap otherwise its max heap)  left chid =(2*pos)+1 , right chid=(2*pos)+2 , parent= (pos-1)/2

            swap(heap,current,parent(current));
            current=parent(current);
        }
        size++;


    }

    private static void swap(int[] heap, int size2, int parent) {
        int temp=heap[size2];
        heap[size2]=heap[parent];
        heap[parent]=temp;
    }

    private static int parent(int size2) {

        return (size2-1)/2;
        
    }
    
}
