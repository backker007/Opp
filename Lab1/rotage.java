public class rotage {
    private int T = 2;
    private int A;
    private int B;
 
    void Sand(int x, int y) {
        this.A = x;
        this.B = y;
    }
 
    void rotateRight90() throws InterruptedException {
 
        int A, B;
        A = this.T;
        A++;
        if (A >= 5) {
            A %= 4;
            if (A == 0) {
                A++;
            }
        }
        this.T = A;
        B = A + 2;
        if (B >= 5) {
            B %= 4;
            if (B == 0) {
                B++;
            }
        }
        System.out.println("Status A Is Side " + A + ",  Status B Is Side " + B);
 
        if (A == 1) {
            if (this.A > this.B) {
                while (this.A >= 1000) {
                    this.A -= 1000;
                    this.B += 1000;
                    Thread.sleep(1000);
                    System.out.println("Sand A Is : " + this.A + "; Sand B Is : " + this.B);
                }
 
            } else {
                System.out.println("Sand Not Flow");
            }
 
        } else if (B == 1) {
            if (this.B >= this.A) {
                while (this.B >= 1000) {
                    this.B -= 1000;
                    this.A += 1000;
                    Thread.sleep(1000);
                    System.out.println("Sand A Is : " + this.A + "; Sand B Is : " + this.B);
                }
 
            } else {
                System.out.println("Sand Not Flow");
            }
        } else {
            System.out.println("Sand Not Flow");
        }
    }
 
    void rotateRight180() throws InterruptedException {
        int A, B;
        A = this.T;
        A += 2;
        if (A >= 5) {
            A %= 4;
            if (A == 0) {
                A++;
            }
        }
        this.T = A;
        B = A + 2;
        if (B >= 5) {
            B %= 4;
            if (B == 0) {
                B++;
            }
        }
        System.out.println("Status A Is Side " + A + ",  Status B Is Side " + B);
        if (A == 1) {
            if (this.A > this.B) {
                while (this.A >= 1000) {
                    this.A -= 1000;
                    this.B += 1000;
                    Thread.sleep(1000);
                    System.out.println("Sand A Is : " + this.A + "; Sand B Is : " + this.B);
                }
 
            } else {
                System.out.println("Sand Not Flow");
            }
 
        } else if (B == 1) {
            if (this.B >= this.A) {
                while (this.B >= 1000) {
                    this.B -= 1000;
                    this.A += 1000;
                    Thread.sleep(1000);
                    System.out.println("Sand A Is : " + this.A + "; Sand B Is : " + this.B);
                }
 
            } else {
                System.out.println("Sand Not Flow");
            }
        } else {
            System.out.println("Sand Not Flow");
        }
    }
}
