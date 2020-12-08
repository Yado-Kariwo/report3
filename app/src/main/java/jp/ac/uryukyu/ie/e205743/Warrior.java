package jp.ac.uryukyu.ie.e205743;

public class Warrior extends Hero{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 戦士名
     * @param maximumHP 戦士のHP
     * @param attack 戦士の攻撃力
     */
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        double d;
        d = this.attack * 1.5;
        int damage = (int)d;
        if(this.hitPoint > 0){
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", this.name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
