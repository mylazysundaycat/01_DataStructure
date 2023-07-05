public class DoubleHashing<K, V> {
    private int N=0, M=13; //테이블 크기
    private K[] a=(K[]) new Object[M]; //해시 테이블
    private V[] dt=(V[]) new Object[M]; //key관련 데이터 저장
    private int hash(K key){ //해시 코드
        return (key.hashCode() & 0x7fffffff) % M; //나눗셈 함수
    }

    private void put(K key, V data){
        int initialpos=hash(key);
        int i=initialpos, loop_limit=20;
        int j=1;
        int d=(7-(int)key % 7);
        do{
            if(a[i]==null){
                a[i]=key;
                dt[i]=data; N++;
                return;
            }
            if(a[i].equals(key)){
                dt[i]=data;
                return;
            }
            i=(initialpos + j * d) % M;
            j++;
            loop_limit -= 1;
        } while(loop_limit > 0);
    }

    public V get(K key){
        int initialpos = hash(key);
        int i = initialpos, loop_limit = 20;
        int j = 1;
        int d = (7-(int)key % 7);
        while(a[i] != null & loop_limit > 0){
            if(a[i].equals(key)) return dt[i];
            i=(initialpos + j*d) %M;
            j++;
            loop_limit -= 1;
        }
        return null;
        //권예지 사랑해




    }
}
