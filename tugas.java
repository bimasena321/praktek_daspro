import java.util.*;
public class tugas {

    public void persegi(int a,int b){
        System.out.println("Luas persegi panjang: "+a * b);
    }
    public void keliling_persegi(int a,int b){
        System.out.println("keliling persegi panjang: "+2 * (a + b));
    }
    public void Pvolume(int a,int b,int c){
        System.out.println("Volume persegi panjang: "+a * b * c);
    }
    public void Lsegitiga(int a,int b){
        System.out.println("Luas segitiga: "+1/2 * a * b);
    }
    public void Ksegitiga(int a,int b,int c){
        System.out.println("keliling segitiga: "+a + b + c);
    }
    public void Vsegitiga(int a,int b,int c){
        System.out.println("Volume segitiga: "+1/2 * a * b * b);
    }
    public void Ltrapesium(int a,int b,int c){
        System.out.println("Luas trapesium: "+1/2 * (a + b) * c);
    }
    public void Ktrapesium(int a,int b,int c,int d){
        System.out.println("keliling trapesium: "+a*b + b*c + c*d + d*a);
    }
    public void Vtrapesium(int a,int b,int c){
        System.out.println("Volume trapesium: "+1/2 * (a) * b * c);
    }
    public void LLingkaran(int a){
        System.out.println("Luas lingkaran: "+ Math.PI * Math.pow(a, 2));
    }
    public void Klingkaran(int a){
        System.out.println("keliling lingkaran: "+ 2* Math.PI * a );
    }
    public void Vlingkaran(int a){
        System.out.println("Volume lingkaran: "+ Math.PI * Math.pow(a, 2));
    }
    public void Vbalok(int a, int b,int c){
        System.out.println("Volume balok: "+ a * b * c);
    }
    public void Lbalok(int a, int b, int c){
        System.out.println("Luas balok: "+ 2 * (a * b * c));
    }
    public void Vtabung(int a, int b){
        System.out.println("Volume tabung: "+ Math.PI * Math.pow(a, 2) * b);
    }
    public static void main(String[] args) {
        int pil,p,l,a,t,ti;
        int aa,bb,tt,r,b,ta,pl,pt,lt;
        int rr,tinggi;
        tugas c = new tugas();
        Scanner v = new Scanner(System.in);
        System.out.println("-->");
        pil = v.nextInt();

        switch (pil){
            case 1:
                System.out.println("panjang: ");
                p = v.nextInt();
                System.out.println("lebar: ");
                l = v.nextInt();
                System.out.println("tinggi: ");
                ti = v.nextInt();
                System.out.println("persegi panjang");
                System.out.println("Luas = p x l");
                System.out.printf("hasil: %d",p+" x "+"%d",l);
                c.persegi(p, l);
                System.out.println("keliling: 2 x (pxl)");
                System.out.printf("keliling: 2 x (%dx%d",p+"x",l);
                c.keliling_persegi(p, l);
                System.out.println("Volume: p x l x t");
                System.out.printf("Volume: %d x %d x %d",p+" x "+l,ti);
                c.Pvolume(p, l, ti);
                break;
            case 2:
                System.out.println("alas: ");
                a = v.nextInt();
                System.out.println("tinggi: ");
                t = v.nextInt();
                System.out.println("+-segitiga siku siku-+");
                System.out.println("Luas: 1/2 * a * t");
                System.out.printf("Luas: 1/2 x %d",a+"x"+"%d",t );
                c.Lsegitiga(a, t);
                System.out.println("keliling: ");
                
                break;
            case 3:
                System.out.println("+-Trapesium-+");
                System.out.println("sisi a: ");
                aa = v.nextInt();
                System.out.println("sisi b: ");
                bb = v.nextInt();
                System.out.println("tinggi: ");
                tt = v.nextInt();
                System.out.println("Luas : 1/2 x (a + b) * t");
                System.out.printf("Luas : 1/2 x (%d+%d) x %d",aa,bb,tt);
                c.Ltrapesium(aa, bb, tt);
                break;
            case 4:
                System.out.println("+-Lingkaran-+");
                System.out.println("jari jari: ");
                r = v.nextInt();
                System.out.println("Luas: phi x r x r");
                System.out.printf("Luas: phi x %d x %d",r,r);
                c.LLingkaran(r);
                break;
            case 5:
                System.out.println("+-balok-+");
                System.out.println("pl: ");
                pl = v.nextInt();
                System.out.println("pt: ");
                pt = v.nextInt();
                System.out.println("lt: ");
                lt = v.nextInt();
                System.out.println("Luas: 2 x (pl x pt x lt)");
                System.out.printf("Luas: 2 x (%d x %d x %d)",pl,pt,lt);
                c.Lbalok(pl, pt, lt);
                break;
            case 6:
                System.out.println("+-tabung-+");
                System.out.println("jari jari lingkaran: ");
                rr = v.nextInt();
                System.out.println("tinggi: ");
                tinggi = v.nextInt();
                System.out.println("Volume: phi x r x r x t");
                System.out.printf("Volume: phi x %d x %d x%d",rr,rr,tinggi);
                c.Vtabung(rr, tinggi);
                break;
            default:
                System.err.println("pilihan tidak ada harap masukan pilihan dengan benar");

        }
    }
    private void volume_persegi(int p, int l, int ti) {
    }
}







