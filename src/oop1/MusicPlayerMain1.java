package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {

        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("it will start the music player");

        volume++;
        System.out.println("the volume of music player : " + volume);

        volume++;
        System.out.println("the volume of music player : " + volume);

        volume--;
        System.out.println("the volume of music player : " + volume);

        System.out.println("checking for music player");
        if(isOn){
            System.out.println("음악 플레이어 on :" + volume);
        }else {
            System.out.println("음악 플레이어 off");
        }

        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }
}
