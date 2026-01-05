package ch08_classes;

public class Constructor {
        /*
        생성자 (Constructor)
        생성자는 객체가 생성될 댸 호출되는 특별한 메서드
        객체 생성 예시
        클래스명 객체명 - new 크래스명();
        ClassExample example = new ClassExample();
        : 사실 ClassExample()가 생성자에 해당됩니다.
        특징 :
        1. 크래스의 이름과 생성자의 이름은 동일하다
        (다른 메서드들과 달리 pascal Case로 작성되죠.
        그리고 아까 수업에서 들었따면 method는 동살로  시작되는데,
        얘는 클래스 이름이랑 똑같으니까 명사겠네요)
        2. return 값이 없다 -> call1() call2() 유형으로 생각할 수 있음
        3 객체 초기화 : 생성자는 객체의 필드 초기화를 담당한다

        생성자 정의 방식 :
        1. 기본 생성자 : 매개변수가 없는 생성자
         (근데 얘는 클래스를 만들 댸 default로 생성되기 떄문에 정의하지 않아도 될 떄가 있습니다 저희가 car()어쩌고 메서드를 만들지 않았죠
         즉 , default로 생성된 기본 생성자를 이용하여 객체를 생성했습니다
         2.매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자
         지시사항
         String title을 매개변수로 하는 생성자를 정의하고
         requiredArgsConstructor(String  매개변수를 필수로 요구하는 생성자) 라는 안내문을
         출력할 수 있도록 작성한 뒤
         ConstructorMain으로 가서 constructor4라는 객체명을 지니고, title 에 김사 으로
         이름 붙이고 객체를 생성한 후,
         System.out.println(contructor4.name);을 입력하여 콘솔에 김사를 출력하시오

         int num String name 을 매개변수로 하는 생성자를 정으히고
         AllargsConstructor(int.String 전부를 매개변수로 요구하는 생성자) 라는 안내문을
         출력할 수 있도록 작성한뒤
         ConstructorMain으로 가서 contructor5라는 객체명을 지니고 5 김오 라고
         값을 대입한 객체를 생성한 후
         sout(constructor5.num)
         sout(constructor5.name);*/
        int num;
       String name;


       Constructor() {
        System.out.println("기본생성자를 통해 객체가 생성되었습니다.");
        System.out.println("NoArgsConstructor");
    };

    Constructor(int number) {
        System.out.println("int 매개변수를 필수로 요구하는 매개변수 생성자로 객체를 생성");
        System.out.println("RequiredArgsConstructor");
        this.num = number; // argument로 받은 int 자료형의 데이터를 이 클래스의 필드인

    };

    // 매개변수 생성자 # 2
    Constructor(String title) { // 추후에는 매개변수명과 속성명을 일치시킬겁니다.
        this.name = title;
        System.out.println("String 매개변수를 필수로 요구하는 매개변수 생성자로 객체를 생성");
        System.out.println("RequiredArgsConstructor");
    }

    // 매개변수 생성자 # 3
    Constructor(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("모든 필드를 필수로 요구하는 매개변수 생성자");
        System.out.println("AllArgsConstructor");
    }

    Constructor(String name, int num) {
        this.num = num;
        this.name = name;
        System.out.println("모든 필드를 필수로 요구하는 매개변수 생성자");
        System.out.println("AllArgsConstructor");
    }
    void displayInfo() {
        System.out.println("이 객체의 num 값 : " + num);
        System.out.println("이 객체의 name 값 : " + name);
    }
}
