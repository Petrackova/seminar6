package seminar6;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**1. Продумайте структуру класса Кот.
 *  Какие поля и методы будут актуальны для приложения, которое является
 а) информационной системой ветеринарной клиники
 Можно записать в текстовом виде, не обязательно реализовывать в java.**/
public class Cat {
    String name;
    Gender gender;
    float weight;
    Breed breed;
    List<Graft> vaccinated;
    Owner owner;
    LocalDate birthday;

    public Cat(String name, Gender gender, Float weight, Breed breed, List<Graft> vaccinated, Owner owner, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.breed = breed;
        this.vaccinated = vaccinated;
        this.owner = owner;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public float getWeight() {
        return weight;
    }

    public Breed getBreed() {
        return breed;
    }

    public List<Graft> getVaccinated() {
        return vaccinated;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setVaccinated(List<Graft> vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                ", breed=" + breed +
                ", vaccinated=" + vaccinated +
                ", owner=" + owner +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) &&
                gender == cat.gender &&
                weight == cat.weight &&
                breed == cat.breed &&
                Objects.equals(birthday, cat.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, weight, breed, birthday);
    }
}
