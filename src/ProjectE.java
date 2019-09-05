public class ProjectE {
    public static void main(String[] args) {

        int[] a = interpret("759564174782183587102004824765190123750334880277730763679965042806167092414126568340807033414872334732371694295371446525439152975114701133287773177839681757917152381714914358502729486366046889536730731669874031046298272309709873933853600423");
        int count = 0;
        for (int i = 0; i < 120; i++) {
            int h = Math.max(a[i+i], a[i+i+1]);
            System.out.println(h);
            count+=h;
            if (h==i+i){
                i=i+i;
            }
            else{
                i=i+i+1;
            }
        }
        System.out.println(count);
        
    }

    public static int[] interpret(String a){
        int[] n = new int[a.length()/2];
        int c = 0;
        for (int i = 0; i < n.length*2; i+=2) {
            n[c] = ((((int)a.charAt(i))-48)*10) + (((int)a.charAt(i+1))-48);
            c++;
        }
        return n;
    }
}
