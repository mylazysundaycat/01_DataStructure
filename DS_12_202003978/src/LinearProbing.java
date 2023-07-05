
public class LinearProbing<K, V> {
    private int M=13; //테이블 크기
    private K[] a=(K[]) new Object[M]; //해시 테이블
    private V[] d=(V[]) new Object[M]; //key관련 데이터 저장
    private int hash(K key){ //해시 코드
        return (key.hashCode() & 0x7fffffff) % M; //나눗셈 함수
    }
    private void put(K key, V data){ //삽인 연산
        int initialpos=hash(key); //초기 위치
        int i=initialpos, j=1;
        do{
            if(a[i]==null){ //삽입 위치 발견
                a[i]=key;
                d[i]=data;
                return;
            }
            if(a[i].equals(key)){ //이미 key가 존재
                d[i]=data;
                return;
            }
            i=(initialpos + j++)%M; //다음 위치 갱신
        }while(i!=initialpos);
    }

    public V get(K key){
        int initialpos=hash(key);
        int i=initialpos, j=1;
        while(a[i]!=null){
            if(a[i].equals(key))
                return d[i];
            i=(initialpos + j++)%M;
        }
        return null;
    }
}
