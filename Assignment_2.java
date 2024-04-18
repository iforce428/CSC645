import java.util.ArrayList;

class Assignment_2 {
    public static void main(String[] args) {
        System.out.println(gcd(60, 24));
    }

    public static int gcd (int m, int n){
        ArrayList<Integer> _m = pf(m);
        ArrayList<Integer> _n = pf(n);


        ArrayList<Integer> commonFactors = new ArrayList<>();
        int i = 0, j = 0;
        while (i < _m.size() && j < _n.size()) {
            if (_m.get(i).equals(_n.get(j))) {
                commonFactors.add(_m.get(i));
                i++;
                j++;
            } else if (_m.get(i) < _n.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println(commonFactors);

        int gcd = 1;
        for (int factor : commonFactors) {
            gcd *= factor;
        }

        return gcd;
    }

    public static ArrayList<Integer> pf(int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        while (n % 2 == 0) {
            nums.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                nums.add(i);
                n /= i;
            }
        }

        if (n > 2)
            nums.add(n);

        return nums;
    }
}