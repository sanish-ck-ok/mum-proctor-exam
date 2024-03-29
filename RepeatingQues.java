// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
  public static void main(String[] args) {
      // System.out.println(primeCount(1,11));
      // System.out.println(isBalanced(new int[]{2,11,10,1}));
      // System.out.println(isPrime(12));
      // System.out.println(isPrimeProduct(77));
      // System.out.println(isCentered(new int[]{1,2}));
      // System.out.println(hasKSmallFactors(7, 14));
      // System.out.println(minDistance(new int[]{7,11,13,77,91,143}));
      // System.out.println(fill(new int[]{1,2,3,5,9,12,-2,-1}, 3, 10));
      // System.out.println(isNice(new int[]{2, 10, 3, 9}));
      // System.out.println(isBunker(new int[]{3,7, 2, 8, 12}));
      // System.out.println(isContinuousFactored(new int[]{}))
      // System.out.println(isTriple(new int[]{2, 1, 2, 1, 3, 1, 3, 2, 2}));
      // System.out.println(isFibonacci(21));
      // System.out.println(isBean(new int[]{2,2,5,11,23}));
      // System.out.println(isBean1(new int[]{3, 4, 2, 3, 3}));
      // System.out.println(isBalancedNeg(new int[]{2,-3,3,4,4,-2}));
      // System.out.println(isEvenSubset(18,32));
      // System.out.println(isTwinoid1(new int [] {1, 1, 1, 2, 2}));
      // System.out.println(isHollow(new int []{1,2,3,3,0,0,3,4,5,1}));
      // System.out.println(isSub(new int[]{12, 6, 3, 2}));
      // System.out.println(isEvenSpaced(new int[]{200, 10, 151, 160}));
      // System.out.println(isMeera(new int[]{3, 5, -2}));
      // System.out.println(countDigit(33331,2));
      // System.out.println(goodSpread(new int[]{3,1,1,3, 5, 5,3}));
      // System.out.println(factorTwoCount(48));
      // System.out.println(sumIsPower(new int[]{8,8,8,8}));
      // System.out.println(pow(2,5));
      // System.out.println(isMeeraNonTrivialFactor(21));
      // System.out.println(isSym(new int[]{2, 7, 8, 9, 11, 13, 10}));
      // System.out.println(isBean9(new int[]{4, 7, 16}));
      // System.out.println(minDistanceFactor(1001));
      // System.out.println(isFancy(1));
      // System.out.println(isPaired(new int[]{17, 6, 1, 4}));
      // System.out.println(contain0Prime(new int[]{3, 7, 0, 8, 0, 5}));
  }

  static int contain0Prime(int[] a) {
      int contain0 = 0;
      int hasPrime = 0;
      for(int i = 0; i <a.length; i++){
          if(a[i] == 0){
              contain0 = 1;
              break;
          }
      }
      for(int i = 0; i <a.length; i++){
          if(isPrime(a[i])){
              hasPrime = 1;
              break;
          }
      }

      if(contain0 == 1 && hasPrime == 1){
          return 1;
      }else
         return 0;

  }

  static int isPaired(int[ ] a){
      int isPairedEven = 0;
      int isPairedOdd = 0;
      for(int i = 0; i<a.length; i+=2){
          if(a[i]%2 == 0){
              return 0;
          }else{
              isPairedEven = 1;
          }
      }

      for(int i = 1; i<a.length; i+=2){
          if(a[i]%2 != 0){
              return 0;
          }else{
              isPairedOdd = 1;
          }
      }

      if(isPairedEven == 1 && isPairedOdd == 1){
          return 1;
      }else {
          return 0;
      }

  }


  static int isFancy(int n){
      int isFancy = 1;
      int previous = 1;
      int pPrevious = 1;
      int currentValue = 0;

      for(int i = 0; i < n/2; i++){
          currentValue = 3*previous + 2*pPrevious;
          if(currentValue == n){
              isFancy = 1;
              break;
          }else {
              isFancy = 0;
              pPrevious = previous;
              previous = currentValue;
          }
      }
      return isFancy;

  }

  static int minDistanceFactor(int n){
      int j=0;
      int [] a = new int[100];
      for(int i =2; i<n; i++){
          if(n%i==0){
              // System.out.println(i);
              a[j] = i;
              j++;
          }
      }
      int min = minDistance(a);
      return min;

  }

  static int isBean9(int[] a) {
      int isBean = 0;
      for(int i = 0; i < a.length; i++){
          if(a[i] == 9 || a[i] == 7){
              if(a[i] == 9) {
                  for(int k = 0; k < a.length; k++){
                      if(a[k] == 13){
                          return 1;
                      }else
                        return 0;
                  }
              }
              else if(a[i] == 7){
                   for(int j = 0; j < a.length; j++){
                      if(a[j] != 16){
                          return 1;
                      }else
                        return 0;
                  }
              }
          }
      }
      return isBean;
  }

  static int isSym(int [ ] a){
      int l = a.length;
      int[] ltrArr = new int[a.length];
      int[] rtlArr = new int[a.length];
      for(int i = 0; i < a.length; i++){
          if(a[i] % 2 == 0)
             ltrArr[i] = 1;
          else
             ltrArr[i] = 0;
      }
      //Reverse array
      for (int i = 0; i < a.length; i++) {
          rtlArr[l - 1] = ltrArr[i];
          l = l - 1;
      }

      int count = 0;
      for(int i =0; i< a.length;i++){
           for(int j =0; j< a.length;j++){
            if(ltrArr[i] == rtlArr[j] && i==j){
                 count++;
                 break;
            }
          }
      }
      // return 0;
      if(count == a.length)
        return 1;
      else
        return 0;
  }

  static int isMeeraNonTrivialFactor(int n) {
      int count = 0;
      for(int i = 2; i < n; i++){
          if(n % i == 0){
              count++;
          }
      }
      if(n%count == 0)
        return 1;
      else
        return 0;
  }

  static int sumIsPower(int[] a){
      int sumElement = 0;
      int powerValue = 0;
      for(int i = 0; i< a.length; i++){
          sumElement += a[i];
      }
      int value = sumElement;
      while(value>0){
          if(value%2 == 0){
              powerValue++;
          }
          value = value/2;
      }
      if(sumElement == pow(2,powerValue)){
          return 1;
      }else {
         return 0;
      }
  }

  static int pow(int base, int pow) {
      int sum = 1;
      for(int i = 0; i < pow; i++){
          sum = sum * base;
      }
      return sum;
  }

  static int factorTwoCount(int n){
      int count = 0;
      while(n>0){
          if(n%2 == 0){
              count++;
          }
          n=n/2;
      }
      return count;
  }

  static int goodSpread(int[ ] a){
      int count = 0;
      int isGoodSpread = 0;
      for(int i = 0; i<a.length; i++){
          count = 0;
          for(int j=0; j<a.length;j++){
              if(a[i] == a[j]){
                  count++;
              }
          }
          if(count>3)
            return 0;
      }
      return 1;
  }

  static int countDigit(int n, int digit){
      int count = 0;
      while(n>0){
          int last = n%10;
          if(last == digit){
              count++;
          }
          n=n/10;
      }
      return count;
  }

  static int isMeera(int [ ] a){
      int count = 0;
      for(int i = 0; i<a.length; i++){
          for(int j=0; j<a.length;j++){
              if(a[i] == 2*a[j]){
                  count++;
              }
          }
      }
      if(count>0)
        return 0;
      else
        return 1;
  }

  static int isEvenSpaced(int[] a){
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for(int i = 0; i < a.length; i++){
          if(a[i] > max)
             max = a[i];
      }
      for(int i = 0; i < a.length; i++){
          if(a[i] < min)
             min = a[i];
      }

      if((max-min)%2 == 0)
        return 1;
      else
        return 0;

  }

  static int isSub(int [ ] a){
      int sumAfterElement = 0;
      int isSub=0;
      for(int i = 0; i<a.length; i++){
          for(int j = i+1; j< a.length; j++){
              sumAfterElement += a[j];
          }
          if(a[i]>sumAfterElement)
            isSub = 1;
          else
            return 0;
          sumAfterElement = 0;
      }
      return isSub;

  }

  static int isHollow(int[ ] a){
      int count = 0;
      for(int i =0;i<a.length;i++){
          if(a[i] == 0 && (a[i+1] == 0 || a[i-1] == 0))
            count++;
      }
      System.out.println(count);
      if(count>=3){
              int startIndex = 0, endIndex = 0;
              int startPositive = 0;
              int endPositive = 0;
              for(int i = 0; i<a.length; i++){
                  if(a[i] == 0){
                      endIndex = i;
                      System.out.println(i);
                      break;
                  }
              }
              for(int i = a.length-1; i>=0; i--){
                  if(a[i] == 0){
                      startIndex = i;
                      System.out.println(i);
                      break;
                  }
              }
              for(int j = 0; j<endIndex;j++){
                  if(a[j]>0)
                    startPositive++;
              }
              for(int i = startIndex; i<a.length;i++){
                  if(a[i]>0)
                    endPositive++;
              }
              if(startPositive == endPositive){
                  return 1;
              }else {
                  return 0;
              }
      }else {
          return 0;
      }
  }

  static int isTwinoid1 (int [] a){
      int countEven=0;
      int isTwin = 0;
      for(int i = 0; i < a.length; i++) {
          if(a[i] % 2 == 0){
              countEven ++;
          }
      }
      if(countEven == 2) {
          for(int i = 0; i < a.length-1; i++) {
              if(a[i]%2==0 && a[i+1]%2==0) {
                  // isTwin = 1;
                  return 1;
              }
          }
      }else {
          return 0;
      }
      return 0;
  }

  static int isTwinoid (int [] a){
      boolean isTwin = false;
      int count = 0;
      for(int i = 0; i < a.length; i++) {
          if(a[i] % 2 == 0 && a[i +1] % 2 == 0){
              isTwin = true;
              count++;
          }else if(a[i]%2 == 0){
              count++;
          }
      }
      if(isTwin && count ==2){
          return 1;
      }
      return 0;
  }

  static int isEvenSubset(int m, int n) {
      if(m%2 !=0) return 0;
      for(int i = 2; i<m/2; i++) {
          if(m%i == 0 && i%2==0) {
              if(n%i != 0){
                  return 0;
              }
          }
      }
      return 1;
  }

  static int isBalancedNeg(int[] a) {
      int isBalanced = 0;
      for(int i=0;i<a.length;i++){
          for(int j=0;j<a.length;j++){
              if(a[i] == -a[j]){
                  isBalanced++;
                  break;
              }
          }
      }
      if(isBalanced == a.length) {
          return 1;
      }else {
          return 0;
      }

  }

  static int isBean(int[] a) {
      int isBean = 0;

      for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a.length; j++) {
              if (a[i] == 2*a[j] || a[i] == 2*a[j] + 1 || a[i] == a[j]/2) {
                  isBean = 1;
                  break;
              }
          }
          return isBean;
      }
      return isBean;
  }

  static int isBean1(int[] a) {
      int isBean=0;
      for(int i=0; i< a.length; i++){
          for(int j=0; j<a.length;j++){
              if(a[i]== a[j]-1 || a[i] == a[j]+1){
                  isBean++;
                  break;
              }
          }
      }
      if(isBean == a.length) {
          return 1;
      }else{
          return 0;
      }
  }

  static int isFibonacci (int n) {
      int first = 0, second =1, sum=0;
      while(n>sum){
          sum = first+second;
          first = second;
          second = sum;
      }
      if(sum == n) {
          return 1;
      }else {
          return 0;
      }
  }

  static int isTriple (int[ ] a){
      int isTriple = 1;
      int tripleCount=0;
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(a[i] == a[j])
               tripleCount++;
        }
        if(tripleCount == 3){
          isTriple =1;
        }else{
            isTriple = 0;
            break;
        }
      }
      return isTriple;
  }

  static int isBunker(int[] arr) {
      int isBunker = 0;
      int len = arr.length;
      for(int i=0;i<len;i++){
          if(arr[i] == 1){
              for(int j=0; j<len;j++){
                  if(isPrime(arr[j])){
                      isBunker = 1;
                  }
              }
          }else{
              isBunker = 0;
          }
      }
      return isBunker;
  }

  static int isNice(int[] a) {
      int isNice = 0;
      for(int i = 0; i<a.length;i++)
        for(int j=0; j<a.length; j++){
            if(a[i] == a[j]+1 || a[i] == a[j] -1){
                isNice++;
            }
        }
      if(isNice == a.length){
          return 1;
      }else {
          return 0;
      }
  }

  static int minDistance(int[] arr) {
      int minDist = Integer.MAX_VALUE;
      for(int i=1;i<arr.length;i++)
        for(int j=0;j<i;j++){
            int dist = arr[i] - arr[j];
            if(dist < minDist){
                minDist = dist;
            }
        }
       return minDist;
  }

  static int[] fill(int[ ] arr, int k, int n){
      if (k<0 || n<0 || k==0) return null;
      int[] newArr = new int[n];
      for(int i = 0; i < n; i++){
          newArr[i] = arr[i%k];
      }
      return (newArr);
  }

  static boolean hasKSmallFactors(int k, int n){
      if(k<0 || n<0) return false;
      for(int i=1; i<=n; i++){
          if(n%i==0){
              if((n/i)<k&&i<k)
                return true;
          }
      }
      return false;
  }

  static int isCentered(int[ ] a) {
      if(a.length ==1) return 1;
      if(a.length<0) return 0;
      int midTerm = a.length/2;
      int midItem = a[midTerm];
      for(int i=0; i<a.length; i++) {
          if(i!=midTerm && midItem >= a[i]) {
              return 0;
          }
      }
      return 1;
  }

  static int isPrimeProduct(int n){
      for(int i=2; i<n; i++){
          if(n%i == 0){
              if(isPrime(n/i) && isPrime(i)){
                  return 1;
              }
          }
      }
      return 0;
  }

  static int isBalanced(int[ ] a) {
      int valid = 0;
      for(int i=0; i<a.length;i++){
          if(i%2 == 0){
              if(a[i]%2 == 0){
                  valid = 1;
              }else {
                  valid = 0;
                  break;
              }
          }else {
              if(a[i]%2 != 0){
                  valid = 1;
              }else {
                  valid = 0;
                  break;
              }
          }
      }
      return valid;
  }

  static boolean isPrime(int n) {
      boolean isPrime = false;
      if(n>1){
          isPrime =true;
          for(int j=2;j*2<=n;j++){
              if(n%j==0){
                  isPrime = false;
                  break;
              }
          }
      }
      return isPrime;
  }

  static int primeCount(int start, int end) {
      int primeCount = 0;
      for(int i=start; i<=end; i++){
          if(i>1){
              boolean isPrime = true;
              for(int j=2;j*2<=i;j++){
                  if(i%j==0){
                      isPrime = false;
                      break;
                  }
              }
              if(isPrime)
                primeCount++;
          }
      }
      return primeCount;
  }

}
