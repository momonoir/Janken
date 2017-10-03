public class Janken02 {
  public static void main(String[] args) {
    int cpu; //cpuの選択
    int youWin = 0; //プレイヤーの勝ち点
    int cpuWin = 0; //cpuの勝ち点
    String result = "あいこ"; //初期値

    //ゲームの開始
    System.out.println("じゃんけんゲーム");
    System.out.println("3本先取です");

    //勝敗判定
    while (youWin < 3 && cpuWin < 3) { //どちらかが3点取るまで
      cpu = new java.util.Random().nextInt(3) +1; //cpuが何を出すか乱数で決定
      System.out.println("数字を入力してください");
      System.out.print("1:グー  2:チョキ  3:パー \n");
      //キーボードから入力を受け付ける
      int you = new java.util.Scanner(System.in).nextInt();

      //cpuが出した手で勝敗を判定
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

      //勝ったほうに1点加算
      if (result.equals("あなたの勝ち")) {
        youWin++;
      } else if (result.equals("相手の勝ち")) {
        cpuWin++;
      }

      //結果と現在の点数を表示
      System.out.println(result);
      System.out.println("現在の点数");
      System.out.println("あなた：" + youWin + "  " + "相手：" + cpuWin);
    }

    //ゲームの終了
    System.out.println("\n勝負あり！！");
    System.out.println(youWin + " 対 " + cpuWin + " で " + result + "です");
  }
}

//何を出すか選ぶ
//cpuの選択は乱数で出す
//応用で3本先取とかもできそう
