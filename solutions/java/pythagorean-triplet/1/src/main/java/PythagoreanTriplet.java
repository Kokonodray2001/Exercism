import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class PythagoreanTriplet {
    private int a;
    private int b;
    private int c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a =a;
        this.b =b;
        this.c = c;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }


    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        int sum ;
        int maxFactor =Integer.MAX_VALUE;
        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> list =  new ArrayList<>();

            findAllValidTriplets(list);

            return list;
        }

        private void findAllValidTriplets(List<PythagoreanTriplet> list) {
            for(int a =1 ;a <= sum/3 ;a++){
                if(a<= maxFactor)
                    for(int b = a+1; b <= sum/2 ;b ++){
                        if(b <=maxFactor) {
                            int c = sum - a - b;
                            if(c<=maxFactor)
                                if (a * a + b * b == c * c) {
                                    list.add(new PythagoreanTriplet(a, b, c));
                                }
                        }
                    }
            }
        }

    }

}