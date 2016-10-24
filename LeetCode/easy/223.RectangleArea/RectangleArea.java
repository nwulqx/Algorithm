public class RectangleArea{
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int sum = (C-A)*(D-B)+(G-E)*(H-F);
        int overx1 = Math.max(A,E);
        int overy1 = Math.max(B,F);

        int overx2 = Math.min(C,G);
        int overy2 = Math.min(D,H);
        if(overx2>overx1 && overy2>overy1) return sum-(overx2-overx1)*(overy2-overy1);
        return sum;
    }
}