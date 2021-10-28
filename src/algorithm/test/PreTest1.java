package algorithm.test;

import java.util.*;

public class PreTest1 {
    public String[] solution(String[][] booked, String[][] unbooked) {
        String[] answer = {};
        List<Customer> list = new ArrayList<>();
        List<Customer> reservation = new ArrayList<>();
        Queue<Customer> sameTime  = new LinkedList<>();
        int standardTime = 0;

        for (String[] strings : booked) {
            int time = 0;
            String[] split = strings[0].split(":");
            time += Integer.parseInt(split[0]) * 60;
            time += Integer.parseInt(split[1]);
            list.add(new Customer(time, strings[1], true));
        }
        for (String[] strings : unbooked) {
            int time = 0;
            String[] split = strings[0].split(":");
            time += Integer.parseInt(split[0]) * 60;
            time += Integer.parseInt(split[1]);
            list.add(new Customer(time, strings[1], false));
        }

        list.sort((o1, o2) -> o1.time - o2.time);

        reservation.add(list.get(0));
        standardTime = list.get(0).time;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).time - standardTime <= 10) {
                if (list.get(i).isBooked) {
                    reservation.add(list.get(i));
                } else {
                    sameTime.offer(list.get(i));
                }
            } else {
                while (!sameTime.isEmpty()) {
                    reservation.add(sameTime.poll());
                }
                reservation.add(list.get(i));
                standardTime = list.get(i).time;
            }
        }
        while (!sameTime.isEmpty()) {
            reservation.add(sameTime.poll());
        }

        answer = new String[reservation.size()];
        for (int i = 0; i < reservation.size(); i++) {
            answer[i] = reservation.get(i).name;
        }

        return answer;
    }
    static class Customer {
        int time;
        String name;
        boolean isBooked;

        public Customer(int time, String name, boolean isBooked) {
            this.time = time;
            this.name = name;
            this.isBooked = isBooked;
        }
    }
}
