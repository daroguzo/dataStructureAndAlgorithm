package dataStructure;

public class ContainsDuplicate {
    /*
    숫자로 구성된 배열이 주어졌을 때 그 배열에 중복된 숫자가 있는지 확인하는 함수를 작성하라. 중복된 숫자가 있다면 true 없다면 false.

    예) 1 2 3 4 5 6 => false
    예) 1 1 2 2 3 1 => true

     */
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.solution1(new int[] {1, 2, 3, 4, 5, 6}));
    }

    private boolean solution1(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j])
                    return true;
            }
        }
        return false;
    }
}
