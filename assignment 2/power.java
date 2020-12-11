int power(int m, int n) {
    int p;
    if (n == 1)
        return m;
    p = power(m, n / 2);
    if (n % 2 == 1) 
        return p * p * m;
    else
        return p * p;
}