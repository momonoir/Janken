public class Janken {
  public static void main(String[] args) {
//cpuの選択を乱数で決める
    int cpu = new java.util.Random().nextInt(3) +1;

    //ゲームの開始、プレイヤーが選択するまで
    System.out.println("じゃんけんゲーム");
    System.out.println("数字を入力してください");
    System.out.print("1:グー \n 2:チョキ \n 3:パー");
    //キーボードから入力を受け付ける
    int you = new java.util.Scanner(System.in).nextInt();

    //勝敗判定
    String result = "あいこ"; //初期値

    //１：グー、２：チョキ、３：パー
    if (cpu != you) { //あいこでないなら
      switch (cpu) {
        case 1: //pcがグー
          System.out.println("相手：グー");
          if (you == 2) {
            result = "相手の勝ち";
          } else if (you == 3) {
            result = "あなたの勝ち";
          }
          break;

        case 2: //pcがチョキ
          System.out.println("相手：チョキ");
          if (you == 3) {
            result = "相手の勝ち";
          } else if (you == 1) {
            result = "あなたの勝ち";
          }
          break;

        case 3:
          System.out.println("相手：パー");
          if (you == 1) {
            result = "相手の勝ち";
          } else if (you == 2) {
            result = "あなたの勝ち";
          }
          break;
      }
    }
    System.out.println(result);
  }
}

//何を出すか選ぶ
//cpuの選択は乱数で出す
//応用で3本先取とかもできそう
