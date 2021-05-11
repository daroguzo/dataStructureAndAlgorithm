package algorithm.ETC;

import java.util.Arrays;

public class k2 {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        Arrays.fill(answer, 1);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                char[] arr = places[i][j].toCharArray();
                char[] arr2 = new char[5];
                char[] arr3 = new char[5];
                if (j != 4) {
                    arr2 = places[i][j+1].toCharArray();
                }
                if (j != 3 && j!=4) {
                    arr3 = places[i][j+2].toCharArray();
                }
                for (int k = 0; k < 4; k++) {
                    if (arr[k] == 'P') {
                        if (arr[k+1] == 'P') {
                            answer[i] = 0;
                            break;
                        } else if (arr2[k] == 'P') {
                            answer[i] = 0;
                            break;
                        } else if (arr2[k+1] == 'P') {
                            if (arr[k+1] != 'X' && arr2[k] != 'X') {
                                answer[i] = 0;
                                break;
                            }
                        }
                    } else if (arr[k+1] == 'P' && arr2[k] == 'P') {
                        if (arr[k] != 'X' || arr2[k+1] != 'X') {
                            answer[i] = 0;
                            break;
                        }
                    } else if (arr[1] == 'P' && arr2[1] == 'P') {
                        answer[i] = 0;
                        break;
                    }
                }
                for (int k = 0; k < 3; k++) {
                    if (arr[k] == 'P') {
                        if (arr[k+2] == 'P' && arr[k+1] != 'X') {
                            answer[i] = 0;
                            break;
                        } else if (arr3[k] == 'P' && arr2[k] != 'X') {
                            answer[i] = 0;
                            break;
                        }
                    } else if (arr[k+2] == 'P' && arr3[k+2] == 'P' && arr2[k+2] != 'X') {
                        answer[i] = 0;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[][] arr = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPXX", "OXXXP", "POOXX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        System.out.println(new k2().solution(arr));
    }
}
