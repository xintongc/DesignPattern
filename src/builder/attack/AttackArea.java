package builder.attack;

public class AttackArea {

    private Location location;
    private boolean attack;
    private boolean heal;
    private int up;
    private int down;
    private int left;
    private int right;
    private int upLeft;
    private int downLeft;
    private int upright;
    private int downright;
    private int range;

    public AttackArea() {
        this.location = location;
        this.attack = attack;
        this.heal = heal;
        this.up = 0;
        this.down = 0;
        this.left = 0;
        this.right = 0;
        this.upLeft = 0;
        this.downLeft = 0;
        this.upright = 0;
        this.downright = 0;
        this.range = 0;
    }

    public static AttackAreaBuilder builder(){
        return new AttackAreaBuilder();
    }

    @Override
    public String toString() {
        return "AttackArea{" +
                "location=" + location +
                ", attack=" + attack +
                ", heal=" + heal +
                ", up=" + up +
                ", down=" + down +
                ", left=" + left +
                ", right=" + right +
                ", upLeft=" + upLeft +
                ", downLeft=" + downLeft +
                ", upright=" + upright +
                ", downright=" + downright +
                '}';
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isAttack() {
        return attack;
    }

    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    public boolean isHeal() {
        return heal;
    }

    public void setHeal(boolean heal) {
        this.heal = heal;
    }

    public int getUp() {
        return up;
    }

    public void setUp(int up) {
        this.up = up;
    }

    public int getDown() {
        return down;
    }

    public void setDown(int down) {
        this.down = down;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getUpLeft() {
        return upLeft;
    }

    public void setUpLeft(int upLeft) {
        this.upLeft = upLeft;
    }

    public int getDownLeft() {
        return downLeft;
    }

    public void setDownLeft(int downLeft) {
        this.downLeft = downLeft;
    }

    public int getUpright() {
        return upright;
    }

    public void setUpright(int upright) {
        this.upright = upright;
    }

    public int getDownright() {
        return downright;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setDownright(int downright) {
        this.downright = downright;

    }
}
