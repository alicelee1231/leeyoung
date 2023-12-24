package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();


        data.isOn = true;
        System.out.println("it will start the music player");

        data.volume++;
        System.out.println("the volume of music player : " + data.volume);

        data.volume++;
        System.out.println("the volume of music player : " + data.volume);

        data.volume--;
        System.out.println("the volume of music player : " + data.volume);

        System.out.println("checking for music player");
        if(data.isOn){
            System.out.println("음악 플레이어 on :" + data.volume);
        }else {
            System.out.println("음악 플레이어 off");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }
}
