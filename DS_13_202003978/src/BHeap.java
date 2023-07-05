public class BHeap<Key extends Comparable<Key>, Value> {
    private Entry[] a;
    private int N;
    public BHeap(Entry[] harray, int initialSize) {
        a=harray;
        N=initialSize;
    }
    public int size(){return N;}
    private boolean greater(int i, int j){
        return a[i].getKey().compareTo(a[j].getKey())>0;
    }
    private void swap(int i, int j){
        Entry temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void insert(Key newKey, Value newValue){
        Entry temp=new Entry(newKey, newValue);
        a[++N]=temp;
        upheap(N);
    }
    private void upheap(int j){
        while(j>1 && greater(j/2, j)){
            swap(j/2, j);
            j=j/2;
        }
    }

    public Entry deleteMin(){
        Entry min=a[1];
        swap(1, N--);
        a[N+1]=null;
        downheap(1);
        return min;
    }
    private void downheap(int i){
        while(2*i<=N) {
            int k=2*i;
            if (k<N && greater(k,k+1)) k++;
            if (!greater(i,k)) break;
            swap(i,k);
            i=k;
        }
    }

    public void createHeap(){
        for(int i=N/2; i>0; i--){
            downheap(i);
        }
    }

    public void print(){

        for(int i=1; i<=N; i++){
            System.out.println("["+a[i].getKey()+" "+a[i].getValue()+"]");
        }
        System.out.println("힙 크기 = "+N);
    }
}

