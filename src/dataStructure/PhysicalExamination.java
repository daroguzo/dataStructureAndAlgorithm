package dataStructure;

import java.util.Scanner;

public class PhysicalExamination {
    static final int VMAX = 21;

    static class PhyscData{
        String name;
        int height;
        double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값 구하기
    static double aveHeight(PhyscData[] dat){
        double sum = 0;

        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }
        return sum/dat.length;
    }

    static void distVision(PhyscData[] dat, int[] dist){
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision * 10)]++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("김진우", 184, 1.2),
                new PhyscData("기영민", 180, 1.0),
                new PhyscData("임현수", 184, 1.0),
                new PhyscData("김재환", 173, 0.3),
                new PhyscData("양성현", 174, 1.3),
                new PhyscData("박상훈", 173, 1.4)
        };
        int[] vdist = new int[VMAX];    // 시력 분포

        System.out.println(" 신체 검사 리스트 ");
        System.out.println("이름      키   시력");
        System.out.println("--------------------");
        for (int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

        System.out.printf("\n 평균 키: %5fcm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("\n 시력 분포");

        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~: %2d명\n", i/10.0, vdist[i]);
        }
    }

}
