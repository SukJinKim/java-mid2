package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
//        System.out.println("동물 이름 : " + animal.getName());
//        System.out.println("동물 크기 : " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T other) {
//        return animal.getSize() > other.getSize() ? animal : other;
        return null;
    }
}
