public class Primos {
    public boolean esPrimo(int num) {
        int cont = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    cont++;

                    if (cont > 2) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }

        /* NO LO HICE YO, ESTA ES UNA MANERA EFICIENTE

        Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }
        2 and 3 are prime numbers
        if (num == 2 || num == 3) {
            return true;
        }
        Eliminate even numbers and multiples of 3
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        Check divisibility up to the square root of the number
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
        */
    }
}
