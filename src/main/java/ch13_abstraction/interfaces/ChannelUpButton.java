package ch13_abstraction.interfaces;

public class ChannelUpButton extends Button{

    @Override
    public void onDown() {
        super.onDown();
    }

    @Override
    public void onPressed() {

    }

    @Override
    public String onUp() {
        return "채널을 계속" +super.onUp();
    }
}
/*
  현재까지의 작성을 고려 해보면 채널 올리는 버튼 / 내리는 버튼 / 전원 버튼이각각있습니다

 */
