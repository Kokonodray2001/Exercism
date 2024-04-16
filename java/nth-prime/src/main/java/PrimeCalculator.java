class PrimeCalculator {

    int nth(int nth) {
        if(nth == 0) throw new IllegalArgumentException();
        int nthPrime =0;
        int num =2;
        while(nth != 0 ){
            if(isPrime(num)){
                nth--;
                nthPrime = num;
            }
            num++;
        }
        return nthPrime;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i*i <=num ; i++) {
            if(num % i ==0) return false;
        }
        return true;
    }

}
