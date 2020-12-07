package jp.ac.uryukyu.ie.e205743;

/** 
 *  String name; //生物の名前
 *  int hitPoint; //生物のHP
 *  int attack; //生物の攻撃力
 *  boolean dead; //生物の生死状態。true=死亡。
 */

public class LivingThing{
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 生物名
     * @param maximumHP 生物のHP
     * @param attack 生物の攻撃力
     */
    public LivingThing (String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }
    /**
     * このオブジェクトに格納されたデータのうち、deadを返す。
     * @return　this.dead　このオブジェクトのデータにある生物の生死判定
     */
    public boolean isDead(){
        return this.dead;
    }
    /**
     * このオブジェクトに格納されたデータのうち、nameを返す。
     * @return　this.name　このオブジェクトのデータにある生物の名前
     */
    public String getName(){
        return this.name;
    }
    /**
     * 対象へ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * this.attack);
        if(this.hitPoint > 0){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        this.hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", this.name);
        }
    }

}