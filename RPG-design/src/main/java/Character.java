public abstract class Character {

    WeaponBehaviour wb;

    public Character() {
    }

    public abstract void display();

    public void performAttack() {
        wb.useWeapon();
    }

    public void setWeapon(WeaponBehaviour wb) {
        this.wb = wb;
    }

}
