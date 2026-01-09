package ch16_bean;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class UserEntityLombok {
    @Getter // 여기가 클래스 레벨
    private  int username;
    @Setter // 여기가 필드 레벨
    private  int password;
    @NonNull
    private  String email;
    private  String name;


}
