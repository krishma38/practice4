class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {

        int sum = 0;
        int squaredsum;

        for(int i = 1; i <= input; i ++){
            sum += i;
        }
        squaredsum = exponential(sum, 2);

        return squaredsum;
    }

    int computeSumOfSquaresTo(int input) {

        int sumSquares = 0;

        for(int i = 1; i <= input; i ++){
            sumSquares += exponential(i ,2);
        }
        return sumSquares;
    }

    int computeDifferenceOfSquares(int input) {

       int squaresum = computeSquareOfSumTo(input);
       int sumsquares = computeSumOfSquaresTo(input);

       int Difference = squaresum - sumsquares;

       return Difference;
    }

    private int exponential(int x, int y){
        if(y==0) {
            return 1;
        }
        else return x*exponential(x,y-1);
    }

}
