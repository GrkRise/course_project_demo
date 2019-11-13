package ru.miit.classes;

        import ru.miit.interfaces.MagicAttack;

public class Demon extends Character implements MagicAttack {

    public Demon(String username, int level, Double specialPoints) {
        super(username, "Demon", level, specialPoints);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Character type is: ").append(getCharacterType()).append("\n");
        stringBuilder.append("Username is: ").append(getUsername()).append("\n");
        stringBuilder.append("Level is: ").append(getLevel()).append("\n");
        stringBuilder.append("Special points are: ").append(getSpecialPoints()).append("\n");
        return stringBuilder.toString();
    }

    @Override
    public void levelUp() {
        setLevel(getLevel() + 1);
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setConstitution(getConstitution() + 1);
        setIntelligence(getIntelligence() + 2);
        setCharisma(getCharisma() + 2);
        setWisdom(getWisdom() + 2);
        setLucky(getLucky() + 1);
    }

    @Override
    public double getMagicDamage() {
        return (double) getLevel() * ((getIntelligence() + getCharisma() + getWisdom()) * getLucky() /
                (getStrength() + getDexterity() + getConstitution()));
    }
}
