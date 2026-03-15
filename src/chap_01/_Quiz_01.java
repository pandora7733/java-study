package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 번호 (1234, 상암08)
        // 남은 시간 (3분, 5분)
        // 남은 거리 (1.5km, 0.8km)

        String bus_num_1 = "상암08";
        String bus_num_2 = "1234";

        int time1 = 3;
        int time2 = 5;

        float distance1 = 1.5F;
        float distance2 = 0.8F;

        System.out.println(bus_num_1 + "번 버스");
        System.out.println("약 "+time1+"분 후 도착");
        System.out.println("남은 거리 "+distance1+"km");
    }
}
