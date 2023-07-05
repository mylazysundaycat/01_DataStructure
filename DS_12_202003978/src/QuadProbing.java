public class QuadProbing<K, V> {
    private int N=0, M=13; //항목 수, 테이블 크기
    private K[] a=(K[]) new Object[M]; //해시 테이블
    private V[] d=(V[]) new Object[M]; //key관련 데이터 저장
    private int hash(K key){ //해시 코드
        return (key.hashCode() & 0x7fffffff) % M; //나눗셈 함수
    }

    private void put(K key, V data){ //삽입 연산
        int initialpos=hash(key);
        int i=initialpos, j=1, loop_limit=20;
        do{
            if(a[i]==null){
                a[i]=key;
                d[i]=data; N++;
                return;
            }
            if(a[i].equals(key)){
                d[i]=data;
            }
            i=(initialpos + j * j++)%M;
            loop_limit -= 1;
        } while(loop_limit>0);
    }

    public V get(K key){ //탐색 연산
        int initialpos=hash(key);
        int i=initialpos, j=1, loop_limit=20;
            while(a[i]!=null & loop_limit>0){
                if(a[i].equals(key)) return d[i]; //탐색 성공
                i=(initialpos + j * j++)%M;
                loop_limit -= 1;
            }
            return null; //탐색 실패
    }

}
