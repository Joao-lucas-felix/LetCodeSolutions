class Solution {
public:
    int mySqrt(int x) {
              if (x ==0) return 0;
        if (x == 1) return 1;
        int init = 1, end = x, response = 0;

        while (init <= end) {
            int mid = init + (end - init) / 2;  // Correção aqui para evitar overflow
            if (mid <= x / mid) {  // Evita overflow em mid*mid
                response = mid;
                init = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return response;  
    }
};