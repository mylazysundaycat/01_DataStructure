import java.util.Scanner;

public class University {
    String name;
    String location;
    String president;
    String contactnum;
    int tuition;

    University(){
        name = "충남대학교";
        location = "대전광역시 유성구 대학로99";
        president = "이진숙 총장님";
        tuition = 1680000;
        contactnum = "042-821-5114";
    }

    //this,생성자 추가1
    University(String name, String location, String president, int tuition, String contactnum){
        this.name = name;
        this.location = location;
        this.president = president;
        this.tuition = tuition;
        this.contactnum = contactnum;
    }

    //this,생성자 추가2
    University(int tuition) {
        name = "충남대학교";
        location = "대전광역시 유성구 대학로99";
        president = "이진숙 총장님";
        this.tuition = tuition;
        contactnum = "042-821-5114";
    }

    //대학교 이름 get 메소드
    public String getName() {
        return name;
    }

    //등록금 납부 메소드
    public void deposit(int money) {
        if(tuition==0) {
            System.out.println("이미 납부되었습니다. 이체가 취소됩니다.");
        }else if(tuition<money) {
            System.out.println("등록금보다 많은 금액이 납부되어 이체가 취소되었습니다. 입금액을 다시 확인해주세요.");
        } else {
            System.out.println(money+"원이 입금되었습니다.");
            tuition -= money;
            if(tuition==0) {
                System.out.println("등록금 전액이 납부되었습니다! 입학을 축하드립니다.");
            } else {
                System.out.println("현재 남은 등록금 잔액은 "+tuition+"원 입니다.");
            }
        }

    }
    
    //deposit 오버로딩
    public void deposit(String money) {
        int newMoney = Integer.parseInt(money);
        if(tuition==0) {
            System.out.println("이미 납부되었습니다. 이체가 취소됩니다.");
        }else if(tuition<newMoney) {
            System.out.println("등록금보다 많은 금액이 납부되어 이체가 취소되었습니다. 입금액을 다시 확인해주세요.");
        } else {
            System.out.println(newMoney+"원이 입금되었습니다.");
            tuition -= newMoney;
            if(tuition==0) {
                System.out.println("등록금 전액이 납부되었습니다! 입학을 축하드립니다.");
            } else {
                System.out.println("현재 남은 등록금 잔액은 "+tuition+"원 입니다.");
            }
        }

    }

    //입학자격 확인하는 기능: 등록금 전체 납부시 입학가능
    public String getQualification() {
        if(tuition==0) {
            return "등록금 전액이 납부되어, 입학이 가능합니다";
        } else {
            return "아직 납부되지 않은 등록금 잔액이 있습니다. 이체 후 다시 확인해주시길 바랍니다";
        }
    }

    public void call() throws InterruptedException {
        System.out.println(contactnum + "번으로 3초 뒤에 전화가 연결됩니다.");
        Thread.sleep(3000);
        System.out.println("필요하신 서비스 번호를 입력해주세요!");
        System.out.println("1번: 입학상담 신청");
        System.out.println("2번: 캠퍼스투어 신청");
        System.out.println("3번: 합격자 조회");
        System.out.println("0번: 기타 문의, 상담원 연결");
        menu();

    }
    
    //call 메소드 오버로딩
    public void call(String name) throws InterruptedException {
        System.out.println(contactnum + "번으로 3초 뒤에 전화가 연결됩니다.");
        Thread.sleep(3000);
        System.out.println("반갑습니다 "+name+"님!");
        System.out.println("필요하신 서비스 번호를 입력해주세요!");
        System.out.println("1번: 입학상담 신청");
        System.out.println("2번: 캠퍼스투어 신청");
        System.out.println("3번: 합격자 조회");
        System.out.println("0번: 기타 문의, 상담원 연결");
        menu();

    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do {
            x = sc.nextInt();
            if(x==0) {
                System.out.println("상담원을 연결 중입니다. 잠시만 기다려주세요");
            } else if(x==1) {
                System.out.println("입학 상담 신청 메뉴로 연결 중입니다. 잠시만 기다려주세요");
            } else if(x==2) {
                System.out.println("캠퍼스 투어 신청 메뉴로 연결 중입니다. 잠시만 기다려주세요");
            } else if(x==3) {
                System.out.println("합격자 조회 메뉴로 연결 중입니다. 잠시만 기다려주세요.");
            } else {
                System.out.println("다시 입력해주세요!");
            }
        }while(x>3||x<0);

        System.out.println("연결이 종료되었습니다......^^");
    }

}
