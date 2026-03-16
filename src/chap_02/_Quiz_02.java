package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height1 = 115;
        int height2 = 121;

        String IsHeightOk = (height1 >= 120) ? "키가 " + height1 + "cm 이므로 탑승이 가능합니다." : "키가" + height1 + "이므로 탑승이 불가능합니다";
        System.out.println(IsHeightOk);
    }
}
