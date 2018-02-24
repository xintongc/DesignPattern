package builder.attack;

public class AttackAreaBuilder {

    private AttackArea attackArea = new AttackArea();

    public AttackArea build(){
        return attackArea;
    }

    public AttackAreaBuilder circle(int value){
        attackArea.setDown(value);
        attackArea.setUp(value);
        attackArea.setLeft(value);
        attackArea.setRight(value);
        attackArea.setUpLeft(value - 1);
        attackArea.setDownLeft(value - 1);
        attackArea.setUpright(value - 1);
        attackArea.setDownright(value - 1);

        return this;
    }

    public AttackAreaBuilder cross(int value){
        attackArea.setDown(value);
        attackArea.setUp(value);
        attackArea.setLeft(value);
        attackArea.setRight(value);
        return this;
    }

    public AttackAreaBuilder oneDirection(int value, int direction){

        attackArea.setRange(value);

        if(direction == 1){
            attackArea.setUp(100);
        } else if (direction == 2){
            attackArea.setRight(100);
        } else if(direction == 3){
            attackArea.setDown(100);
        } else if (direction == 4){
            attackArea.setLeft(100);
        }

        return this;
    }

    public AttackAreaBuilder attackAllEnemy(){
        System.out.println("Attack all enemy in area");
        return this;
    }

    public AttackAreaBuilder healAllFriends(){
        System.out.println("healAllFriends");
        return this;
    }

    public AttackAreaBuilder healFriends(int value){
        System.out.println("Heal " + value + " friends");
        return this;
    }

    public AttackAreaBuilder attackFirstEnemy(){
        System.out.println("attackFirstEnemy");
        return this;
    }






}
