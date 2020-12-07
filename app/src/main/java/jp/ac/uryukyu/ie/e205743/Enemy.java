package jp.ac.uryukyu.ie.e205743;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{
    /**
     * このオブジェクトに格納されたデータのうち、hitPointを返す。
     * @return　this.hitpoint　このオブジェクトのデータにある敵の体力
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
    /**
     * このオブジェクトに格納されたデータのうち、attackを返す。
     * @return　this.attack　このオブジェクトのデータにある敵の攻撃力
     */
    public int getAttack(){
        return this.attack;
    }
    /**
     * このオブジェクトに格納されたデータのうち、deadを返す。
     * @return　this.dead　このオブジェクトのデータにある敵の生死の判定
     */
    public boolean getDead(){
        return this.dead;
    }
    /**
     * このオブジェクトに格納されたデータのうち、nameを変更する
     * @param newName 変更する名前
     */
    public void setName(String newName){
        String oldName = this.name;
        this.name = newName;
        System.out.println(oldName + "を" + this.name + "に変更しました。");
    }
    /**
     * このオブジェクトに格納されたデータのうち、hitPointを変更する
     * @param newHitPoint 変更する体力
     */
    public void setHitPoint(int newHitPoint){
        this.hitPoint = newHitPoint;
    }
    /**
     * このオブジェクトに格納されたデータのうち、attackを変更する
     * @param newAttack 変更する攻撃力
     */
    public void setAttack(int newAttack){
        this.attack = newAttack;
    }
    /**
     * このオブジェクトに格納されたデータのうち、deadを変更する
     * @param newDead 変更するこのオブジェクトの生死判定
     */
    public void setDead(boolean newDead){
        this.dead = newDead;
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint <= 0 ) {
            this.dead = true;
            System.out.printf("モンスター%sは倒れた。\n", this.name);
        }
    }


}