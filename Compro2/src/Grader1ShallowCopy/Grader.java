
package Grader1ShallowCopy;

public class Grader {
    String name;
    String desc;
    int[] pts;
    String[] sols;
    
    Grader(String name, String desc, int[] pts, String[] sols){
        this.name = name;
        this.desc = desc;
        this.pts = pts;
        this.sols = sols;
    }
    
    public static void main(String args[]) {
        int[] pts = {5, 5, 5, 10, 10};
        String[] sols = {"Java", "C", "Python", "PHP", "R"};
        Grader gr = new Grader("Vote", "Count ballots", pts, sols);
        System.out.println(gr.name);
        System.out.println(gr.desc);
        System.out.println(gr.pts[4]);
        System.out.println(gr.sols[4]);

        pts[3] = 7;
        sols[4] = "Kotlin";
        System.out.println(gr.pts[3]);
        System.out.println(gr.sols[4]);
    }
}
