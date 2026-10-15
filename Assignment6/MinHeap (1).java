import java.time.chrono.IsoChronology;

class MinHeap{
    private int SIZE;
    private int arr[];

    public MinHeap(int length){
        SIZE = 0;
        arr = new int[length + 1];
    }

    public boolean isEmpty(){
        return SIZE == 0;
    }

    public boolean isFull(){
        return SIZE == arr.length-1;
    }

    public void addHeap(int value){
        if(isFull()){
            return;
        }
        SIZE++;
        arr[SIZE] = value;
        int ci = SIZE;
        int pi = ci/2;

        while(pi >= 1){
            if(arr[ci] < arr[pi]){
                int temp = arr[ci];
                arr[ci] = arr[pi];
                arr[pi] = temp;
                ci = pi;
                pi = ci/2;
            }else {
                break;
            }
        }

    }
    public int deleteHeap(){
        if(isEmpty()){
            return -1;
        }
        int max = arr[1];
        arr[1] = arr[SIZE];
        
        int pi = 1;
        int ci = pi*2;
        SIZE--;

        while(ci <= SIZE){
            if( (ci + 1) <= SIZE && arr[ci+1] < arr[ci]){
                ci = ci+1;
            }
            if(arr[pi] <= arr[ci]){
                break;
            }

            int temp = arr[ci];
            arr[ci] = arr[pi];
            arr[pi] = temp;
            pi = ci;
            ci = pi*2;
        }
        
        return max;

    }
}