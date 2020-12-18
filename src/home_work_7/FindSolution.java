package home_work_7;

public class FindSolution {
    public static void main(String[] args) {
        int target = 16;
        System.out.println(findSolution(target));
    }

    public static String findSolution(int target) {
        return find(target,1, "1");
    }

    private static String find(int target, int start, String history) {
        if (start == target)
            return history;
        else if (start > target)
            return null;
        else {
            return find(target, start + 5, "(" + history + " + 5)");
        }
    }

}
