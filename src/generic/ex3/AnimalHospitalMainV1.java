package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("강아지1", 100);
        Cat cat = new Cat("고양이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 문제 1 : 개 병원에 고양이 전달
        dogHospital.set(cat); // 매개 변수 체크 실패 : 컴파일 에러 발생 x

        // 문제 2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("강아지2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
