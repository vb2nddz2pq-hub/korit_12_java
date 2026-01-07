package ch13_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;

    public TvRemoteController(ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, PowerButton powerButton){
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.powerButton = powerButton;
    }
    public void onPressedPowerButton(){
        powerButton.onPressed();
    }
    /*
    onPressedChannelDownButton() 메서드와
    OnDownChannelDownButton() 메서드를 정의하시오
    정의 방식을 이상을 참조할것
    Main 에서 tvRemoteController.onPressedChannelDown();
    Main 에서 tvRemoteController.onDownChannelDown();
    메서드들을 호출하시오
    실행 예
    Tv 리모컨 객체가 생성되었습니다
    전원을 켭니다.
    채널을 한 칸 내립니다.
    채널을 계속 내립니다.

    Tv 리모컨 객체가 생성되었습니다
    전원을 켭니다
    채널을 한 칸 내립니다
    채널을 계속 내립니다
    채널을 한 칸 올립니다
    채널을 계속 올립니다
    전원을 끕니다
     */
}
