public class Tap {
    public static void main(String[] args){

    }
}

abstract class Multimedia implements Shareable{
    String title;
    int year;

    abstract void play();

    abstract public void share(String platform);
}

class Music extends Multimedia{
    @Override
    void play(){
        System.out.println("Воиспроизвилась музыка");
    }
    @Override
    public void share(String platform){
        System.out.println("Вы поделились сообщением");
    }
}

class Video extends Multimedia{
    @Override
    void play(){
        System.out.println("Воиспроизвилось видео");
    }
    @Override
    public void share(String platform){
        System.out.println("Вы поделились сообщением");
    }
}

interface Shareable{
   void share(String platform);
}
