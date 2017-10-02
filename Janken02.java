public class Janken02 {
  public static void main(String[] args) {
//cpuの選択を乱数で決める
    int cpu = new java.util.Random().nextInt(3) +1;
    int youWin = 0;
    int cpuWin = 0;

    //ゲームの開始、プレイヤーが選択するまで
    System.out.println("じゃんけんゲーム");
    System.out.println("3本先取です");

    //勝敗判定
    String result = "あいこ"; //初期値

    while (youWin < 3 && cpuWin < 3) {
      System.out.println("相手の選択の確認" + cpu);
      System.out.println("数字を入力してください");
      System.out.print("1:グー  2:チョキ  3:パー \n");
      //キーボードから入力を受け付ける
      int you = new java.util.Scanner(System.in).nextInt();
      //１：グー、２：チョキ、３：パー
      if (cpu != you) { //あいこでないなら
        switch (cpu) {
          case 1: //pcがグー
            System.out.println("相手：グー");
            if (you == 2) {
              result = "相手の勝ち";
              cpuWin++;
              } else if (you == 3) {
                result = "あなたの勝ち";
                youWin++;
              }
              break;

          case 2: //pcがチョキ
            System.out.println("相手：チョキ");
            if (you == 3) {
              result = "相手の勝ち";
              cpuWin++;
              } else if (you == 1) {
              result = "あなたの勝ち";
              youWin++;
              }
              break;

          case 3:
            System.out.println("相手：パー");
            if (you == 1) {
              result = "相手の勝ち";
              cpuWin++;
              } else if (you == 2) {
              result = "あなたの勝ち";
              youWin++;
              }
              break;
            }
          }
      System.out.println(result);
      System.out.println("現在の点数");
      System.out.println("あなた：" + youWin + "-" + "相手：" + cpuWin);
    }
  }
}

//何を出すか選ぶ
//cpuの選択は乱数で出す
//応用で3本先取とかもできそう
