package oop1;

public class MusicPlayer {
//캡슐화, 기능과 속성이 하나의 클래스에 모여있는것  -> 객체지향 프로그래밍
    int volume;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼룜 : " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼룜 : " + volume);
    }

    void showStatus(){
        System.out.println("음악 플레이어 상태 확인 :");
        if(isOn) {
            System.out.println("음악 플레이어 on :" + volume);
        }else {
            System.out.println("음악 플레이어 off :" + volume);
        }
    }
}
