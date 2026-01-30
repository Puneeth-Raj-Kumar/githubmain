class AltPrime {
    public static void main(String[] args) {
        int c = 0;
        for (int n = 2; n <= 50; n++) {
            boolean p = true;
            for (int i = 2; i < n; i++)
                if (n % i == 0) p = false;

            if (p) {
                c++;
                if (c % 2 != 0)
                    System.out.print(n + " ");
            }
        }
    }
}
