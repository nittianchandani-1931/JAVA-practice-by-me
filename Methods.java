class Computer {

    public void playMusic() {
        System.out.println("Music Playing....");
    }

    public Teststring getMeAPen(int cost) {
        if (cost >=10)
        return "Pen";
        else 
        return "Nothing";
    }
}

class Methods {
    public static void main(Teststring[] args) {
        Computer obj = new Computer();
        obj.playMusic();
      Teststring str =  obj.getMeAPen(15);
      System.out.println(str);
    }
}