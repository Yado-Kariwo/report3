package jp.ac.uryukyu.ie.e205743;

/**
 * ヒーロークラス。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{
    /**
     * このオブジェクトに格納されたデータのうち、hitPointを返す。
     * @return　this.hitPoint　このオブジェクトのデータにあるヒーローの体力
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
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}