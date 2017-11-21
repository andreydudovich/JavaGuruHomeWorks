package lv.javaguru.homework.Hash;

public class Human {
    private String personCode;
    private String name;

    public Human(String personCode, String name) {
        this.personCode = personCode;
        this.name = name;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        return personCode != null ? personCode.equals(human.personCode) : human.personCode == null;
    }

    @Override
    public int hashCode() {
        return personCode != null ? personCode.hashCode() : 0;
    }
}
